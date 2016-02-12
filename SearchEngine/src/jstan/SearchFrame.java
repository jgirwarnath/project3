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
 * @author thomas
 */
public class SearchFrame extends JPanel implements ActionListener
{
        final private JLabel title, termLbl;
	final private JButton search, maintenance, about;
	final private JTextField searchTxt;
	final private JRadioButton allSearch, anySearch, exactSearch;
	final private String allString = ("All of the Search Terms");
	final private String anyString = ("Any of the Search Terms");
	final private String exactString = ("Exact Phrase");
        
    public SearchFrame()
    {
       

		//setLayout(new BorderLayout());
		JPanel top = new JPanel();
		top.setLayout(new BorderLayout());
		
		JPanel topTop = new JPanel();
			topTop.setLayout(new FlowLayout());
			title = new JLabel("Search Engine");
			title.setFont(new Font("SansSerif", Font.BOLD, 24));
			topTop.add(title, BorderLayout.NORTH);
			top.add(topTop, BorderLayout.NORTH);
			
			JPanel topCenter = new JPanel();
			topCenter.setLayout(new BorderLayout());
				termLbl = new JLabel("Search Term:");
				topCenter.add(termLbl, BorderLayout.WEST);
				searchTxt = new JTextField();
				topCenter.add(searchTxt, BorderLayout.CENTER);
				search = new JButton("Search");
				topCenter.add(search, BorderLayout.EAST);
				top.add(topCenter, BorderLayout.CENTER);
			
			//JPanel topSouth = new JPanel();
			//topSouth.setLayout(new FlowLayout());
			
				allSearch = new JRadioButton(allString);
				allSearch.setMnemonic(KeyEvent.VK_A);
				allSearch.setActionCommand(allString);
				allSearch.setSelected(true);
		
				anySearch = new JRadioButton(anyString);
				anySearch.setMnemonic(KeyEvent.VK_N);
				anySearch.setActionCommand(anyString);
		
				exactSearch = new JRadioButton(exactString);
				exactSearch.setMnemonic(KeyEvent.VK_E);
				exactSearch.setActionCommand(exactString);
				
				//allSearch.addActionListener(this);
				//anySearch.addActionListener(this);
				//exactSearch.addActionListener(this);
				
			JPanel radioPanel = new JPanel(new GridLayout(1,3));
				radioPanel.add(allSearch);
				radioPanel.add(anySearch);
				radioPanel.add(exactSearch);
				
				topCenter.add(radioPanel, BorderLayout.SOUTH);
				
				
			JPanel south = new JPanel();
			south.setLayout(new BorderLayout());
				maintenance = new JButton("Maintenance..");
				maintenance.setMnemonic(KeyEvent.VK_M);
				south.add(maintenance, BorderLayout.WEST);
				
				about = new JButton("About");
				about.setMnemonic(KeyEvent.VK_S);
				south.add(about, BorderLayout.EAST);
			
				top.add(south, BorderLayout.SOUTH);	
			add(top);			
			
						
	}
	
	public void actionPerformed(ActionEvent ae)
	{
	
	}
}
