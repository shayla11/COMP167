/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoespr19;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kelvin
 */
public class TicTacToeSpr19 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
       // char [][] moves = { {'o', 'b', 'b'}, {'o','x', 'x'}, {'b','b','o'}};
        
        GamePane root = new GamePane();
       
        
        Scene scene = new Scene(root, 450, 500);
        
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
