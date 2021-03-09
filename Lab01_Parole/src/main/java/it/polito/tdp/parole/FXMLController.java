package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;
   
    @FXML
    private TextField txtTempo;

    @FXML
    private Button btnInserisci;
    
    @FXML
    private Button btnCancella;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	long start = System.nanoTime();
    	String parola = txtParola.getText();
    	elenco.addParola(parola);
    	String lista = "";
    	for(String p : elenco.getElenco()) {
    		lista += p+"\n";
    	}
    	txtParola.setText("");
    	txtResult.setText(lista);
    	long stop = System.nanoTime();
    	long t = stop - start;
    	String tempo = ""+t+" nanosecondi";
    	txtTempo.setText(tempo);
    }

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	long start = System.nanoTime();
    	elenco.reset();
    	txtResult.setText("");
    	long stop = System.nanoTime();
    	long t = stop - start;
    	String tempo = ""+t+" nanosecondi";
    	txtTempo.setText(tempo);
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	long start = System.nanoTime();
    	String parola = txtResult.getSelectedText();
    	elenco.cancella(parola);
    	String lista = "";
    	for(String p : elenco.getElenco()) {
    		lista += p+"\n";
    	}
    	txtParola.setText("");
    	txtResult.setText(lista);
    	long stop = System.nanoTime();
    	long t = stop - start;
    	String tempo = ""+t+" nanosecondi";
    	txtTempo.setText(tempo);
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco = new Parole() ;
    }
}
