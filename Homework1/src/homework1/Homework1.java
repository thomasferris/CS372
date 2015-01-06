/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework1;

class DataOnly {
  int i;
  float f;
  boolean b;
  
}

/**
 *
 * @author aferris17
 */
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataOnly d = new DataOnly();
        d.i = 6;
        d.f = 2.5f;
        d.b = true;
        System.out.printf("i is %d \nf is %f \nb is %b \n" , d.i, d.f, d.b);
        
    }
    
}
