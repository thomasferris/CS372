/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;
import java.util.*;


/**
 *
 * @author aferris17
 */
public class Restaurant {
    private String _name;
    private String _address;
    private String _review;
    private int _rating;
    
    Restaurant(String name, String add, String review, int rate){
        _name = name;
        _address = add;
        _review = review;
        _rating = rate;
    }
}
