/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_2;

/**
 *
 * @author aferris17
 * @version 1
 */
public class PR1_2 {

    /**
     * prints 3 strings from command line
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PT: Since you're expecting three arguments, it'd be good to check for that:
        //if (args.length < 3) System.out.println("Please pass three argument");
        // else { ...
        for (int i=0; i<3; i++)
        {
            System.out.printf("%s", args[i]);
        }
    }
    }
    

