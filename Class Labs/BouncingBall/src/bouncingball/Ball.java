/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingball;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author shayla
 */
public class Ball extends Circle {
    private double dx;
    private double dy;
    private double parentWidth;
    private double parentHeight;
    
    public Ball(double parentWidth, double parentHeight){
        this.parentWidth = parentWidth;
        this.parentHeight = parentHeight;
        this.setStroke(Color.RED);
        this.setFill(Color.RED);
        
        
        
        this.setRadius(20);
        this.setCenterX(this.getRadius());
        dx = 0;
        dy = 5;
 
    }
    
    public void move() {
        this.setCenterX(this.getCenterX() + dx);
        this.setCenterY(this.getCenterY() + dy);
        
        //Allows the ball to bounce back
        //if (dy > 0 && this.getCenterY() + getRadius() > parentHeight) {
          //  this.setCenterY(parentHeight - getRadius());
            //dy = -dy;
        //}
        
        
    }

    /**
     * @return the dx
     */
    public double getDx() {
        return dx;
    }

    /**
     * @param dx the dx to set
     */
    public void setDx(double dx) {
        this.dx = dx;
    }

    /**
     * @return the dy
     */
    public double getDy() {
        return dy;
    }

    /**
     * @param dy the dy to set
     */
    public void setDy(double dy) {
        this.dy = dy;
    }

    /**
     * @return the parentWidth
     */
    public double getParentWidth() {
        return parentWidth;
    }

    /**
     * @param parentWidth the parentWidth to set
     */
    public void setParentWidth(double parentWidth) {
        this.parentWidth = parentWidth;
    }
    
}
