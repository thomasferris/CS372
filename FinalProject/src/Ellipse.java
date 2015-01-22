/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aferris17
 */
public class Ellipse extends TwoD{
    private int _r1, _r2;
    
    public Ellipse (int r1, int r2)throws MyException{
        if (!(r1 >0 && r2>0))
            throw new MyException();
        _r1 = r1;
        _r2 = r2;
                    }
    
    public double getArea(){
        return Math.PI * _r1 * _r2;
        
    }
    
    public double getPerimeter(){
        double x = (10*_r1*_r2 + 3*_r2 + 3*_r2);
        return (Math.PI *(3*_r1+3*_r2 - Math.sqrt(x)));
        
    }
}
