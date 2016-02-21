/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author alexanderinfante
 */
public class SearchEngine extends JPanel implements ActionListener {
    
    public SearchEngine()
    {

        //setting panels and layout managers  
       JPanel main  = new JPanel(new BorderLayout());
       JPanel NORTH = new JPanel(new BorderLayout());
       JPanel NN    = new JPanel(new FlowLayout());
       JPanel NS    = new JPanel(new FlowLayout());
       JPanel NC    = new JPanel(new FlowLayout());
       JPanel CENTER= new JPanel(new FlowLayout());
       JPanel SOUTH = new JPanel(new BorderLayout());
       JPanel SW    = new JPanel(new FlowLayout());
       JPanel SE    = new JPanel(new FlowLayout());
       JPanel SC    = new JPanel(new FlowLayout());
       JPanel SS    = new JPanel(new FlowLayout()); //for the indexed number 
         
       //setting up the components of the main screen
       JTextArea txtBox    =  new JTextArea();    
       JTextArea midTxt    =  new JTextArea();
       
       //labels
       JLabel    search    =  new JLabel("Search Terms: ");
       JLabel    TITLE     =  new JLabel("Search Engine");
       JLabel numOfIndex   =  new JLabel("Number of files Indexed: ");
       
       
       //buttons
       JButton   FIND      =  new JButton("Search");
       JButton maintenance =  new JButton("Maintenance...");
       JButton about       =  new JButton("About...");
       
       //radiobuttons
       JRadioButton exact  =  new JRadioButton("Exact phrase");
       JRadioButton all    =  new JRadioButton("All of the search terms");
       JRadioButton any    =  new JRadioButton("Any of the search terms");
      
       //buttonGroup
       ButtonGroup group = new ButtonGroup();
       group.add(all);
       group.add(exact);
       group.add(any);
       
       
       //adding event listeners
       exact.addActionListener(this);
       exact.setActionCommand("exact");
       all.addActionListener(this);
       all.setActionCommand("all");
       any.addActionListener(this);
       any.setActionCommand("all");
       
       //component configuration
       TITLE.setFont(new Font( "serif", Font.BOLD, 30));
       txtBox.setPreferredSize(new Dimension(470, 15));
       FIND.setFont(new Font("serif", Font.PLAIN, 15));
       
       main.setBackground(Color.white);
       
       main.add(CENTER);
       midTxt.setPreferredSize(new Dimension (850, 415));
       CENTER.add(midTxt);
       
       //creating borders
       midTxt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
       txtBox.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
       
       //adding components to the north panel
       main.add(NORTH, BorderLayout.NORTH);
       NORTH.add(NS, BorderLayout.SOUTH);
       NORTH.add(NC, BorderLayout.CENTER);
       NORTH.add(NN, BorderLayout.NORTH);
       NN.add(TITLE);
       NC.add(search);
       NC.add(txtBox);
       NC.add(FIND);
       NS.add(exact);
       NS.add(all);
       NS.add(any); 
        
       //adding components to south of the main panel
       main.add(SOUTH, BorderLayout.SOUTH); 
       SOUTH.add(SE, BorderLayout.EAST);
       SOUTH.add(SW, BorderLayout.WEST);
       SOUTH.add(SC, BorderLayout.CENTER);
       SOUTH.add(SS, BorderLayout.SOUTH);
       SW.add(maintenance);
       SC.add(numOfIndex); 
       SE.add(about);    
    
       add(main);
    }
     
    
    public void actionPerformed(ActionEvent e) { 
           
       
            
        
    } 
}
