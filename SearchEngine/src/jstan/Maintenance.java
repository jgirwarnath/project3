// This class is used to create the second frame which will
// allow the maintenance of the files. These files can be 
// added, removed or rebuilt. Alt keys and tool tips have been 
// used to allow the user access data easier while knowing what
// something does.
//
// Written 02/16/2015 by Thomas Schlicher, Tampa Florida USA
package jstan;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
/**
 *
 * @author thomas
 */
public class Maintenance extends JPanel implements ActionListener
{
    private final JLabel titleLbl2, fnLbl, statusLbl, versionLbl, indxLbl;
    private final JTextArea txt;
    private final JButton addBtn, rebuild, remove, reset;
    private final Border indexBorder;
    
    public Maintenance()
    {
    	//using Box Layout for the JFrame development
        JPanel main2 = new JPanel();
	main2.setLayout(new BoxLayout(main2, BoxLayout.Y_AXIS));
		
	Box one = Box.createHorizontalBox();
            titleLbl2 = new JLabel("Search Engine - Maintenance Form");
            titleLbl2.setFont(new Font("SansSerif", Font.BOLD, 20));
            one.add(titleLbl2);
	main2.add(one);
	
	//strut is used to put spacing between the different boxes.	
	main2.add(Box.createVerticalStrut(10));
		
	Box two = Box.createHorizontalBox();
            fnLbl = new JLabel("File Name");
            indexBorder = BorderFactory.createLineBorder(Color.black);
            fnLbl.setBorder(indexBorder);
            fnLbl.setMaximumSize(new Dimension(300, 50));
            two.add(fnLbl);
            statusLbl = new JLabel("Status");
            statusLbl.setBorder(indexBorder);
            statusLbl.setMaximumSize(new Dimension(300, 50));
            two.add(statusLbl);
        main2.add(two);
        
        Box three = Box.createHorizontalBox();
            txt = new JTextArea(15, 52);
            txt.setBorder(indexBorder);
            txt.setEditable(false);
            three.add(txt);
        main2.add(three);
        
        //creating radiobuttons
        Box four = Box.createHorizontalBox();
            addBtn = new JButton("Add File");
            //setting alt keys
            addBtn.setMnemonic(KeyEvent.VK_A);
            //schBtn.setEnabled(false);
            //tool tip to let user know what this button does.
            addBtn.setToolTipText("Click to add a file");
            addBtn.addActionListener(this);
            four.add(addBtn);
            
            four.add(Box.createHorizontalGlue());
            rebuild = new JButton("Old - Rebuild");
            rebuild.setMnemonic(KeyEvent.VK_O);
            rebuild.setToolTipText("Click to rebuild out-of-date files");
            rebuild.addActionListener(this);
            four.add(rebuild);
            
            //glus is used to keep the positiong of items in the box balanced.
            four.add(Box.createHorizontalGlue());
            remove = new JButton("Remove files");
            remove.setMnemonic(KeyEvent.VK_R);
            remove.setToolTipText("Click to remove all highlighted files");
            remove.addActionListener(this);
            four.add(remove);
        main2.add(four);
        
        main2.add(Box.createVerticalStrut(48));
        
        Box five = Box.createHorizontalBox();
            reset= new JButton("Reset Window");
            reset.setMnemonic(KeyEvent.VK_E);
            reset.setToolTipText("Click to rsize the window");
            five.add(reset);
            reset.addActionListener(this);
            five.add(Box.createHorizontalGlue());
            
            indxLbl = new JLabel("Number of index's on file: ");
            five.add(indxLbl);
            five.add(Box.createHorizontalGlue());
            
            versionLbl = new JLabel("Version 1.1");
            five.add(versionLbl);
        main2.add(five);
        
        add(main2);
    }
    
    //method that allows the action on button clicks
    @Override
    public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == addBtn)
		{
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                    int result = fileChooser.showOpenDialog(this);
                    if (result == JFileChooser.APPROVE_OPTION)
                    {
                        File selectedFile = fileChooser.getSelectedFile();
                         System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                        txt.append(selectedFile.getName() + "." + "\t\t" + "Indexed" + "\n");
                    }
		}
                else if(ae.getSource() == rebuild)
                {
                    JOptionPane.showMessageDialog(null, "This button will rebuild out of date files"); 
                }
                else if(ae.getSource() == remove)
                {
                    JOptionPane.showMessageDialog(null, "This button will remove all highlighted files");
                }
                else if(ae.getSource() == reset)
                {
                    JOptionPane.showMessageDialog(null, "This button will reset the window position");
                }
	}
}
