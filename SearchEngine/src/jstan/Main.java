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
	ImageIcon img = new ImageIcon("/resources/icon");
        
        static JFrame frame;
        static JFrame frame2;
	
	public Main()
	{
            this.img = new ImageIcon(Main.class.getResource("/resources/icon"));
        
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            SearchEngine se = new SearchEngine();
            frame.add(se);
            frame.setSize(700, 500);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
        
            frame2 = new JFrame();

            frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Maintenance me = new Maintenance();
            frame2.add(me);
            frame2.setSize(600, 440);
            frame.pack();
            frame2.setLocationRelativeTo(null);
            frame2.setVisible(false);
            
            //adding icons
            this.img = new ImageIcon(Main.class.getResource("/resources/icon"));
            frame.setIconImage(img.getImage());
            frame2.setIconImage(img.getImage());    

            
            
        }
        
        public void reset()
        {
            frame.setLocationRelativeTo(null);
            frame2.setLocationRelativeTo(null);
        }
        
    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(() -> {
            Main mm = new Main();
        });
    }
}
