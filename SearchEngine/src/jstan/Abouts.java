/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

/**
 *
 * @author JSTAN
 * Saurel Cerome, Jonathan Girwar-Nath, Thomas Schlicher, Alex Infante
 */
//this class is the about method that shows about us page
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Abouts {

	JFrame frame;

	
	public Abouts() {
		frame = new JFrame();
		frame.setTitle("Javans Search ");
		frame.setBounds(100, 100, 399, 279);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
                //creating the labels in the about the method
		JLabel lblNewLabel = new JLabel("Javans Search Engine 1.1");
		lblNewLabel.setBounds(98, 44, 180, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HCC 2016");
		lblNewLabel_1.setBounds(98, 67, 228, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Created by The JSTAN Group:");
		lblNewLabel_2.setBounds(98, 91, 166, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Thomas Schlicher");
		lblNewLabel_3.setBounds(98, 117, 120, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Alex Infante");
		lblNewLabel_4.setBounds(98, 142, 100, 30);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Jonathan Girwar-Nath");
		lblNewLabel_5.setBounds(98, 167, 130, 30);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Saurel Cerome");
		lblNewLabel_6.setBounds(98, 192, 100, 30);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
