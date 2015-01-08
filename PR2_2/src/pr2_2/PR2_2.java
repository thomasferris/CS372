/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_2;

import java.util.*;

/**
 *
 * @author aferris17
 */
public class PR2_2 {
     public static ArrayList<Gerbil> array = new ArrayList<Gerbil>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0; i<20; i++){
            Gerbil ger = new Gerbil(i);
            array.add(ger);
        }
        Iterator<Gerbil> e = array.iterator();
        while (e.hasNext()){
            Gerbil gerb = e.next();
            gerb.hop();
        }
    }
    
}
