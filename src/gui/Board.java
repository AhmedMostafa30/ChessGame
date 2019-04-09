/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;

public class Board  extends JPanel
/**
 *
 * @author 3antar
 */
{
    int Knight_row = 7 ;
    int Knight_col = 1;
    int Knight2_row = 7 ;
    int Knight2_col = 6 ;
    int Knight3_row = 0 ;
    int Knight3_col = 1;
    int Knight4_row = 0 ;
    int Knight4_col = 6;
    JButton [][]squares =new JButton[8][8];
    Board()
    {
        super(new GridLayout(8,8));
        for (int i=0; i<8; ++i)
        {
             for (int j=0; j<8; ++j)
             {
                squares[i][j] = new JButton();
                this.add(squares[i][j]);
                if((j%2==1 && i%2==1) || (j%2==0 && i%2==0))
                {   
                     squares[i][j].setBackground(Color.WHITE);
                      
                }
                else
                {
                     squares[i][j].setBackground(Color.BLACK);
                }            
             }    
        }
         squares[Knight_row][Knight_col].setIcon(new ImageIcon("C:\\Users\\3antar\\Desktop\\1.jpg"));
         squares[Knight2_row][Knight2_col].setIcon(new ImageIcon("C:\\Users\\3antar\\Desktop\\1.jpg"));
         squares[Knight3_row][Knight3_col].setIcon(new ImageIcon("C:\\Users\\3antar\\Desktop\\3.jpg"));
         squares[Knight4_row][Knight4_col].setIcon(new ImageIcon("C:\\Users\\3antar\\Desktop\\3.jpg"));
    }   
   
} 