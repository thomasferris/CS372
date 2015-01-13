/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;
import java.util.*;

/**
 *
 * @author aferris17
 */
public class PR3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.println("Please select a shape: \n triangle \n ellipse, or \n rectangle");
         String shape = input.next();
         
         if (shape.equals("triangle")){
             System.out.println("Enter three side lengths:");
             Triangle tri = null;
             try{
             tri = new Triangle(input.nextInt(),input.nextInt(),input.nextInt());
             } catch(MyException e){
             } finally {
                 if (tri!=null){
                     System.out.printf("The area for this triangle is %f and the perimeter is %f\n", 
                             tri.getArea(),tri.getPerimeter());
                 }
             }
         }
         if (shape.equals("ellipse")){
             System.out.println("Enter two radii:");
             Ellipse ell = null;
             try{
             ell = new Ellipse(input.nextInt(),input.nextInt());
             } catch(MyException e){
             } finally {
                 if (ell!=null){
                     System.out.printf("The area for this ellipse is %f and the perimeter is %f\n", 
                             ell.getArea(),ell.getPerimeter());
                 }
             }
         }
          if (shape.equals("rectangle")){
             System.out.println("Enter length and width:");
             Rectangle rec = null;
             try{
             rec = new Rectangle(input.nextInt(),input.nextInt());
             } catch(MyException e){
             } finally {
                 if (rec!=null){
                     System.out.printf("The area for this rectangle is %f and the perimeter is %f\n", 
                             rec.getArea(),rec.getPerimeter());
                     
                 }
             }
         }
    }
    
    
    
}
