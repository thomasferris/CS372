/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_4;
import java.util.*;

/**
 *
 * @author aferris17
 */
public class PR2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        HashMap<String, Gerbil2> gerbils = new HashMap<String, Gerbil2>();
        ArrayList<String> gerb = new ArrayList<String>();
        String[]names = {"Joe","Gerry","Barry","Fluffy","Buffy","Sal","Bess","Grace","Amelia","Kele"};
        
        for (int i=0; i<7;i++){
            String name = names[rnd.nextInt(names.length)];
            Gerbil2 ger = new Gerbil2(name,i);
            gerb.add(name);
            gerbils.put(name,ger);
        }
        
        Iterator<String> e = gerb.iterator();
        while (e.hasNext()){
            String gerName = e.next();
            System.out.printf("%s, ",gerName);
            gerbils.get(gerName).hop();
        
        }
       
    }
    
}
