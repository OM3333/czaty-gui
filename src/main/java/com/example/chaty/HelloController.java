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

    @FXML
    protected void onSendButtonClick() {
        textArea.appendText(textField.getText());
    }
}