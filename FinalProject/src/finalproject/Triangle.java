package finalproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Triangle, constructor takes three side lengths parameters.
 * @author aferris17
 */
public class Triangle extends TwoD{
    private int _s1, _s2, _s3;
    public Triangle(int s1, int s2, int s3)throws MyException {
        if (s1+s2<=s3 || s2+s3<=s1 || s1+s3<=s2 || s1<=0 || s2 <=0 || s3 <=0){
            throw new MyException();
        }
        else{ _s1=s1;
        _s2=s2;
        _s3=s3;
        }
    };
    
    public double getArea (){
        double p = (_s1+_s2+_s3)/2;
        double x = p*(p-_s1)*(p-_s2)*(p-_s3);
        return Math.sqrt(x);
    }
    
    public double getPerimeter (){
        return _s1+_s2+_s3;
    }
}
