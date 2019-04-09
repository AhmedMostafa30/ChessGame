/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author 3antar
 */

public class GUI
{
    
    public static void main(String[] args)
    {
        
        JFrame frame = new JFrame("Chess Game");
        frame.setSize(800, 600);
        Board bb=new Board();
        frame.add(bb);
        frame.show();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);  
        
    }    
}