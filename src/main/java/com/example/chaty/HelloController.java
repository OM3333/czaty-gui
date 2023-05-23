package com.example.chaty;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField textField;

    @FXML
    private TextArea textArea;

    private ConnectionThread connectionThread;

    public HelloController(ConnectionThread connectionThread){
        this.connectionThread = connectionThread;
    }

    public void send(){
        textArea.appendText(textField.getText()+"\n");
        this.connectionThread.broadcast(textField.getText());
        textField.clear();

    }


}