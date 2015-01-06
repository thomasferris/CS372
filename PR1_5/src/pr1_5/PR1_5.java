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
     * @param args the command line arguments
     * create object of random
     * return no value, but print line for which random is greater.
     */
    public static void main(String[] args) {
       int x;
       int y;
       
       Random rand = new Random();
       for (int i=0; i<25; i++){
           x = rand.nextInt();
           y = rand.nextInt();
           if (x>y){
               System.out.println("Random X is greater");
           }
           else System.out.println("Random Y is greater");
       }
           
    }
    
}
