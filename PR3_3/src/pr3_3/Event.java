/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_3;
import pr3_2.*;
/**
 * Event class stores 
 * @author aferris17
 */
public class Event {
    private String _name;
    private String _loc;
    private int _mo;
    private int _date;
    private int _year;
    
    Event (String name, String loc, int month, int date, int year)throws MyException{
        if (month>12||month<1 || 
                (month==1&&date>31) || (month==3&&date>31) || (month==5&&date>31) || (month==7&&date>31) ||
                (month==8&&date>31) || (month==10&&date>31) || (month==12&&date>31) ||
                (month==4&&date>30) || (month==6&&date>30) || (month==9&&date>30) || (month==11&&date>30)
                || (month==2&&date>29) || (year%4!=0&&date>28)){
            throw new MyException();
        }
            
    
    }; 
}
