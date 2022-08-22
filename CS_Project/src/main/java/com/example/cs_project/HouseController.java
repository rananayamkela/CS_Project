package com.example.cs_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HouseController {
    @FXML
    private Label welcomeText;
    @FXML
    private  Label sLabel;
    @FXML
    private TextField HNtext; // House name textfield
    @FXML
    private TextField HCtext; // House code textfield
    public  String houseName = "Default";
    public String houseCode = "1234";

    public void connecting(ActionEvent event) {
        if( (HCtext.getText().equals(houseCode)) && (HNtext.getText().equals(houseName)) )
        {
            sLabel.setText("Connected");
        }
        else
        {
            sLabel.setText("Incorrect house or house code, please try again!");
        }
    }
    public void clearing(ActionEvent event) {
       HCtext.setText("");
       HNtext.setText("");
       sLabel.setText("Enter details to connect to a house");
    }
}