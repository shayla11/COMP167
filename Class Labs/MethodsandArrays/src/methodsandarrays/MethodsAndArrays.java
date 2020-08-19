/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsandarrays;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class MethodsAndArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUM_SCORES = 10;
        int [] scores = null;
        scores = new int[NUM_SCORES];
          
        createValues("testData", NUM_SCORES);
        readValues("testData", scores);
        //printValues(scores);
        System.out.println("The class average =" + average(scores));
        System.out.println("The class Std Dev =" + stdDev(scores));
        printValues(scores);
        selectionSort(scores);
        System.out.println("************");
        printValues(scores);
        
        
    }
    
    /**
     * 
     * @param fname
     * @param numValues 
     */
    public static void createValues( String fname, int numValues) {
        try {
            PrintWriter output = new PrintWriter( new File(fname));
            Random rand = new Random();
            
            for (int i=0; i<numValues; i++) {
                int value = rand.nextInt(101);
                output.println(value);
            }
            output.close();
        }
        catch(java.io.IOException ex) {
            System.err.println("Could not open the file for writing.");
            System.exit(-1);
            
        }
    }
    
    
    public static void readValues( String fname, int [] scores) {
        try {
            Scanner input = new Scanner( new File(fname));
            
            for (int i=0; i<scores.length; i++) {
                scores[i] = input.nextInt();
            }
//            int count = 0;
//            while (input.hasNext()) {
//                int score = input.nextInt();
//                scores[count] = score;
//                count++;
//            }
        }
        catch ( IOException ex) {
            System.err.println("Could not open the file for reading");
            System.exit(-1);
        }
    }
    
    public static void printValues( int [] allScores ) {
        for (int i=0; i<allScores.length; i++) {
            System.out.println(allScores[i]);
        }
    }
    
    public static double stdDev( int [] scr) {
        double ave = average(scr);
        double variance = 0;
        for (int i=0; i<scr.length; i++) {
            variance += Math.pow( scr[i] - ave, 2);
        }
        variance = variance / scr.length;
        return Math.sqrt(variance);
    }
    
    public static double average( int [] allScores) {
        double sum = 0;
        for (int i=0; i<allScores.length; i++) {
            sum += allScores[i];
        }
        return sum / allScores.length;
    }
    
    public static int max( int val1, int val2) {
        if (val1 > val2) {
            return val1;
        }
        else {
            return val2;
        }
    }
    
    
  public static int max( int[] scores) {
       int maxValue = -1;
       for (int val : scores) {
           if (val > maxValue) {
               maxValue = val;
           }
       }
       
       return maxValue;
  }
  
  public static void selectionSort( int [] scores) {
      for (int i=0; i<scores.length-1; i++) {
          //find position with lowest value
          int pos = i;
          for (int j=i+1; j<scores.length; j++) {
              if (scores[j] < scores[pos]) {
                  pos = j;
              }
          }
          //swap the values
          int temp = scores[i];
          scores[i] = scores[pos];
          scores[pos] = temp;
          
      }
  }
  
  public static double[] classAverage(int[][] scores) {
      double [] averages = new double[scores[0].length];
      
      for(int j = 0; j < scores[0].length; j++) {
          double sum = 0;
          for (int i = 0; i < scores.length; i++){
              sum += scores[i][j];
          }
          averages[j] = sum / scores.length;
          
      }
  
      
      return averages;
  }
  
       
}
