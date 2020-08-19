/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1_classandobjects;

/**
 *
 * @author shayla
 */
public class Lesson1_ClassandObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Task task1 = new Task();
        task1.taskName = "Clean your room";
        task1.dueDate = "3/12/19";
        task1.partner = false;
        
        Task task2 =  new Task();
        task2.taskName = "Do Homework";
        
        System.out.println(task1.taskName + " \n" + task2.taskName);
        
        
        
    }
    
}
