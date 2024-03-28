package sio.tp7.Services;



import sio.tp7.Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceInscription
{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public ServiceInscription()
    {
        cnx = ConnexionBDD.getCnx();
    }
    public void InsererInscription(String idFormation, String idAgent) throws SQLException {
        ps = cnx.prepareStatement("insert into inscription values (?, ?, 0)");
        ps.setString(1, idFormation);
        ps.setString(2, idAgent);
//      ps.setInt(3, 0); booléen, on fait ça si on a mis un troisième ? mais là ion met juste 0mais là ion met juste 0 et on aurait dû ajouter un paramètre
        ps.executeUpdate(); //on fait un executeQuery quand on fait un select uniquement là y'a de select
        ps.close();
    }

    public void ModifierPresence(String idFormation, String idAgent, boolean present) throws SQLException {
        if (present)
        {
            ps = cnx.prepareStatement("update inscription set presence 1 where numeroFormation = ? and codeAgent = ?");
        }
        else
        {
            ps = cnx.prepareStatement("update inscription set presence 0 where numeroFormation = ? and codeAgent = ?");
        }
        ps.setString(1, idFormation);
        ps.setString(2, idAgent);
        ps.executeUpdate();
        ps.close();

    }
}
