package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;


public class MainWindowController implements Initializable {
    
    @FXML
    private Accordion accord;
    @FXML
    private TitledPane pane1,pane2,pane3;
    @FXML
    private AnchorPane centerStage;
    
    @FXML
    private void showDiagram(ActionEvent event) {
        populateCenterStage("/views/output_diagram.fxml");
    }
    @FXML
    private void showTable(ActionEvent event) {
        populateCenterStage("/views/output_table.fxml");
    }
    
    private void populateCenterStage(String view) {
        try {
            ObservableList<Node> children = centerStage.getChildren();
            if(children.size() > 0) {
                centerStage.getChildren().remove(0);
            }
            
            children.add(FXMLLoader.load(getClass().getResource(view)));
        } catch (IOException ex) {
            Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            pane1.setContent(FXMLLoader.load(getClass().getResource("/views/input_investment.fxml")));
            pane2.setContent(FXMLLoader.load(getClass().getResource("/views/input_settings.fxml")));
            populateCenterStage("/views/output_diagram.fxml");
        } catch (IOException ex) {
            Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
        }
        accord.setExpandedPane(pane1);
        
    }    
    
}
