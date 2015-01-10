/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_6;
import java.util.*;

/**
 *  class for calculating min, max, and average
 * @author aferris17
 */
public class Calculations {
    Calculations (){};
    public Double min (ArrayList<Double>scores){
        double temp = scores.get(0);
        for (int i=1; i<scores.size();i++){
            if (temp > scores.get(i)){
                temp = scores.get(i);
            }
        }
        return temp;
    }
    
    public Double max (ArrayList<Double>scores){
        double temp = scores.get(0);
        for (int i=1; i<scores.size();i++){
            if (temp < scores.get(i)){
                temp = scores.get(i);
            }
        }
        return temp;
    }
    
    public Double avg (ArrayList<Double>scores){
        Double total=0.0;
        Double count=0.0;
        for(int i=0;i<scores.size();i++){
            total+=scores.get(i);
            count++;
        }
        
        return total/count;
    }
}
