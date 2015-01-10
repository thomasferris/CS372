/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_1;
import java.util.ArrayList;

/**
 *
 * @author aferris17
 */
public class PR2_1 {
    public static ArrayList<Gerbil> array = new ArrayList<Gerbil>();
    

    /**
     * adds gerbils to array and calls hop for all
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0; i<20; i++){
            Gerbil ger = new Gerbil(i);
            array.add(ger);
        }
        for (int i=0; i< array.size(); i++){
            array.get(i).hop();
        }
    }
    
}
