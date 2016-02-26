/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SearchEngine extends JFrame {

    public SearchEngine(){
        
        
        
         GridBagConstraints grid = new GridBagConstraints();
         grid.insets = new Insets(10,5,5,0);
        
        
      
        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.X_AXIS));
        
        //pan0 is inside the main panel
        JPanel pan0 = new JPanel();
        pan0.setLayout(new BoxLayout(pan0, BoxLayout.X_AXIS));
        
        //pan1 is inside the pan0 panel
        JPanel pan1 = new JPanel();
      
         JPanel pan11 = new JPanel();
         JButton search11 = new JButton("Javan 45454545 Search");
      
        
        //CHECKING PAN 2
        JPanel pan2 = new JPanel(new GridBagLayout());
        // pan2.setLayout(new BoxLayout(pan2, BoxLayout.X_AXIS));
        
        JPanel pan3 = new JPanel();
        pan3.setLayout(new BoxLayout(pan3, BoxLayout.X_AXIS));
        
        
        JPanel pan4 = new JPanel();
         pan4.setLayout(new BoxLayout(pan4, BoxLayout.X_AXIS));
        
        JPanel pan5 = new JPanel();
       //pan5.setLayout(new BoxLayout(pan5, BoxLayout.X_AXIS));
        
        JPanel pan6 = new JPanel();
       // pan6.setLayout(new BoxLayout(pan6, BoxLayout.X_AXIS));
        JPanel pan7 = new JPanel();
        pan7.setLayout(new BoxLayout(pan7, BoxLayout.X_AXIS));
        
       //Pan0 left corner maintenance
       // pan0.add(Box.createGlue());
        JButton maintenance = new JButton("Maintenance");
         pan0.add(maintenance);
          
          //pan1 botton middle files
        pan1.add(Box.createGlue()); 
        JLabel files = new JLabel("Number of Files in the Indexed:");
        pan1.add(files);
        
        //pan3 right corner about
         pan3.add(Box.createGlue());
        JButton about = new JButton("About");
         pan3.add(about);
         
        
        
         
         
        JButton search1 = new JButton("Javan Search");
        JLabel searchTerm = new JLabel("Search Engine");
        JLabel searchEngine = new JLabel("Search Terms:");
        JTextField text = new JTextField("                                                              ");
       
        
        JRadioButton check = new JRadioButton("All of the Search Terms");
         JRadioButton check1 = new JRadioButton("Any of the Search Terms");
         JRadioButton check2 = new JRadioButton("Exact Phrase");
         
        pan2.add(searchEngine);
        pan2.add(text);
        pan2.add(search1);
        pan2.add(check);
        pan2.add(check1);
        pan2.add(check2);
        
        
        grid.gridx = 0;
        grid.gridy = 0;
        pan2.add(searchEngine, grid);
        
        grid.gridx = 1;
        grid.gridy = 0;
        pan2.add(text, grid);
        
        grid.gridx = 2;
        grid.gridy = 0;
        pan2.add(search1, grid);
        
        
        
        grid.gridx = 0;
        grid.gridy = 1;
        pan2.add(check, grid);
        
        grid.gridx = 1;
        grid.gridy = 1;
        pan2.add(check1, grid);
        
        grid.gridx = 2;
        grid.gridy = 1;
        pan2.add(check2, grid);
        
        
       
        
        
        
        
        
        
       
        
        pan5.add(searchTerm);
        
  
        
 // main.add(pan0,BorderLayout.NORTH);
        main.add(pan0);
        main.add(pan4);
        pan4.add(pan3,BorderLayout.CENTER);
        pan0.add(pan1, BorderLayout.SOUTH);
        //main.add(pan2);
       // pan2.add(pan3, BorderLayout.CENTER);
        
        add(main, BorderLayout.SOUTH);
        add(pan2);
       //pan2.add(pan5,BorderLayout.WEST);
        add(pan5,BorderLayout.NORTH);
      
    }
    
    public static void main(String[] args) {
        
        Maintenance me = new Maintenance();
        JFrame fr = new JFrame();
        fr.add(me);
       fr.setTitle("Javans Search Engine Maintenance");
       fr.setSize(700,600);
       fr.setVisible(true);
    //  fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        SearchEngine frame = new SearchEngine();
        frame.setTitle("Javans Search Engine ");
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}




       
   class Maintenance extends JPanel {
      
      
      public Maintenance(){
          
  
       
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);
        panel.add(Box.createHorizontalGlue());
       // panel.add(Box.createHorizontalStrut(10));
         //panel.add(Box.createRigidArea(new Dimension(10,0)));
        
        //Search Engine Title
        JPanel panel0 = new JPanel();
        panel0.setLayout(new BoxLayout(panel0, BoxLayout.LINE_AXIS));
        //panel0.add(Box.createRigidArea(new Dimension(10,0)));
        
        JPanel pan = new JPanel();
     //pan.setLayout(new BoxLayout(pan, BoxLayout.PAGE_AXIS));
       
        
        
        
        
        
        JPanel pans = new JPanel();
        pans.setLayout(new BoxLayout(pans, BoxLayout.PAGE_AXIS));
        pans.setAlignmentX(BOTTOM_ALIGNMENT);
        
   
        JLabel search = new JLabel("Search Engine - Index Maintenance");
        JLabel fileName = new JLabel("                                                File Name                                         ");
        JLabel status = new JLabel("                   Status                                                                                   ");
     
        JLabel numberOf = new JLabel("Number of files indexed:0");
        JLabel version = new JLabel("Search Engine version 1.1");
        search.setFont(new Font( "serif", Font.BOLD, 30));
        
        fileName.setBorder(BorderFactory.createLineBorder(Color.black,2));
        status.setBorder(BorderFactory.createLineBorder(Color.black,2));
        
       
      JButton addFile = new JButton("Add File");
      
      JButton rebuild = new JButton("Rebuild Out-of-Date");
      JButton remove = new JButton("Remove Selected Files");
      JButton reset = new JButton("Reset Window");

         search.setPreferredSize(new Dimension(170, 25));
       
      
   
  
       panel0.add(search);
      
       
       pan.add(fileName);
       pan.add(status);
      
       pan.add(addFile);
       pan.add(Box.createHorizontalGlue());
      pan.add(Box.createRigidArea(new Dimension(55, 450)));
       pan.add(rebuild);
       pan.add(Box.createHorizontalGlue());
       pan.add(Box.createRigidArea(new Dimension(55, 450)));
       pan.add(remove);
       
      pan.add(Box.createHorizontalGlue());
       // pan.add(Box.createVerticalStrut(155));
      pan.add(Box.createRigidArea(new Dimension(30, 460)));
//       
        pan.add(reset);
        pan.add(Box.createHorizontalGlue());
        pan.add(Box.createRigidArea(new Dimension(100, 0)));
        pan.add(numberOf);
        pan.add(Box.createHorizontalGlue());
        pan.add(Box.createRigidArea(new Dimension(100, 0)));
        pan.add(version);
    
       panel.add(panel0);
       panel.add(pan);
       
       

}

    
}
  
   
