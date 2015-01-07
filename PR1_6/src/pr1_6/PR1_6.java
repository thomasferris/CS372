/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_6;

import java.util.Scanner;

/**
 *
 * @author aferris17
 */

public class PR1_6 {
   
    /**
     * Prints a list of prime numbers under a specified bound.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter an upper bound for prime numbers");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        
        for (int i=2; i<=x; i++){
            boolean prime = true;
            for (int k=2; k<i;k++){
                int div = i%k;
                if(div ==0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                    System.out.println(i);
                
                    
            }
        }
    }
    
}
