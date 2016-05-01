/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Written by jstan, Tampa Florida USA
package jstan;

/**
 *
 * @author Saurel Cerome, Jonathan Girwar-Nath, Thomas Schlicher, Alex Infante
 */
import java.awt.*;


import javax.swing.*;
import javax.swing.table.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTable;
import javax.swing.JScrollPane;


public class Maintenance implements ActionListener {
	
	final static String PATH = "input";
	//final static String PATH = "tmp/fileindex";
	private static final String DELIMITER = null;
	String[] top = { "Filename", "Status"};
	private DefaultTableModel maintTable = new DefaultTableModel(null,top);
	final JFileChooser fileChooser = new JFileChooser();
	
	
	static ArrayList<String>userFiles = new ArrayList<>();
	String userFile;
	static String index = ",";
	static String[] indexed = {"Indexed"}; 
	static String itemsAdded;
	
	
	
	static JFrame frame;
	public static JTable table;
	JLabel numberOfFileIndexed;
	
	
	 
	

	/**
	 * Create the application.
	 */
	public Maintenance() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Search Engine - Index Maintenace");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(87, 11, 341, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("                                File Name       ");
		lblNewLabel_1.setBorder(BorderFactory.createLineBorder(Color.black));
		lblNewLabel_1.setBounds(0, 48, 242, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("                              Status           ");
		lblNewLabel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		lblNewLabel_2.setBounds(242, 48, 242, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton addFile = new JButton("Add File");
		addFile.setBounds(10, 205, 89, 23);
		frame.getContentPane().add(addFile);
		
		addFile.addActionListener(this);
		
		
		JButton rebuildButton = new JButton("Rebuild");
		rebuildButton.setBounds(148, 205, 160, 23);
		frame.getContentPane().add(rebuildButton);
		
		rebuildButton.addActionListener(this);
		
		JButton remove = new JButton("Remove Selected Files");
		remove.setBounds(318, 205, 166, 23);
		frame.getContentPane().add(remove);
		
		remove.addActionListener(this);
		
		
		JButton resetButton = new JButton("Reset Windows");
		resetButton.setBounds(0, 239, 129, 23);
		frame.getContentPane().add(resetButton);
		
		//actionLister reset Button
		resetButton.addActionListener(this);
		
		table = new JTable(maintTable);
		table.setBounds(0, 62, 484, 132);
		frame.getContentPane().add(table);
		
		 int counter = 0;
		numberOfFileIndexed = new JLabel("Number of files indexed:" + counter);
		numberOfFileIndexed.setBounds(191, 243, 156, 14);
		frame.getContentPane().add(numberOfFileIndexed);
		
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Search Engine 1.1");
		lblNewLabel_4.setBounds(353, 243, 106, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Test");
		btnNewButton.setBounds(69, 169, 16, -9);
		frame.getContentPane().add(btnNewButton);
		
		
	}

		
	
	
	
	//this method is the counter for the number of files in  the index
	private void indexCounter() {
		numberOfFileIndexed.setText("Number of files indexed: "+table.getRowCount());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String tableButton = e.getActionCommand();
		
		//reset Button
		if(tableButton.equals("Reset Windows")){
		frame.setSize(500,300);
		frame.setLocation(0,0);
		
		SearchEngine engine = new SearchEngine();
		engine.frame.setVisible(true);
		}
		
		//rebuild button
		else if(tableButton.equals("Rebuild")){
			System.out.println("rebuild");
			
			
		}
			
			
		
		 //remove button
		else if (tableButton.equals("Remove Selected Files")){
			int removeSelectedFile;
			removeSelectedFile= Maintenance.table.getSelectedRow();
			( (DefaultTableModel) Maintenance.table.getModel() ).removeRow(removeSelectedFile);	
			
			indexCounter();
			
			
			
		}
		
		//this will add file to the table button
		else if (tableButton.equals("Add File")){
			
			final JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
			fileChooser.showOpenDialog(null);
			//File userSelected = fileChooser.getSelectedFile();
			File userFiles = fileChooser.getSelectedFile();
			
			
			
			index(userFiles);
			indexCounter();
			
		
		}
	       
	}
	// buffer reader method 
        //dont really need this method
        //this method will read the file and print the result on the console
	public static void bufferReader() throws IOException{
		   BufferedReader buf = new BufferedReader(new FileReader(PATH));
		   String readText;
			while (( readText = buf.readLine() ) != null) {
				
				
			}
			
				buf.close();
	

	   }
	
	//dont really need this method
        //this method will read the file and print the result on the console
	public static void fileReader() throws IOException{
		FileReader file = new FileReader(PATH);
		BufferedReader reader = new BufferedReader(file);
		String data;
		
		while((data = reader.readLine()) != null){
			
			System.out.println(data);
			//AddToTable(data);
			
		}
		reader.close();
	}
	
	
	

	

	//this method will index the files
	public  void index (File file) {
		itemsAdded = file.getPath() + index + indexed[0]  ;
		userFiles.add(itemsAdded);
		getFiles(itemsAdded);
		
	}
        //this method will get the files and add them to the JTable
	public static void getFiles(String files) {
		 String separator = ",";
		( (DefaultTableModel) Maintenance.table.getModel() ).addRow(files.split(separator));
	}
	

	
		public static void JTable(String data) {
			// Add the file info to the JTable
			( (DefaultTableModel) SearchEngine.table.getModel() ).addRow(data.split(DELIMITER));
		}
	 
	
	
}
	   
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		

	
	
	
