/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobilespr2019;

import java.util.ArrayList;

/**
 *
 * @author shayla
 */
public class AutomobileSpr2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automobile auto1 = new Automobile();
        Automobile auto2 =  new Automobile("Nissan", "370zx", 2019, "Red");
        Automobile auto3 = new Automobile("Telsa", "model x", 2020, "White");
        
        System.out.println(auto1);
        System.out.println(auto2.toString());
        System.out.println(auto3);
        
        AutoFleet autoFleet = new AutoFleet();
        //ArrayList<Automobile> myFleet = autoFleet.getFleet();
        
        autoFleet.addAutomobile(auto2);
    }
    
}
