package finalproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Square Pyramid class, parameters length, width, height.
 * @author aferris17
 */
public class SquarePyr extends ThreeD{
    private double _l,_w,_h;
    
    public SquarePyr(double l, double w, double h) throws MyException{
        if (!(l>0&&w>0&&h>0)){
            throw new MyException();
        }
        _l=l;
        _w=w;
        _h=h;
    }
    
    public double getVolume (){
        return (_l*_w*_h/3);
    }
    
    public double getSurfaceArea(){
        double x = (Math.sqrt(Math.pow(_w/2, 2)+Math.pow(_h,2)));
        double y = (Math.sqrt(Math.pow(_l/2, 2)+Math.pow(_h,2)));
        
        
        return (_l*_w+_l*x+_w*y);
    }
}
