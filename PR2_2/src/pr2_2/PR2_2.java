/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_2;

import java.util.*;
import pr2_1.*; //PT -- good

/**
 *
 * @author aferris17
 */
public class PR2_2 {
     public static List gerbils = new ArrayList<Gerbil>();

    /**
     * Main adds gerbils to the arraylist and calls hop for each
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        for (int i=0; i<20; i++){
            Gerbil ger = new Gerbil(i);
            gerbils.add(ger);
        }
        Iterator<Gerbil> e = gerbils.iterator();
        while (e.hasNext()){
            Gerbil gerb = e.next();
            gerb.hop();
        }
    }
    
}
