/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author aferris17
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Amy";
        System.out.printf("Hello %s what is your score:\n", name);
        Scanner input = new Scanner (System.in);
        int score = input.nextInt();
        System.out.printf("your score is %d\n", score);
    }
    
}
