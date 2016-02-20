/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

import javax.swing.*; 
import java.awt.*;

/**
 *
 * @author Alexander Infante 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) 
	{

    }

    public Main(){
       
        Maintenance me = new Maintenance();
        
        
        JFrame    frame     =  new JFrame("Search Engine!!");
        SearchEngine se = new SearchEngine();
        frame.add(se)
        frame.setVisible(true);
        frame.setSize(750, 500);   
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//stops app on exit
        frame.setVisible(true);
        frame.setSize(750, 500);      
          
    
    }
}
