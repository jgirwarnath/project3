// This class creates the first frame which allows users
// to do "and" / "or" searching. The maintenace frame can
// also be accessed from here. Box layout is used to design
// the graphical user interface.
//
// Written 02/16/2015 by Thomas Schlicher, Tampa Florida USA
package jstan;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
/**
 *
 * @author thomas
 */
class SearchEngine extends JPanel implements ActionListener
{
	private final JLabel titleLbl, searchLbl, dateLbl, indexLbl;
	private JTextField schTxt;
	private final JTextArea appTxt;
	private final JButton schBtn, maintenance, about;
	private final JRadioButton allSearch, anySearch, exactSearch;
	private final String allString = ("All of the Search Terms");
	private final String anyString = ("Any of the Search Terms");
	private final String exactString = ("Exact Phrase");
	private final Border dateBorder, indexBorder;
        
        
        Font font = new Font("Serif", Font.BOLD, 15);
        Color textColor = Color.GRAY;
	
                 //about button components
        private final String Authors = "<html> "
                                 + "<strong>Authors:</strong> <br>"
                                 + "<table border=\"1\" style=\"width:100%\">"
                                 + "  <tr>"
                                 + "     <td>Jonathan Girwar-Nath, Saurel Cerome "
                                 + "  </tr>"
                                 + "  <tr>"
                                 + "     <td>Thomas Sclichler, Alexander Infante "
                                 + "  </tr>"
                                 + "</table><br>"
                                 + "<strong>Version:</strong> 1.1 <br><br>" 
                                 + "<strong>Description:</strong>  This program is to search a local drive<br>"
                                 + "for a specific file and then index the files contents.<br><br>"
                                 + "Tampa, Fl  02/2016"
                                 + "</html>";

        private final ImageIcon aboutIcn;  
    private FocusListener l;
        
        

	
        @SuppressWarnings("empty-statement")
	public SearchEngine()
	{
		JPanel main = new JPanel();
		//creates vertical box so horizontal boxes can be placed within
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		
		//creates a box
		Box first = Box.createHorizontalBox();
		//creatimg ImageIcon and re-sizing to fit label
		//ImageIcon imgIcon = new ImageIcon(new ImageIcon("C:\\BoxGui\\search.png").getImage().getScaledInstance(300, 80, Image.SCALE_DEFAULT));
		titleLbl = new JLabel("Search Engine");
		titleLbl.setFont(new Font("sanseriff", Font.BOLD, 20));
		//titleLbl.setIcon(imgIcon);
		first.add(titleLbl);
		main.add(first);
		
		// used as a spacer between boxes
		main.add(Box.createVerticalStrut(10));
		
		Box second = Box.createHorizontalBox();
		//glue is used to keep objects properly aligned
		second.add(Box.createHorizontalGlue());
		searchLbl = new JLabel("Search Terms: ");
		second.add(searchLbl);
		second.add(Box.createHorizontalStrut(10));
		schTxt = new JTextField();
		second.add(schTxt);
		second.add(Box.createHorizontalStrut(10));
		schBtn = new JButton("Search");
		//setting alt key
		schBtn.setMnemonic(KeyEvent.VK_S);
		//schBtn.setEnabled(false);
		second.add(schBtn);
		schBtn.setToolTipText("Click to search for terms");
		schBtn.addActionListener(this);
		second.add(Box.createHorizontalGlue());
		main.add(second);
		
		Box tb = Box.createHorizontalBox();
		ButtonGroup group = new ButtonGroup();
			group.add(allSearch = new JRadioButton(allString));
			tb.add(allSearch);
			allSearch.setMnemonic(KeyEvent.VK_A);
			allSearch.setActionCommand(allString);
			allSearch.setToolTipText("Pick to do an ' and ' search");
			//this radiobutton will automatically be selected
			allSearch.setSelected(true);
		
			group.add(anySearch = new JRadioButton(anyString));
			tb.add(anySearch);
			anySearch.setMnemonic(KeyEvent.VK_N);
			anySearch.setActionCommand(anyString);
			anySearch.setToolTipText("Pick to do an ' or ' search");
		
			group.add(exactSearch = new JRadioButton(exactString));
			tb.add(exactSearch);
			exactSearch.setMnemonic(KeyEvent.VK_E);
			exactSearch.setActionCommand(exactString);
			exactSearch.setToolTipText("Pick to do an ' exact ' search");
			
			//allSearch.addActionListener(this);
			//anySearch.addActionListener(this);
			//exactSearch.addActionListener(this);
			
			main.add(tb);
		
		main.add(Box.createVerticalStrut(10));
		
		Box ftb = Box.createHorizontalBox();
		appTxt = new JTextArea(15, 50);
		ftb.add(appTxt);
		main.add(ftb);
		
		main.add(Box.createVerticalStrut(10));

		
		Box sixth = Box.createHorizontalBox();
		maintenance = new JButton("Maintenance");
		maintenance.setToolTipText("Click to go to maintenance form");
		sixth.add(maintenance);
		sixth.add(Box.createHorizontalStrut(500));
		maintenance.setMnemonic(KeyEvent.VK_M);
		about = new JButton("About");
		about.setToolTipText("Click to get information about search engine");
		sixth.add(about);
		about.setMnemonic(KeyEvent.VK_B);
		main.add(sixth);
		
		main.add(Box.createVerticalStrut(25));
		
		Box seventh = Box.createHorizontalBox();
		seventh.add(Box.createHorizontalGlue());
		dateBorder = BorderFactory.createLoweredBevelBorder();
		Date today = new Date();
		dateLbl = new JLabel(today.toString());
		dateLbl.setBorder(dateBorder);
		seventh.add(dateLbl);
		
		seventh.add(Box.createHorizontalStrut(280));
		indexBorder = BorderFactory.createLoweredBevelBorder();
		indexLbl = new JLabel("Number of index's on file: ");
		seventh.add(indexLbl);
		indexLbl.setBorder(indexBorder);
		seventh.add(Box.createHorizontalGlue());
		main.add(seventh);
		
                //adding icon to the about button
                this.aboutIcn = new ImageIcon(SearchEngine.class.getResource("/resources/aboutIcn"));
                
		add(main);
		
		//making use of an anonymous inner class 
		 maintenance.addActionListener((ActionEvent e) -> {
                     if(e.getSource() == maintenance)
                     {
                         Main.maintenanceFrame.setVisible(true);
                     }
                }); 

		 about.addActionListener((ActionEvent a) -> {
                     if(a.getSource() == about)
                     {
                          JOptionPane.showMessageDialog(null, Authors, "About", JOptionPane.INFORMATION_MESSAGE, aboutIcn);
                     }
                });      
                 
  
            //setting the search text and button tied together
            
            schTxt.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                schTxt.setText("");
                    schBtn.setEnabled(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
            
                schBtn.setEnabled(false);
                
                //i cant seem to change the color of the textField
                
                schTxt.setFont(font);
                schTxt.setText("Search here");
                    }
        });
		              
	}
	
        @Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == schBtn)
		{
			if(allSearch.isSelected())
			{
				JOptionPane.showMessageDialog(null, "all search");
			}
			else if(anySearch.isSelected())
			{
				JOptionPane.showMessageDialog(null, "any search");
			}
			else if(exactSearch.isSelected())
			{
				JOptionPane.showMessageDialog(null, "exact search");
			}

                }  
        }      
     
        
}
		
        
	


