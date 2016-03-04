// This program is designed to provide a user with a comfortable
// graphical user interface in which they can easly navigate.
// It will allow searching of files, removing files and the
// adding of files.
//
// Written 02/16/2015 by Thomas Schlicher, Tampa Florida USA
package jstan;

import javax.swing.*;
import javax.swing.SwingUtilities;
/**
 *
 * @author thomas
 */
class Main extends JFrame
{
	//changing image located on JFrame
	//ImageIcon img = new ImageIcon("C:\\BoxGui\\face.jpg");
	
	public Main()
	{
            JFrame frame = new JFrame();
            //frame.setIconImage(img.getImage());
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            SearchEngine se = new SearchEngine();
            frame.add(se);
            frame.setSize(700, 500);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
            JFrame frame2 = new JFrame();
            //frame2.setIconImage(img.getImage());
            frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Maintenance me = new Maintenance();
            frame2.add(me);
            frame2.setSize(600, 440);
            frame.pack();
            frame2.setLocationRelativeTo(null);
            frame2.setVisible(true);
            
            
        }
        
        public void frameTwo()
        {
            
        }
        
    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(() -> {
            Main mm = new Main();
        });
    }
}
