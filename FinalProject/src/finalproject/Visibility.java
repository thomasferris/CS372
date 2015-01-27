/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;
import java.awt.*;

/**
 * Visibility allows the program to set any component in the jFrame to visible or invisble
 * using a list of components.
 * @author aferris17
 */
public class Visibility {
    public Visibility(){};
    
    public void Invisible(Component... components){
        for (int i=0; i<components.length;i++){
            components[i].setVisible(false);
        }
    }
    public void Visible(Component... components){
        for (int i=0; i<components.length;i++){
            components[i].setVisible(true);
        }
    }
}
