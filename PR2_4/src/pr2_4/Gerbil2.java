/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_4;
import pr2_1.*;


/**
 *
 * @author aferris17
 */
public class Gerbil2 extends Gerbil {
    private int _gerbilNumber;
    private String _gerbilName;
    public Gerbil2 (String gerbilName, int gerbilNumber){
        super(gerbilNumber);
        _gerbilName = gerbilName;
        _gerbilNumber = gerbilNumber;
    }
    
    
    
    public void hop(){
        int number = _gerbilNumber;
        System.out.printf ("Gerbil %d is hopping.\n", number);
    }
}
