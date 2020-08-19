/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoespr19;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author Kelvin
 */
public class GamePane extends BorderPane {
    TicTacGrid ttGrid = new TicTacGrid();
    
    HBox controlPane = new HBox();
    Button btnStart = new Button("Start");
    Button btnExit = new Button("Exit");
    
    public GamePane() {
        this.setCenter(ttGrid);
        controlPane.getChildren().addAll(btnStart, btnExit);
        controlPane.setAlignment(Pos.CENTER);
        btnStart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent e) {
                ttGrid.clear();
            }
        });
        this.setBottom(controlPane);
    }
    
}
