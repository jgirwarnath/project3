/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//this class is the main class that has the main method

// This program is designed to provide a user with a comfortable
// graphical user interface in which they can easly navigate.
// It will allow searching of files, removing files and the
// adding of files.
package jstan;

/**
 *
 * @author JSTAN
 *  Written by jstan, Tampa Florida USA
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;


/**
	 * Launch the application.
	 */
public class Main {
	
	public static void main(String [] args){
		
		SearchEngine bas = new SearchEngine();
		bas.frame.setVisible(true);
		
		
		Maintenance maint = new Maintenance();
		maint.frame.setVisible(true);
		
		
		FileInputStream  fileIn = null;
		FileOutputStream fileOut = null;
		
		try{
			fileIn = new FileInputStream("texts/input");
			fileOut = new FileOutputStream("texts/output");
			
			int i;
			while((i = fileIn.read())!=-1){
				
				fileOut.write(i);
			}
			
			
		} catch (IOException ioe){
			
		}
		
		finally {
				try{
					if(fileIn !=null) {fileIn.close();}
					if(fileOut !=null) {fileOut.close();}
					
						
				}
				catch(IOException ioe){
					
				}
		}
		
	}

		
		
		
		
	}
	

