/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author BNeires
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button btnVirgula;
    @FXML
    private Button btnResultado;
    @FXML
    private Button btnAdisao;
    @FXML
    private Button btnDividir;
    @FXML
    private Button btnSubtraçao;
    @FXML
    private Button btnMutiplicar;
    @FXML
    private Button btnApagar;
    @FXML
    private Button btnUm;
    @FXML
    private Button btnDois;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnQuatro;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnSete;
    @FXML
    private Button btnOito;
    @FXML
    private Button btnNove;
    @FXML
    private Button btnZero;
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
