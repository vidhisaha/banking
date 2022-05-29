package com.example.userlogin;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class bankData {

    @FXML
    public TableView<DataModel> table; // fx:id of Table

    @FXML
    public TableColumn<DataModel, String> slno;

    @FXML
    public TableColumn<DataModel, String> date;

    @FXML
    public TableColumn<DataModel, String> description;

    @FXML
    public TableColumn<DataModel, String> debit;

    @FXML
    public TableColumn<DataModel, String> credit;

    @FXML
    public TableColumn<DataModel, String> balance;


//    public bankData(String sl_no, String date, String description, String debit, String credit, String balance) {
//    }

//    @FXML
//    protected void onFourteenthButtonClick() throws IOException, IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("statement.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        Stage stage = new Stage();
//        stage.setTitle("Banking Application");
//        stage.setScene(scene);
//        stage.show();
//    }


    public void january(ActionEvent event){ // method for statement

        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DataConncection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM JANUARY");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                boolean add = oblist.add(new DataModel(Result.getString("Sl_No"),
                        Result.getString("Date"),
                        Result.getString("Description"),
                        Result.getString("Debit"),
                        Result.getString("Credit"),
                        Result.getString("Balance")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        slno.setCellValueFactory(new PropertyValueFactory<>("Sl_No"));
        date.setCellValueFactory(new PropertyValueFactory<>("Date"));
        description.setCellValueFactory(new PropertyValueFactory<>("Description"));
        debit.setCellValueFactory(new PropertyValueFactory<>("Debit"));
        credit.setCellValueFactory(new PropertyValueFactory<>("Credit"));
        balance.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        table.setItems(oblist);


    }

    public void febraury(ActionEvent event){ // method for statement

        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DataConncection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM feburary");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Sl_No"),
                        Result.getString("Date"),
                        Result.getString("Description"),
                        Result.getString("Debit"),
                        Result.getString("Credit"),
                        Result.getString("Balance")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        slno.setCellValueFactory(new PropertyValueFactory<>("Sl_No"));
        date.setCellValueFactory(new PropertyValueFactory<>("Date"));
        description.setCellValueFactory(new PropertyValueFactory<>("Description"));
        debit.setCellValueFactory(new PropertyValueFactory<>("Debit"));
        credit.setCellValueFactory(new PropertyValueFactory<>("Credit"));
        balance.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        table.setItems(oblist);


    }

    public void march(ActionEvent event){ // method for statement

        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DataConncection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM march");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Sl_No"),
                        Result.getString("Date"),
                        Result.getString("Description"),
                        Result.getString("Debit"),
                        Result.getString("Credit"),
                        Result.getString("Balance")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        slno.setCellValueFactory(new PropertyValueFactory<>("Sl_No"));
        date.setCellValueFactory(new PropertyValueFactory<>("Date"));
        description.setCellValueFactory(new PropertyValueFactory<>("Description"));
        debit.setCellValueFactory(new PropertyValueFactory<>("Debit"));
        credit.setCellValueFactory(new PropertyValueFactory<>("Credit"));
        balance.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        table.setItems(oblist);


    }

    public void april(ActionEvent event){ // method for statement

        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DataConncection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM april");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Sl_No"),
                        Result.getString("Date"),
                        Result.getString("Description"),
                        Result.getString("Debit"),
                        Result.getString("Credit"),
                        Result.getString("Balance")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        slno.setCellValueFactory(new PropertyValueFactory<>("Sl_No"));
        date.setCellValueFactory(new PropertyValueFactory<>("Date"));
        description.setCellValueFactory(new PropertyValueFactory<>("Description"));
        debit.setCellValueFactory(new PropertyValueFactory<>("Debit"));
        credit.setCellValueFactory(new PropertyValueFactory<>("Credit"));
        balance.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        table.setItems(oblist);


    }

    public void may(ActionEvent event){ // method for statement

        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DataConncection.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM may");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("Sl_No"),
                        Result.getString("Date"),
                        Result.getString("Description"),
                        Result.getString("Debit"),
                        Result.getString("Credit"),
                        Result.getString("Balance")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        slno.setCellValueFactory(new PropertyValueFactory<>("Sl_No"));
        date.setCellValueFactory(new PropertyValueFactory<>("Date"));
        description.setCellValueFactory(new PropertyValueFactory<>("Description"));
        debit.setCellValueFactory(new PropertyValueFactory<>("Debit"));
        credit.setCellValueFactory(new PropertyValueFactory<>("Credit"));
        balance.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        table.setItems(oblist);


    }
}
