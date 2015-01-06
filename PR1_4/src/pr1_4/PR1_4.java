/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_4;

/**
 *
 * @author aferris17
 * @version 1
 */



import java.util.Scanner;


public class PR1_4 {
    /**
     * @param args the command line arguments
     * return no value, print Area
     */
   
    public static void main(String[] args) {
        System.out.println("What is the radius?");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        final double PI = 3.14; 
        double Area = PI * x*x;
        System.out.printf("Area is: %f", Area);
    }
    
}
