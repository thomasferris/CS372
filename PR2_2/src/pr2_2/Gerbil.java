/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_2;

/**
 *
 * @author aferris17
 */
public class Gerbil {
    private int _gerbilNumber;
    public Gerbil (int gerbilNumber){
        _gerbilNumber = gerbilNumber;
    }
    
    
    
    public void hop(){
        int number = _gerbilNumber;
        System.out.printf ("Gerbil %d is hopping.\n", number);
    }
}
