/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

/**
 *
 * @author Saurel
 * 
 */

import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import java.awt.BorderLayout;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class SearchEngine implements ActionListener{

	JFrame frame;
	private JTextField textField;
	private JTextField enteredText;
	private JRadioButton allSearch;
	private JRadioButton anyTerm;
	private JRadioButton exactTerm;
	JButton search;
	public static JTable table ;
        JLabel indexFiles;
	

	private static final String DELIMITER = null;
	
	
	
	/**
	 * Create the application.
	 */
	public SearchEngine() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search Engine");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(161, 13, 152, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search Term");
		lblNewLabel_1.setBounds(19, 56, 76, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Maintenance");
		btnNewButton.setBounds(-7, 239, 113, 23);
		frame.getContentPane().add(btnNewButton);
		
		MaintenanceAction listen = new MaintenanceAction();
		
		btnNewButton.addActionListener(listen);
		
		
		
		JButton btnNewButton_1 = new JButton("About");
		btnNewButton_1.setBounds(345, 239, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		AboutsC listen1 = new AboutsC();
		
		btnNewButton_1.addActionListener(listen1);
		
		
		 int counter = 0;
		indexFiles= new JLabel("Number of indexed: " +counter);
		indexFiles.setBounds(161, 243, 116, 14);
		frame.getContentPane().add(indexFiles);
                
                
                
                /*
                int counter = 0;
		numberOfFileIndexed = new JLabel("Number of files indexed:" + counter);
		numberOfFileIndexed.setBounds(191, 243, 156, 14);
		frame.getContentPane().add(numberOfFileIndexed);
		
		*/
	
		enteredText = new JTextField();
		enteredText.setBounds(105, 53, 230, 20);
		frame.getContentPane().add(enteredText);
		enteredText.setColumns(10);
		
		allSearch = new JRadioButton("Search all Term");
		allSearch.setBounds(29, 77, 136, 23);
		frame.getContentPane().add(allSearch);
		
		
		
		anyTerm = new JRadioButton("Any Term");
		anyTerm.setBounds(170, 80, 89, 23);
		frame.getContentPane().add(anyTerm);
		
		exactTerm = new JRadioButton("Exact Phrase");
		exactTerm.setBounds(294, 80, 109, 23);
		frame.getContentPane().add(exactTerm);
		
		search = new JButton("Search");
		search.setBounds(345, 52, 89, 23);
		frame.getContentPane().add(search);
		
		String[] tops = { "added", "S"};
		DefaultTableModel searchTable = new DefaultTableModel(null, tops)
		{
		};
		
		table = new JTable(searchTable);
		table.setBounds(15,107, 374, 81);
		frame.getContentPane().add(table);
	
		search.addActionListener(this);
		
	}
	
	private void indexCounter() {
		indexFiles.setText("Indexed: "+table.getRowCount());}
	
//action perform buttons in the maintenance gui

	@Override
	public void actionPerformed(ActionEvent e) {
		indexCounter();
		String input = enteredText.getText();
		String[] c = input.split("");
		
	//statement to check to see if there are files in the index
		if (Maintenance.userFiles.isEmpty()) {
			JOptionPane.showMessageDialog(null, "file not found");
			//System.out.println("file not found");
			}
		
		else if (input.length() == 0 ) {
			//System.out.println("Please enter a term to search.");
			JOptionPane.showMessageDialog(null, "Please enter a term to search");
		}
		
		
		else{
			
			if(e.getSource() == search){
			
				if(allSearch.isSelected()){
					Javan.containedItems(c);
					try {
						Maintenance.fileReader();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			
			else if(anyTerm.isSelected()){
			
					for (String k : c) {
						
						jTable(k);
						
						}
					}
				
			else if(exactTerm.isSelected()){
				//JOptionPane.showMessageDialog(null, "exact search");
			}
				
		}
		
		}
	}
	
	public static void jTable(String data) {
			
			( (DefaultTableModel) SearchEngine.table.getModel() ).addRow(data.split(DELIMITER));
		}
	 
	
}

class MaintenanceAction implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		
		Maintenance maint = new Maintenance();
	maint.frame.setVisible(true);
	}
}


class AboutsC implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		
		Abouts maint = new Abouts();
	maint.frame.setVisible(true);
	}
}


