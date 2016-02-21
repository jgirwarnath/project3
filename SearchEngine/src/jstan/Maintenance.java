/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author ainfante4
 */
public class Maintenance extends JPanel
{
    
    public Maintenance()
    {
        //panel declarations
        JPanel main = new JPanel(new BorderLayout());
        JPanel N    = new JPanel(new FlowLayout());
        JPanel NC   = new JPanel(new FlowLayout());
        JPanel C    = new JPanel(new BorderLayout());
        JPanel CE   = new JPanel(new FlowLayout());
        JPanel CW   = new JPanel(new FlowLayout());
        JPanel S    = new JPanel(new BorderLayout());
        JPanel SN   = new JPanel(new FlowLayout());
        JPanel SW   = new JPanel(new FlowLayout());
        JPanel SE   = new JPanel(new FlowLayout());
        JPanel SS   = new JPanel(new FlowLayout());
        
        //labels
        JLabel title       = new JLabel("File Maintenance");
        JLabel version     = new JLabel("Version 1.00");
        JLabel numOfIndex  = new JLabel("Number of files Indexed: ");
        JLabel fileName    = new JLabel("File Name");
        JLabel status      = new JLabel("Status");
        
        //buttons
        JButton add     = new JButton("Add File(s)...");
        JButton update  = new JButton("Update");
        JButton remove  = new JButton("Remove selected files");
        JButton reCenter= new JButton("Recenter Windows");
        
        
        
        //north components
        main.add(N, BorderLayout.NORTH);
        title.setFont(new Font("Serif", Font.BOLD, 35 ));
        N.add(title);
        
        
        //South components
        //box.createRigidArea is creating space between components with 
        //125 of space between
        main.add(S, BorderLayout.SOUTH);
        S.add(SN, BorderLayout.NORTH);
        SN.add(add);
        SN.add(Box.createRigidArea(new Dimension(50,0)));
        SN.add(update);
        SN.add(Box.createRigidArea(new Dimension(50,0)));
        SN.add(remove);
        S.add(SS, BorderLayout.SOUTH);
        SS.add(reCenter);
        SS.add(Box.createRigidArea(new Dimension(125,0)));
        SS.add(numOfIndex);
        SS.add(Box.createRigidArea(new Dimension(125,0)));
        SS.add(version);
        
        //center components
        main.add(C, BorderLayout.CENTER);
        C.setPreferredSize(new Dimension(700, 325));
        C.add(CW, BorderLayout.WEST);
        CW.setPreferredSize(new Dimension (350, 325)); 
        CW.setBackground(Color.red);
        C.add(CE, BorderLayout.EAST);
        CE.setPreferredSize(new Dimension (350, 325));
        CE.setBackground(Color.black);
        
        add(main);
      }   
    }
