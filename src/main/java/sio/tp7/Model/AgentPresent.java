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
    private Boolean presence;

    public Boolean isPresence() {
        return presence;
    }

    public AgentPresent(String idAgent, String nomAgent, String prenomAgent, Boolean presence) {
        this.idAgent = idAgent;
        this.nomAgent = nomAgent;
        this.prenomAgent = prenomAgent;
        this.presence = presence;
    }

    public String getPrenomAgent() {
        return prenomAgent;
    }

    public String getIdAgent() {
        return idAgent;
    }

    public String getNomAgent() {
        return nomAgent;
    }}