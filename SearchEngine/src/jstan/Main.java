
package jstan;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.SwingUtilities;
/**
 *
 * @author thomas
 */
class Main extends JFrame
{
	ImageIcon img = new ImageIcon("C:\\BoxGui\\face.jpg");
	
	public Main()
	{
	
            JFrame frame = new JFrame();
            frame.setIconImage(img.getImage());
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            SearchEngine se = new SearchEngine();
            frame.add(se);
            frame.setSize(700, 500);
            //frame.pack();
            frame.setLocationByPlatform(true);
            frame.setVisible(true);
            
            JFrame frame2 = new JFrame();
            frame2.setIconImage(img.getImage());
            frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Maintenance me = new Maintenance();
            frame2.add(me);
            frame2.setSize(600, 440);
            //frame.pack();
            frame2.setLocationByPlatform(true);
            frame2.setVisible(true);
            
            
        }
        
    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(new Runnable() 
		{
            public void run() 
			{
				Main mm = new Main();
            }
        });
    }
}