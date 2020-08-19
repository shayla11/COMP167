/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobilespr2019;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shayla
 */
public class AutoFleet {
    private String fleetName;
    private ArrayList<Automobile> fleet;
    
    public AutoFleet() {
        fleetName = "Aggie Auto Fleet";
        fleet = new ArrayList<>();
    }
    
//    public ArrayList<Automobile> getFleet() {
//        return fleet;
//    }
    
    public int numAutomobiles() {
        return fleet.size();
    }
    
    public void addAutomobile(Automobile auto) {
        fleet.add(auto);
    }
    
    public Automobile removeAutomobile(int index) {
        if (index < 0 || index >= fleet.size()) {
            return null;
        }
        else {
            return fleet.remove(index);
        }
    }
    
    public Automobile getAutomobile(int index) {
        return fleet.get(index);
    }
    
    public void setAutomobile(int index, Automobile auto) {
        fleet.set(index,auto);
    }
    
    /**
     * @return the fleetName
     */
    public String getFleetName() {
        return fleetName;
    }

    /**
     * @param fleetName the fleetName to set
     */
    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }
    
    public String toString() {
        String sOut = fleetName ;
        
        for (int i = 0; i < fleet.size(); i++) {
            sOut += "/n" + fleet.get(i).toString();     
        }
        
        return sOut;
            
    }
    
    public void readFleet(String fname){
        try{
            Scanner scan = new Scanner(new File(fname));
            while(scan.hasNext()) {
                Automobile auto = new Automobile();
                auto.setMake(scan.nextLine());
                auto.setModel(scan.nextLine());
                //scan.nextLine();  i comment this cause my file done look like his
                auto.setYear(scan.nextInt());
                auto.setColor(scan.nextLine());
                //add new car into the list of cars :]
                fleet.add(auto);
                
            }
            
        }catch(java.io.FileNotFoundException ex) {
            System.err.println("couldnt find the file homie");
            System.exit(-1);
            
            
        }
        
    }
    
    
}
