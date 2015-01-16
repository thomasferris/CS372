/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_3;
import pr3_2.*;
import java.util.*;
import java.lang.*;

/**
 * Event class stores the name, location, and date of the event.
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
                || (month==2&&date>29) || (year%4!=0&&date>28) || (year<2015)){
            
            
            throw new MyException();
        }
        
        _name = name;
        _loc = loc;
        _mo = month;
        _date = date;
        _year = year;
    }
    
    public String getName(){
        return _name;
    }
    public String getLocation(){
        return _loc;
    }
    public Integer getMonth(){
        return _mo;
    }
    public Integer getDate(){
        return _date;
    }
    public Integer getYear(){
        return _year;
    }
    
    
    @Override
    public String toString(){
        return String.format("%d/%d/%d  %s  %s",_mo,_date,_year,_name,_loc);
    }
    

        
    public static Comparator<Event> DateComparator = new Comparator<Event>(){
        @Override
        public int compare (Event e1, Event e2){
            int cmp = e1.getYear().compareTo(e2.getYear());
            if (cmp == 0)
                cmp = e1.getMonth().compareTo(e2.getMonth());
            if (cmp==0)
                cmp = e1.getDate().compareTo(e2.getDate());
            
            return cmp;
        };
    };
    
     public static Comparator<Event> NameComparator = new Comparator<Event>(){
        @Override
        public int compare (Event e1, Event e2){
            int cmp = e1.getName().compareTo(e2.getName());
                        
            return cmp;
        };
    };
     
      public static Comparator<Event> LocComparator = new Comparator<Event>(){
        @Override
        public int compare (Event e1, Event e2){
            int cmp = e1.getLocation().compareTo(e2.getLocation());
                        
            return cmp;
        };
    };
            
            
    } 
    

