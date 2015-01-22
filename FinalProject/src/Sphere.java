/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aferris17
 */
public class Sphere extends ThreeD {
    private double _r;
    
    public Sphere (double r)throws MyException{
        if (!(r>0))
            throw new MyException();
        _r=r;
        }
    
    public double getVolume (){
        return (4/3*Math.PI*_r*_r);
    }
    
    public double getSurfaceArea (){
        return (4*Math.PI*_r*_r);
    }

}
