/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;

/**
 * Exception to be thrown with invalid entry.
 * @author aferris17
 */
public class MyException extends Throwable{
    public MyException(){
        //PT -- probably don't want to do System.out here. Just store the string (in the msg property), then let the UI display the error
        System.out.println("Not valid entry.");
    };
    public MyException(String msg){};
    public MyException(String msg, Throwable e){};
    public MyException(Throwable e){};
}
