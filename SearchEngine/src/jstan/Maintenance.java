// This class is used to create the second frame which will
// allow the maintenance of the files. These files can be 
// added, removed or rebuilt. Alt keys and tool tips have been 
// used to allow the user access data easier while knowing what
// something does.
//
// Written 02/16/2015 by Thomas Schlicher, Tampa Florida USA
package jstan;
import javax.swing.table.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
/**
 *
 * @author thomas
 */
public class Maintenance extends JPanel implements ActionListener
{
    private final JLabel titleLbl2, versionLbl, indxLbl;
    private int indexCount = 0;
    // fnLbl, statusLbl,
    //private final JTextArea txt;
    private JTable table;
    String index = "Indexed";
    private final JButton addBtn, rebuild, remove, reset;
    //private final Border indexBorder;
    private String file = "";
    
    
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
        
        Box three = Box.createHorizontalBox();
            table = new JTable(0, 2);
            JTableHeader th = table.getTableHeader();
            TableColumnModel tcm = th.getColumnModel();
            TableColumn tc = tcm.getColumn(0);
            TableColumn tc2 = tcm.getColumn(1);
            tc.setHeaderValue("File Name");
            tc2.setHeaderValue("Status");
            th.repaint();
            JScrollPane sp = new JScrollPane(table);
            sp.getViewport().setBackground(Color.WHITE);
            sp.setPreferredSize(new Dimension(580, 258));
            three.add(sp);
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
                        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
                        System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                       // Vector v = new Vector();
                        //v.add(file);
                        //v.add(index);
                        dtm.addRow(new Object[]{selectedFile.getAbsoluteFile(), index});
                        
                        //table.append(selectedFile.getName() + "." + "\t\t" + "Indexed" + "\n");
                    }
		}
                else if(ae.getSource() == rebuild)
                {
                    JOptionPane.showMessageDialog(null, "This button will rebuild out of date files"); 
                }
                else if(ae.getSource() == remove)
                {
                    //be sure to use mouse listener when removing the files from the list.
                    JOptionPane.showMessageDialog(null, "This button will remove all highlighted files");
                }
                else if(ae.getSource() == reset)
                {
                    Main.frame.setLocationRelativeTo(null);
                    Main.frame2.setLocationRelativeTo(null);
                }
	}
}
