/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_4_calcpi;
import java.util.*;

/**
 *
 * @author aferris17
 */
public class PR2_4_CalcPi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("To what term of the series would you like to calculate?");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        Calculate cal = new Calculate();
        cal.findPi(x);
    }
    
}
