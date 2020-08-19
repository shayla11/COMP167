/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobilespr2019;

/**
 *
 * @author shayla
 */
public class Automobile {
    private String make;
    private String model;
    private int year;
    private String color;
    
    public Automobile() {
        make = "Ford";
        model = "Focus";
        year = 2019;
        color = "blue";
    }
    /** 
     * 
     * @param make
     * @param model
     * @param year
     * @param color 
     */
    public Automobile (String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        
    }
    
    // for refactoring!!! Refoactor - encapsulate field - select all - refactor
    
    
    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString() {
        return make + "|" + model + "|" + year + "|" + color ;
    }
    
}
