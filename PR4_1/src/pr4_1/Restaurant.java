/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;
import java.util.*;



/**
 * Restaurant class with properties and get methods, contsructor initializes and checks rate.
 * @author aferris17
 */
public class Restaurant {
    private String _name;
    private String _address;
    private String _review;
    private int _rating;
    
    Restaurant(String name, String add, String review, int rate)throws MyException{
        if(rate<0 || rate>5){
            throw new MyException();
        }
        _name = name;
        _address = add;
        _review = review;
        _rating = rate;
    }
    
    public String getName(){
        return _name;
    }
    
    public String getAddress(){
        return _address;
    }
    
    public String getReview(){
        return _review;
    }
    
    public Integer getRating(){
        return _rating;
    }
    
    @Override
    public String toString(){
        return String.format("%s\t%s\t%d\t%s",_name,_address,_rating,_review);
    }
}
