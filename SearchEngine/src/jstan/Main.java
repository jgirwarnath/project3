// This program is designed to provide a user with a comfortable
// graphical user interface in which they can easly navigate.
// It will allow searching of files, removing files and the
// adding of files.
//
// Written 02/16/2015 by Thomas Schlicher, Tampa Florida USA
package jstan;

import javax.swing.*;
import javax.swing.SwingUtilities;
import java.io.*;
/**
 *
 * @author thomas
 */
class Main extends JFrame
{
        static JFrame searchFrame;
        static JFrame maintenanceFrame;
	
	public Main()
	{
            searchFrame = new JFrame();
            searchFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            SearchEngine se = new SearchEngine();
            searchFrame.add(se);
            searchFrame.setSize(700, 500);
            searchFrame.pack();
            searchFrame.setLocationRelativeTo(null);
            searchFrame.setVisible(true);
            
            maintenanceFrame = new JFrame();
            maintenanceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Maintenance me = new Maintenance();
            maintenanceFrame.add(me);
            maintenanceFrame.setSize(600, 440);
            searchFrame.pack();
            maintenanceFrame.setLocationRelativeTo(null);
            maintenanceFrame.setVisible(false);
              
            
        }
        
    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(() -> {
            Main mm = new Main();
     
        });
        
        
        
                FileInputStream  fileIn = null;
		FileOutputStream fileOut = null;
		
                        try{
			fileIn = new FileInputStream("texts/input");
			fileOut = new FileOutputStream("texts/output");
			
			int i;
			while((i = fileIn.read())!=-1){
				
				fileOut.write(i);
			}
			
			
                        } catch (IOException ioe){}
			
                            
		
                         finally {
                                    try{
					if(fileIn !=null) {fileIn.close();}
					if(fileOut !=null) {fileOut.close();}
					
						
                                        }
                                        catch(IOException ioe){}
					
				
		}
		
	}

        
        
        
        
        
        
        
        
        
        
        
    }

