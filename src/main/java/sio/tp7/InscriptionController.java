package sio.tp7;

import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sio.tp7.Model.Activite;
import sio.tp7.Model.Agent;
import sio.tp7.Model.Formation;
import sio.tp7.Services.ServiceActivite;
import sio.tp7.Services.ServiceAgent;
import sio.tp7.Services.ServiceFormation;
import sio.tp7.Services.ServiceInscription;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class InscriptionController implements Initializable
{

    @javafx.fxml.FXML
    private TableColumn tcNomFormation;
    @javafx.fxml.FXML
    private TableColumn tcNumeroAgentNonInscrit;
    @javafx.fxml.FXML
    private TableColumn tcNumeroFormation;
    @javafx.fxml.FXML
    private TableView<Formation> tvFormations;
    @javafx.fxml.FXML
    private TableColumn tcNomAgentNonInscrit;
    @javafx.fxml.FXML
    private TableColumn tcPrenomAgentNonInscrit;
    @javafx.fxml.FXML
    private TableView<Activite> tvActivites;
    @javafx.fxml.FXML
    private TableColumn tcNumeroActivite;
    @javafx.fxml.FXML
    private TableColumn tcNomActivite;
    @javafx.fxml.FXML
    private Button btnInscription;
    @javafx.fxml.FXML
    private TableView<Agent> tvAgentsNonInscrits;
    private ServiceActivite serviceActivite;
    private  ServiceFormation serviceFormation;
    private ServiceAgent serviceAgent;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        try {
            serviceAgent = new ServiceAgent();
            serviceFormation = new ServiceFormation();
            serviceActivite = new ServiceActivite();
            tcNomActivite.setCellValueFactory(new PropertyValueFactory<>("nomActivite"));
            tcNumeroActivite.setCellValueFactory(new PropertyValueFactory<>("idActivite"));
            tvActivites.setItems(FXCollections.observableArrayList(serviceActivite.GetAllActivites()));
            tcNomFormation.setCellValueFactory(new PropertyValueFactory<>("nomFormation"));
            tcNumeroFormation.setCellValueFactory(new PropertyValueFactory<>("idFormation"));
            tcNomAgentNonInscrit.setCellValueFactory(new PropertyValueFactory<>("nomAgent"));
            tcPrenomAgentNonInscrit.setCellValueFactory(new PropertyValueFactory<>("prenomAgent"));
            tcNumeroAgentNonInscrit.setCellValueFactory(new PropertyValueFactory<>("idAgent"));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @javafx.fxml.FXML
    public void btnInscriptionClicked(Event event) throws SQLException {
        //modifier la bdd pour que les gens qui ne soient pas inscrits le soient, donc d'abord re comprendre comment ils sont inscrits puis
        //comprendre le rapport avec tout ce qui est vide


    }
    @javafx.fxml.FXML
    public void tvFormationsClicked(Event event) throws SQLException {
        String formationSelectionnee = tvFormations.getSelectionModel().getSelectedItem().getIdFormation();
        tvAgentsNonInscrits.setItems(FXCollections.observableArrayList(serviceAgent.GetAllAgentsNonInscritsFormation(formationSelectionnee)));
    }

    @javafx.fxml.FXML
    public void tvActivitesClicked(Event event) throws SQLException {
        int numeroActivite = tvActivites.getSelectionModel().getSelectedItem().getIdActivite();
        tvFormations.setItems(FXCollections.observableArrayList(serviceFormation.GetAllFormationsByIdActivite(numeroActivite)));
    }
}