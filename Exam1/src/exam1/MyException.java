/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1;

/**
 * Exception to be thrown if a bet is placed too high.
 * @author aferris17
 */
public class MyException extends Throwable{
    public MyException(){
    };
    public MyException(String msg){};
    public MyException(String msg, Throwable e){};
    public MyException(Throwable e){};
}