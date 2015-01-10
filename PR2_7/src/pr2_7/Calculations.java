/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_7;

/**
 *
 * @author aferris17
 */
public class Calculations {
    private int _totalSales=0;
    private int _numMint=0;
    private int _numSamoa=0;
    private int _numChoc=0;
    
    Calculations (){};
    
    public int addSales(int mint, int sam, int choc){
        _numMint+=mint;
        _numSamoa+=sam;
        _numChoc+=choc;
        int sales = 3*mint + 4*sam + 5*choc;
        _totalSales+=sales;
        return _totalSales;
        
    }
    
    public int getMint (){return _numMint;}
    
    public int getSamoa (){return _numSamoa;}
    
    public int getChoc (){return _numChoc;}
}
