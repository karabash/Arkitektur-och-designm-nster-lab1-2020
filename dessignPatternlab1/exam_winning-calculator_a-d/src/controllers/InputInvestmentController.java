
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import state.StateStore;


public class InputInvestmentController implements Initializable {
      
    @FXML
    private Slider slidMoney;
    @FXML
    private Slider slidTime;
    @FXML
    private Label lblMoneyValue;
    @FXML
    private Label lblTimeValue;
    
    @FXML
    private void onMoneyDragDone() {
        StateStore.getInstance().updateInValues("money", (int) slidMoney.getValue());
        lblMoneyValue.setText(String.format("%.0f", slidMoney.getValue()));
    }
    @FXML
    private void onTimeDragDone() {
        StateStore.getInstance().updateInValues("time", (int) slidTime.getValue());
        lblTimeValue.setText(String.format("%.0f", slidTime.getValue()));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    } 
    
}
