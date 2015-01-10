/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_4_calcpi;

/**
 *
 * @author aferris17
 */
public class Calculate {

    public Calculate(){}
    
    public double findPi (int num){
        double pi = 4.0;
        int count = 0;
        for (int i=3; i<num*2+3; i+=2){
            if (count%2 == 0)
                pi -= 4/(double)i;
            else pi+= 4/(double)i;
            count++;
            System.out.printf("%f \n", pi);
        }
        return pi;
        }
    
        
        
    }

