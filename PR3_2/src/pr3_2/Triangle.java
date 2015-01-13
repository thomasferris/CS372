/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;
import pr3_2.MyException;

/**
 *
 * @author aferris17
 */
public class Triangle {
    public Triangle(int s1, int s2, int s3)throws MyException {
        if (s1+s2<s3 || s2+s3<s1 || s1+s3<s2 || s1<=0 || s2 <=0 || s3 <=0){
            throw new MyException();
            
        }
        
        
    };
}
