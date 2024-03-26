package sio.tp7.Model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AgentPresent
{
    private String idAgent;
    private String nomAgent;
    private String prenomAgent;
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    private ArrayList<AgentPresent> lesPresents;

    public AgentPresent(String idAgent, String nomAgent, String prenomAgent) {
        this.idAgent = idAgent;
        this.nomAgent = nomAgent;
        this.prenomAgent = prenomAgent;
    }

    public String getIdAgent() {
        return idAgent;
    }

    public String getNomAgent() {
        return nomAgent;
    }}
//    public boolean isPresent() throws SQLException {
      //  lesPresents = new ArrayList<>();
//        for (AgentPresent agentPresent : lesPresents)
//        {
//            ps = cnx.prepareStatement("select agent.code, agent.nom, agent.prenom from agent WHERE agent.code NOT IN(select inscription.codeAgent from inscription where inscription.numeroFormation = ?)");
//            ps.setString(1, idFormation);
//            rs = ps.executeQuery();
//            while (rs.next())
//            {
//                Agent agent =  new Agent(rs.getString(1), rs.getString(2), rs.getString(3));
//                lesAgents.add(agent);
//            }
//            ps.close();
//            rs.close();
//
//        }
//        return true;
//    }
//
//    public String getPrenomAgent() {
//        return prenomAgent;
//    }
//}
