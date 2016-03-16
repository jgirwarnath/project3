/* This class will strictly deal with the functionality of
 * buttons.
*/
 
package jstan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jstan
 */
public class ActionHandler
{
    String index = "Indexed";
    DefaultTableModel dtm;
    BufferedWriter writer;
    //BufferedReader read;
    FileWriter toFile;
    ObjectOutputStream obj;
    ObjectInputStream objIn;
    
    // the addFile() will handle adding all files to JTable
    @SuppressWarnings("empty-statement")
    public void addFile()
    {
        // filechooser used to open up file explorer on any computer
        JFileChooser fileChooser = new JFileChooser();
        
        // used user.home to signal where the filechooser should open its
        // menu up to.
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            // here we will add files to JTable and then call a method to save them.
            File selectedFile = fileChooser.getSelectedFile(); 
            dtm = (DefaultTableModel) Maintenance.table.getModel();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            dtm.addRow(new Object[]{selectedFile.getAbsoluteFile(), index});
            
            saveJTable();
        }
    }
    
    public void removeFileRow()
    {
        JOptionPane.showMessageDialog(null, "No files to remove", "Warning", JOptionPane.WARNING_MESSAGE);     
    }
    
    // This method will save all indexed files to JTable which can later
    // be loaded into JTable.
    public void saveJTable()
    {
        try {

            toFile = new FileWriter("D:\\JavaProj3\\searchEngine\\SearchEngine\\src\\resources\\JTableSaveInfo.txt", true);

            for(int row = 0; row < Maintenance.table.getRowCount(); row++)
            {
                for(int col = 0; col < Maintenance.table.getColumnCount(); col++)
                {
                     toFile.write(Maintenance.table.getValueAt(row, col).toString()+"\t");
                }
               toFile.write("\n");
            }
            toFile.close();
            }catch (IOException ex) 
                {
                    Logger.getLogger(ActionHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
   public void loadJTable()
    {
       
    }
}
