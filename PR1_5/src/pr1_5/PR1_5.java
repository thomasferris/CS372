/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_5;

/**
 *
 * @author aferris17
 */
import java.util.Random;

public class PR1_5 {

    /**
     * create object of random
     * <p>
     * print line for which random is greater.
     * <p>
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
       int x;
       int y;
       
       Random rand = new Random();
       for (int i=0; i<25; i++){
           x = rand.nextInt(100);
           y = rand.nextInt(100);
           if (x>y){
               System.out.printf("Random X, %d, is greater than Y, %d \n", x, y);
           } //PT: what if x == y ?
           else System.out.printf("Random Y, %d, is greater than X, %d \n", y, x);
       }
           
    }
    
}
