package sio.tp7.Services;



import sio.tp7.Model.Agent;
import sio.tp7.Model.AgentPresent;
import sio.tp7.Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceAgent {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public ServiceAgent() {
        cnx = ConnexionBDD.getCnx();
    }

    public ArrayList<Agent> GetAllAgentsNonInscritsFormation(String idFormation) {
        ArrayList<Agent> lesAgents = new ArrayList<>();

        return lesAgents;
    }

    public ArrayList<AgentPresent> GetAllAgentsInscritsFormation(String idFormation) {
        ArrayList<AgentPresent> lesAgents = new ArrayList<>();

        return lesAgents;
    }
}
