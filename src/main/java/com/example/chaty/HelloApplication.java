package com.example.chaty;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ConnectionThread connectionThread = new ConnectionThread("localhost",5000);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setControllerFactory((controllerClass) -> {
            return new HelloController(connectionThread);
        });
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        connectionThread.start();


        TextInputDialog textInputDialog = new TextInputDialog();
        textInputDialog.setTitle("Podaj login");
        textInputDialog.setContentText("poadj");
        textInputDialog.setHeaderText("juz");

        Optional<String> login = textInputDialog.showAndWait();
        if(login.isPresent()){
            connectionThread.login(login.get());
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }



    }

    public static void main(String[] args) {
        launch();
    }
}