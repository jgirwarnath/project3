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
    public static void main(String[] args) {

        
    
       //setting up the components of the main screen
       JFrame    frame     =  new JFrame("Search Engine!!");
       JTextArea txtBox    =  new JTextArea();    

       
       //labels
       JLabel    search    =  new JLabel("Search Terms: ");
       JLabel    TITLE     =  new JLabel("Search Engine");
       JLabel numOfIndex   =  new JLabel("Number of files Indexed: ");
       
       //buttons
       JButton   FIND      =  new JButton("Search");
       JButton maintenance =  new JButton("Maintenance...");
       JButton about       =  new JButton("About...");
       
       //radiobuttons
       JRadioButton EXACT  =  new JRadioButton("Exact phrase");
       JRadioButton ALL    =  new JRadioButton("All of the search terms");
       JRadioButton ANY    =  new JRadioButton("Any of the search terms");
       
       
       //setting panels and layout managers
       JPanel main  = new JPanel(new BorderLayout());        
       JPanel NORTH = new JPanel(new BorderLayout());
       JPanel NN    = new JPanel(new FlowLayout());
       JPanel NS    = new JPanel(new FlowLayout());
       JPanel NC    = new JPanel(new FlowLayout());
       JPanel SOUTH = new JPanel(new BorderLayout());
       JPanel SW    = new JPanel(new FlowLayout());
       JPanel SE    = new JPanel(new FlowLayout());
       JPanel SC    = new JPanel(new FlowLayout());
       JPanel SS    = new JPanel(new FlowLayout()); //for the indexed number
       
       //component configuration
       frame.setSize(650, 500);
       TITLE.setFont(new Font( "serif", Font.BOLD, 27));
       txtBox.setPreferredSize(new Dimension(400, 15));
       FIND.setFont(new Font("serif", Font.PLAIN, 15));
       NORTH.setPreferredSize(new Dimension(200, 100));
       maintenance.setSize(50, 20);
       
       //adding main panel to frame
       frame.add(main);
       main.setBackground(Color.white);
       
       //adding components to the north panel and settng size of panel
       main.add(NORTH, BorderLayout.NORTH);
       NORTH.add(NS, BorderLayout.SOUTH);
       NORTH.add(NC, BorderLayout.CENTER);
       NORTH.add(NN, BorderLayout.NORTH);
       NN.add(TITLE);
       NC.add(search);
       NC.add(txtBox);
       NC.add(FIND);
       NS.add(EXACT);
       NS.add(ALL);
       NS.add(ANY); 
        
       //adding components to south of the main panel
       main.add(SOUTH, BorderLayout.SOUTH); 
       SOUTH.add(SE, BorderLayout.EAST);
       SOUTH.add(SW, BorderLayout.WEST);
       SOUTH.add(SC, BorderLayout.CENTER);
       SOUTH.add(SS, BorderLayout.SOUTH);
       SW.add(maintenance);
       SC.add(numOfIndex); 
       SE.add(about);

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//stops app on exit
       frame.setVisible(true);
        
       }

    
}
