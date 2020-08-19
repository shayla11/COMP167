/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoespr19;


import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Kelvin
 */
public class TicTacGrid extends GridPane {
    private MoveHandler moveHandler = new MoveHandler();
    private char turn;
    
    public TicTacGrid( char [][] moves) {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                TicTacPane ttp = new TicTacPane(moves[i][j]);
                ttp.setOnMouseClicked(moveHandler);
                ttp.setPrefSize(150, 150);
                this.add(ttp, j, i);
            }
        }
    }
    
    public TicTacGrid() {
        turn = 'x';
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                TicTacPane ttp = new TicTacPane();
                ttp.setOnMouseClicked(moveHandler);
                ttp.setPrefSize(150, 150);
                this.add(ttp, j, i);
            }
        }
        
    }
    
    public void toggleTurn() {
        if (turn == 'x') {
            turn = 'o';
        }
        else {
            turn = 'x';
        }
    }
    
    public void clear() {
        for (int i = 0; i < this.getChildren().size(); i++) {
            if (this.getChildren().get(i) instanceof TicTacPane) {
                ((TicTacPane) this.getChildren().get(i)).makeMove('b');
            }
        }
    }
    
    //Innerclass
    private class MoveHandler implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            TicTacPane ttp = (TicTacPane) e.getSource();
            ttp.makeMove(turn);
            toggleTurn();
        }
    }
    
}
