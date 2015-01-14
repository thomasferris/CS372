/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_1;
import java.util.*;

/**
 * Reads 10 integers input by user, catches an exception if it is the wrong type.
 * @author aferris17
 */
public class PR3_1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        System.out.println("Please enter 10 integers below:");
        Scanner scan = new Scanner (System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            try {
                Integer x = scan.nextInt();
                numbers.add(x);
            } catch (InputMismatchException e) {
                System.out.println("Not a valid integer, please try again");
                i--;
                scan.nextLine();
            }
        }

     
        System.out.printf("Maximum: %d\n", cal.max(numbers));
        System.out.printf("Minimum: %d\n", cal.min(numbers));
        System.out.printf("Average: %4f\n", cal.avg(numbers));

    }
    
}
