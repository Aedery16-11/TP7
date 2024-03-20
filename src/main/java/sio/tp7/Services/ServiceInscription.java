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
    public void InsererInscription(String idFormation, String idAgent)
    {

    }

    public void ModifierPresence(String idFormation, String idAgent, boolean present)
    {

    }
}
