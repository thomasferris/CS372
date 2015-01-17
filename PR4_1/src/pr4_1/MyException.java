/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;

/**
 *
 * @author aferris17
 */
public class MyException extends Throwable{
    public MyException(){
        System.out.println("Not valid entry.");
    };
    public MyException(String msg){};
    public MyException(String msg, Throwable e){};
    public MyException(Throwable e){};
}
