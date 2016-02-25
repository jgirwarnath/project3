/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
        JFrame     frame  =  new JFrame("Java Search Engine");
        JTextArea txtBox =  new JTextArea();    
        JLabel     search   =  new JLabel("Enter your Search Terms: ");
        frame.setSize(650, 500);

        JLabel  TITLE   =  new JLabel("Search Engine");

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
        NORTH.add(TITLE, BorderLayout.NORTH);
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
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
       
               // Hook up Event handling:
        maintenance.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent ae ) {
                JOptionPane.showMessageDialog(null, "Comming zune","JSTAN Search Engine" ,JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
         about.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent ae ) {
                JOptionPane.showMessageDialog(null,"Copywright 2016, JSTAN", "JSTAN Search Engine", JOptionPane.INFORMATION_MESSAGE);
            }
        });
       
    }
    
}
