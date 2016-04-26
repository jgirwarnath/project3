// This program is designed to provide a user with a comfortable
// graphical user interface in which they can easly navigate.
// It will allow searching of files, removing files and the
// adding of files.
//
// Written 02/16/2015 by jstan, Tampa Florida USA
package jstan;


import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.SwingUtilities;
/**
 *
 * @author jstan
 */
class Main extends JFrame
{
        static JFrame searchFrame;
        static JFrame maintenanceFrame;
	ImageIcon img;
  
        
        public Main()
	{
        this.img = new ImageIcon(Main.class.getResource("/resources/Icon"));
            
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
        //maintenanceFrame.pack();     //for some reason this kept causing my frames not to close on exit
        maintenanceFrame.setLocationRelativeTo(null);
        maintenanceFrame.setVisible(false);
            
        //changing image located on JFrame
        this.img = new ImageIcon(Main.class.getResource("/resources/Icon"));
        searchFrame.setIconImage(img.getImage());
        maintenanceFrame.setIconImage(img.getImage());  
            
         

        
        }
        
    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(() -> {
            Main mm = new Main();
        });
    }
    
    
    

    
}




	//the part below was free floating inside the main class,
	//if we are to use this it should be in a method within the
	//appropriate class.
/*	public void notSure()
	{
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
*/