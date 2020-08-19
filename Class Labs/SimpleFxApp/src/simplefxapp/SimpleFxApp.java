/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefxapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author shayla
 */
public class SimpleFxApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        
        BorderPane root  = new BorderPane();
        GridPane keyPad = new GridPane();
        Button center = new Button("Center");
        TextField txtTop = new TextField("My Microwave Status");
   
        String sVal;
        for (int i = 0; i<3; i++){
            for (int j = 0; j < 3; j++){
                if (i*4+j < 10)
                    sVal = (i*4+j)+"";
                else 
                    sVal = "*";

                Button b = new Button(sVal);
                b.setPrefHeight(30);
                b.setPrefWidth(30);
                keyPad.add(b,j,i);
    

            }
            
        }
        root.setLeft(keyPad);
        center.setPrefSize(400, 400);
        root.setCenter(center);
        root.setTop(txtTop);
        
        
        
        
        
        Scene scene = new Scene(root, 500, 400);
        
        primaryStage.setTitle("Telephone");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    

    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
