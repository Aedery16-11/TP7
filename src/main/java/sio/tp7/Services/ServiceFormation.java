package sio.tp7.Services;



import sio.tp7.Model.Formation;
import sio.tp7.Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceFormation
{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public ServiceFormation()
    {
        cnx = ConnexionBDD.getCnx();
    }

    public ArrayList<Formation> GetAllFormationsByIdActivite(int idActivite)
    {
        ArrayList<Formation> lesFormations = new ArrayList<>();

        return lesFormations;
    }

    public ArrayList<Formation> GetAllFormations() throws SQLException {
        ArrayList<Formation> lesFormations = new ArrayList<>();
        ps = cnx.prepareStatement("select * from formations");
        rs = ps.executeQuery();
        while (rs.next())
        {
            Formation formation = new Formation(rs.getString(1), rs.getString(3));
            lesFormations.add(formation);
        }
        return lesFormations;
    }
}
