package sio.tp7;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import sio.tp7.Model.AgentPresent;
import sio.tp7.Model.Formation;
import sio.tp7.Services.ServiceAgent;
import sio.tp7.Services.ServiceFormation;
import sio.tp7.Services.ServiceInscription;

import java.net.URL;
import java.util.ResourceBundle;

public class PresenceController implements Initializable
{
    @javafx.fxml.FXML
    private TableColumn tcNomFormation;
    @javafx.fxml.FXML
    private TableColumn tcNumeroFormation;
    @javafx.fxml.FXML
    private TableView<Formation> tvFormations;
    @javafx.fxml.FXML
    private TableView<AgentPresent> tvAgentsInscrits;
    @javafx.fxml.FXML
    private Button btnValider;
    @javafx.fxml.FXML
    private TableColumn tcNomAgentInscrit;
    @javafx.fxml.FXML
    private TableColumn tcNumeroAgentInscrit;
    @javafx.fxml.FXML
    private TableColumn tcPrenomAgentInscrit;
    @javafx.fxml.FXML
    private TableColumn<AgentPresent,Boolean> tcPresenceAgentInscrit;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }

    @javafx.fxml.FXML
    public void tvFormationsClicked(Event event)
    {

    }

    @javafx.fxml.FXML
    public void btnValiderClicked(Event event)
    {

    }
}