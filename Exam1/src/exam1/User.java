package exam1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * User stores the name and the balance for a user. 
 * User implements methods for getting a name and setting a balance.
 * User also throws an exception if a bet is placed too high.
 * @author aferris17
 */
public class User {
    private String _name;
    private int _balance;
    
    public User (String name){
        _name = name;
        _balance = 500;
    }
    
    public User (String name, int bal){
        _name = name;
        _balance = bal;
    }
    
    public String getName(){
        return _name;
    }
    
    public int getBalance (){
        return _balance;
    };
    
    public void setBalance (int amt){
        _balance += amt;
    }
    
    public void placeBet (int amt) throws MyException{
        if (amt > _balance) {
            throw new MyException();
        }
    }
    
}
