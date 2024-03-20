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

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        try {
            serviceFormation = new ServiceFormation();
            serviceActivite = new ServiceActivite();
            tcNomActivite.setCellValueFactory(new PropertyValueFactory<>("nomActivite"));
            tcNumeroActivite.setCellValueFactory(new PropertyValueFactory<>("idActivite"));
            tvActivites.setItems(FXCollections.observableArrayList(serviceActivite.GetAllActivites()));
            tcNomFormation.setCellValueFactory(new PropertyValueFactory<>("nomFormation"));
            tcNumeroFormation.setCellValueFactory(new PropertyValueFactory<>("idFormation"));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @javafx.fxml.FXML
    public void btnInscriptionClicked(Event event) throws SQLException {

    }
    @javafx.fxml.FXML
    public void tvFormationsClicked(Event event)
    {

    }

    @javafx.fxml.FXML
    public void tvActivitesClicked(Event event) throws SQLException {
        String formationSelectionnee = tvFormations.getSelectionModel().getSelectedItem().getNomFormation();

        tvFormations.setItems(FXCollections.observableArrayList(serviceFormation.GetAllFormations()));
    }
}