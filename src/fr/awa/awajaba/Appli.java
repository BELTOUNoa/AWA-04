/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 
public class Appli extends Application {
 
   @Override
   public void start(Stage primaryStage) throws Exception {
       GridPane root = new GridPane();
 
       root.setPadding(new Insets(20));
       root.setHgap(25);
       root.setVgap(15);

 
 
       Label labelUserName = new Label("Login");
       TextField fieldUserName = new TextField();
 
       Label labelPassword = new Label("Mdp");
 
       PasswordField fieldPassword = new PasswordField();
 
       Button loginButton = new Button("Valider");
       
       loginButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                
                if( "administrateur".equals(fieldUserName.getText()) && "azerty".equals(fieldPassword.getText())){
                    Alert dlgOk = new Alert( AlertType.INFORMATION ) ;
                    dlgOk.setTitle( "Authentication" );
                    dlgOk.setHeaderText( "GG" );
                    dlgOk.setContentText( "Tu es vraiment très fort !" );
                    dlgOk.showAndWait();
                }
                else{
                    Alert dlgNok = new Alert( AlertType.ERROR ) ;
                    dlgNok.setTitle( "Authentication" );
                    dlgNok.setHeaderText( "Echec à l'authentification" );
                    dlgNok.setContentText( "Identifiant ou mot de passe incorrect !" );
                    dlgNok.showAndWait();
                }
                
                
            }
        });
       
       
       
 
       GridPane.setHalignment(labelUserName, HPos.RIGHT);

       root.add(labelUserName, 0, 1);
 
        
       GridPane.setHalignment(labelPassword, HPos.RIGHT);
       root.add(labelPassword, 0, 2);
 
       GridPane.setHalignment(fieldUserName, HPos.LEFT);
       root.add(fieldUserName, 1, 1);
 
       GridPane.setHalignment(fieldPassword, HPos.LEFT);
       root.add(fieldPassword, 1, 2);
 
       GridPane.setHalignment(loginButton, HPos.RIGHT);
       root.add(loginButton, 1, 3);
 
       Scene scene = new Scene(root, 300, 300);
       primaryStage.setTitle("Awajaba04");
       primaryStage.setScene(scene);
       primaryStage.show();
   }
 
   public static void main(String[] args) {
       launch(args);
   }
 
}