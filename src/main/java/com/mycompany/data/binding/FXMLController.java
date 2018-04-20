package com.mycompany.data.binding;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
     @FXML
    private TextField usernameInput;

    @FXML
    private Label usernameOutput;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        usernameOutput.textProperty().bind(usernameInput.textProperty());
        usernameOutput.textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
        });
    }    
}
