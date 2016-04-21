/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

/**
 *
 * @author Saurel
 */
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
		
		JLabel lblNewLabel = new JLabel("Javans Search Engine 1.1");
		lblNewLabel.setBounds(98, 44, 180, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HCC 2016");
		lblNewLabel_1.setBounds(98, 67, 228, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Written by the Javans:");
		lblNewLabel_2.setBounds(98, 91, 166, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Thomas");
		lblNewLabel_3.setBounds(98, 117, 80, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Alex");
		lblNewLabel_4.setBounds(98, 142, 80, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Jonathan");
		lblNewLabel_5.setBounds(98, 167, 80, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Saurel");
		lblNewLabel_6.setBounds(98, 192, 80, 14);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
