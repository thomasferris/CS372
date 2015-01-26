/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_1;
import java.util.*;

/**
 *Runs calculations to find minimum, maximum, and average.
 * @author aferris17
 */
public class Calculate {
    Calculate (){}; 
    
    //PT -- need javadoc. -2
    //Also, since these functions only use get and size, your parameter could
    //  just be List<Integer>, and then you'd be able to use your function
    //  with many kinds of collections, not jsut ArrayList
    public int min (ArrayList<Integer> array){
        int temp = array.get(0);
        for (int i=1; i<array.size();i++){
            if (temp > array.get(i)){
                temp = array.get(i);
            }
        }
        return temp;
    }
    
    public int max (ArrayList<Integer>array){
        int temp = array.get(0);
        for (int i=1; i<array.size();i++){
            if (temp < array.get(i)){
                temp = array.get(i);
            }
        }
        return temp;
    }
    
    public Double avg (ArrayList<Integer>array){
        Double total=0.0;
        Double count=0.0;
        for(int i=0;i<array.size();i++){
            total+=(double)array.get(i);
            count++;
        }
        
        return total/count;
    }
    }

