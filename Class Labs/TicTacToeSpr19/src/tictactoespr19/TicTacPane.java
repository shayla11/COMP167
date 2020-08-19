/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoespr19;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 *
 * @author Kelvin
 */
public class TicTacPane extends Pane {

    /**
     * @return the move
     */
    public char getMove() {
        return move;
    }

    /**
     * @param move the move to set
     */
    public void setMove(char move) {
        this.move = move;
    }
    private char move;  //b=blank, x=x, o=o
    
    public TicTacPane() {
        move = 'b';
        makeMove(move);
    }
    
    public TicTacPane( char mv ) {
        move = mv;
        
        makeMove(mv);
        
    }
    
    public void makeMove( char move ) {
        this.getChildren().clear();
        this.move = move;
        
        if (move == 'o') {
            Circle circle = new Circle(65);
            circle.setCenterX(75);
            circle.setCenterY(75);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.WHITE);
            this.getChildren().add(circle);
        }
        else if (move == 'x') {
            Line l1 = new Line(10, 10, 140, 140);
            l1.setStroke(Color.BLACK);
            Line l2 = new Line(10, 140, 140, 10);
            l2.setStroke(Color.RED);
            this.getChildren().addAll(l1, l2);
            
        }
        
        
        
    }
    
}
