/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;
import java.awt.*;
import javax.swing.ImageIcon;

/**
 *
 * @author aferris17
 */
public class Images {
    private String selected;
    private ImageIcon image;
    public ImageIcon setImage(String selected){
        if (selected.equals("Circle")){
            image = new ImageIcon(Images.class.getResource("/newpackage/Circle.jpg"));
        }
        return image;
    }
}
