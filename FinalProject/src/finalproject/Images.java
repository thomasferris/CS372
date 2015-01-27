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
    private ImageIcon image = null;
    public ImageIcon setImage(String selected){
        if (selected.equals("Circle")){
            image = new ImageIcon(Images.class.getResource("/newpackage/Circle.jpg"));
        }
        else if (selected.equals("Rectangle")){
            image = new ImageIcon(Images.class.getResource("/newpackage/Rectangle.gif"));
        }
        else if (selected.equals("Triangle")){
            image = new ImageIcon(Images.class.getResource("/newpackage/Triangle.gif"));
        }
        else if (selected.equals("Square")){
            image = new ImageIcon(Images.class.getResource("/newpackage/Square.png"));
        }
        else if (selected.equals("Ellipse")){
            image = new ImageIcon(Images.class.getResource("/newpackage/Ellipse.png"));
        }
        else if (selected.equals("Rectangular Pyramid")){
            image = new ImageIcon(Images.class.getResource("/newpackage/Rectangular Pyramid.jpg"));
        }
        else if (selected.equals("Cone")){
            image = new ImageIcon(Images.class.getResource("/newpackage/Cone.gif"));
        }
        else if (selected.equals("Elliptical Cylinder")){
            image = new ImageIcon(Images.class.getResource("/newpackage/Elliptical Cylinder.png"));
        }
        else if (selected.equals("Rectangular Prism")){
            image = new ImageIcon(Images.class.getResource("/newpackage/Rectangular Prism.gif"));
        }
        else if (selected.equals("Sphere")){
            image = new ImageIcon(Images.class.getResource("/newpackage/Sphere.jpg"));
        }
        return image;
    }
}
