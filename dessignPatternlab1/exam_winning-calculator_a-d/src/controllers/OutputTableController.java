package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import patternDessign.IObserver;
import state.StateStore;


public class OutputTableController implements Initializable, IObserver {

    @FXML
    private Label lblWinning;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
     
    	this.updateWinning();
    	StateStore.getInstance().register(this);
    }

	@Override
	public void update() {
		this.updateWinning();
	}

 private final void updateWinning() {
	 this.lblWinning.setText(Integer.toString(StateStore.getInstance().getState().getOutWinningCalc()));
 }
	
    
}
