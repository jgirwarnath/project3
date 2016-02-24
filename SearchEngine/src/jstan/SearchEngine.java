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
          
          GridBagConstraints grid = new GridBagConstraints();
         grid.insets = new Insets(10,5,5,0);
          
          
          JPanel mainPan = new JPanel(new BorderLayout());
          
          JPanel pan0 = new JPanel(new GridBagLayout());
//         
          JPanel pan1 = new JPanel(new BorderLayout());
         // pan1.setLayout(new BoxLayout(pan1, BoxLayout.X_AXIS));
          
          JPanel pan2 = new JPanel();
          JPanel pan3 = new JPanel();
          
          
          JLabel searchEngine = new JLabel("Search Engine - Index Maintenance");    
          searchEngine.setFont(new Font("Serif", Font.BOLD, 24 ));
       // N.add(title);
        
          JLabel fileName = new JLabel("                                                    File Name                                                                ");
          fileName.setBorder(BorderFactory.createLineBorder(Color.black));
          
          JLabel status = new JLabel("                                     Status                                                       ");
         status.setBorder(BorderFactory.createLineBorder(Color.black));
          
          JLabel numberOfFilesIndexed = new JLabel ("Number of files indexed");
          JLabel version = new JLabel("Search Engine Version 1.0");
          
          JButton addFile = new JButton("Add File");
          JButton rebuild = new JButton("Rebuild Out-of-date");
          JButton remove = new JButton ("Remove Selected Files");
          JButton resetWindow = new JButton("Reset Window");
          
          //north panel
          pan0.add(searchEngine);
          pan0.add(fileName);
          pan0.add(status);
          
          
        grid.gridx = 0;
        grid.gridy = 0;
        pan0.add(searchEngine, grid);
        
        grid.gridx = 0;
        grid.gridy = 1;
        pan0.add(fileName, grid);
        
        grid.gridx = 1;
        grid.gridy = 1;
        pan0.add(status, grid);
        
          pan1.add(addFile);
//          pan1.add(rebuild);
//          pan1.add(remove);
//          pan1.add(resetWindow);
          
         // mainPan.add(pan0, BorderLayout.NORTH);
          mainPan.add(pan1);
         add(pan0);
        //add(pan1, BorderLayout.SOUTH);
//          add(pan2);
        add(mainPan,BorderLayout.SOUTH);
      }
  }

