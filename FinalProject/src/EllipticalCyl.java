/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aferris17
 */
public class EllipticalCyl extends ThreeD{
     private Double _r1, _r2, _h;
    
      public EllipticalCyl (double r1, double r2, double h)throws MyException{
        if (!(r1 >0 && r2>0 && h>0))
            throw new MyException();
        _r1 = r1;
        _r2 = r2;
        _h = h;
                    }
     
    public double getVolume() {
        return Math.PI * _r1 * _r2 * _h;
    }

    public double getSurfaceArea() {
        double x = (10*_r1*_r2 + 3*_r2 + 3*_r2);
        double sides =  (Math.PI *(3*_r1+3*_r2 - Math.sqrt(x)));
        double top =  Math.PI * _r1 * _r2;
        return 2*top + sides;
    }
}
