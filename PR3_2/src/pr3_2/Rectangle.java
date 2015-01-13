/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;

/**
 *
 * @author aferris17
 */
public class Rectangle extends Shape{
    private int _w, _h;
    
    public Rectangle(int width, int height)throws MyException{
        if (!(width>0 && height>0)){
            throw new MyException();
        }
        _w = width;
        _h = height;
                };
    
    public double getArea (){
        return _w * _h;
    }
    
    public double getPerimeter (){
        return 2*_w+2*_h;
    }
}
