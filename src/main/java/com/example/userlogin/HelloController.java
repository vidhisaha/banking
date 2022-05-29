package com.example.userlogin;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Register.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Banking Application");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onSecondButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Register.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Register");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onThirdButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("createnewacc.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("New Account");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onFourthButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Services");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onFifthButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("balance.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Account Balance");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onSixthButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("deposit.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Deposit");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onSeventhButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("withdrawal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Withdrawal");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onEighthButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("deposit view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Deposit");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onNinethButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("withdrawal view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Withdrawal");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onTenthButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("password.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Forgot Password");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onEleventhButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("password view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Forgot Password");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onFourteenthButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("statement.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Account Statement");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onThirteenButtonClick() throws IOException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("terms.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Terms and Conditions");
        stage.setScene(scene);
        stage.show();
    }

}




