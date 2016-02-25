/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame.*;

/**
 *
 * @author Jonathan Girwar-Nath
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //setting up the components of the main screen
       JFrame frame  =  new JFrame("Java Search Engine");
       JTextArea resultsTxtBox =  new JTextArea();    
       JTextArea searchLabel   =  new JTextArea("        Enter your Search Terms          ");
       JLabel title = new JLabel("Search Engine");
       JPanel titlePanel = new JPanel();
       JPanel buttonPanel = new JPanel();
       
       //create the properties of the window: 
       //size, location, visibility and exit action
       frame.setSize(600, 500);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.setVisible(true);
       
       
       //Create and layout the components
       
       frame.setLayout(new BorderLayout());
       frame.add(titlePanel, "North");
       searchLabel.setFont(new Font("Arial", Font.BOLD, 20));
       titlePanel.add(searchLabel);
       frame.add(new JScrollPane(resultsTxtBox),"Center");
       frame.add(buttonPanel, "South");
       JButton btn = new JButton ("Maintenence");
       buttonPanel.add(btn);
       
       
       
       btn.addActionListener(new ActionListener() {
           public void actionPerformed (ActionEvent ae){
               System.out.println("comming soon");
           }
       });
       
       
       /*
       //setting panels up
       JPanel main  = new JPanel(new BorderLayout()); 
       JPanel NORTH = new JPanel();
       JPanel SOUTH = new JPanel();
       
       //adding main panel to frame
       frame.add(main);
       main.setBackground(Color.white);
       
       //adding components to the north panel
       main.add(NORTH, BorderLayout.NORTH); 
       NORTH.setPreferredSize(new Dimension(200, 100));
       NORTH.add(title, BorderLayout.NORTH);
       NORTH.add(search, BorderLayout.SOUTH);
       txtBox.setPreferredSize(new Dimension(150, 15));
       NORTH.add(txtBox);
       
       //adding components to south of the main panel
       main.add(SOUTH, BorderLayout.SOUTH);
       JPanel SW  = new JPanel();      
       SOUTH.add(SW);
       
       JButton maintenance = new JButton("Maintenance...");
       maintenance.setSize(50, 20);
       SW.add(maintenance, BorderLayout.WEST);
       
       JLabel numOfIndex = new JLabel("Number of files Indexed: ");
       numOfIndex.setSize(50, 20);
       SW.add(numOfIndex, BorderLayout.CENTER);

       JButton about = new JButton("About...");
       about.setLocation(640, 480);
       SOUTH.add(about, BorderLayout.WEST);
       */
    }
    
}
