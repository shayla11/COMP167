/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingball;

import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;

/**
 *
 * @author shayla
 */
public class BallPane extends Pane{
    private Ball ball = new Ball(450,450);
    private MyTimer timer = new MyTimer(); 
    
    
    public BallPane() {
        this.getChildren().add(ball);
        timer.start();
    }
    
    
    public class MyTimer extends AnimationTimer{
        private long previous = 0;
        public void handle(long now) {
            if (previous == 0) {
                previous = now;
            } else if (now - previous >= 25000000L) {
                ball.move();
                previous = now;
            }
            
        }

    
    }
}
