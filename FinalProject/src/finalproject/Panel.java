/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author aferris17
 */
public class Panel extends JFrame{
    Container contentPane;
    
    public Panel(){
    contentPane = getContentPane();
    }
    
    public void changePanel(JPanel panel){
        contentPane.removeAll();
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.doLayout();
        update(getGraphics());
    }
}
