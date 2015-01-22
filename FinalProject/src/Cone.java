/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aferris17
 */
public class Cone extends ThreeD {
    private double _r,_h;
    
    public Cone(double r, double h) throws MyException{
        if (!(r>0&&h>0)){
            throw new MyException();
        }
        _r=r;
        _h=h;
    }
    
    public double getVolume (){
        return (Math.PI*_r*_r*_h/3);
    }
    
    public double getSurfaceArea(){
        double x = _r+(Math.sqrt(Math.pow(_h, 2)+Math.pow(_r,2)));
        
        return (Math.PI*_r*x);
    }
}
