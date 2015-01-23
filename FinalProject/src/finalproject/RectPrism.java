package finalproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aferris17
 */
public class RectPrism extends ThreeD {
    private double _w, _l, _h;
    
    public RectPrism(double width,double length, double height)throws MyException{
        if (!(width>0 && height>0&&length>0)){
            throw new MyException();
        }
        _w = width;
        _h = height;
        _l = length;
                };
    
    public double getVolume (){
        return _w * _h*_l;
    }
    
    public double getSurfaceArea (){
        double top = _w*_l;
        double front = _w*_h;
        double side = _l*_h;
        return 2*top+2*front+2*side;
    }
}
