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
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

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
    
    //removes file from the JTable in maintenance screen
    
    public void removeFileRow()
    {

        DefaultTableModel remove = (DefaultTableModel) Maintenance.table.getModel();
        if(Maintenance.table.getRowCount() == 0)
        {
           JOptionPane.showMessageDialog(null, "No files to remove", "Warning", JOptionPane.WARNING_MESSAGE);  
        }
        else{      
            
            remove.removeRow(Maintenance.table.getSelectedRow());
        }
    }
    
    //update files that have changed since the last index and add the time that it was updated.
    public void rebuildFile()
    {
        dtm = (DefaultTableModel) Maintenance.table.getModel();
        if (dtm.getRowCount() ==0)
        {   
            //throw message if there are no files to update
            JOptionPane.showMessageDialog(null, "There are no files to update.");           
        }
        else
        {
            //check files in jtable against files in the system
            
            //if there different remove file and update with new file
             JFileChooser fileChooser = new JFileChooser();
            File selectedFile = fileChooser.getSelectedFile(); 
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            dtm.addRow(new Object[]{selectedFile.getAbsoluteFile(), index});
            
            saveJTable();
        }
    }
    
    
    // This method will save all indexed files to JTable which can later
    // be loaded into JTable.
    public void saveJTable()
    {
        try {

            toFile = new FileWriter("/resources/JTableSaveInfo.txt", true);

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
        final String FILE_END = "endOfFiles";
        List<String> list = new ArrayList<>();
        DefaultTableModel loadTable = (DefaultTableModel) Maintenance.table.getModel();
        
        //trying out how this works
        try (BufferedReader br = Files.newBufferedReader(Paths.get("D:\\JavaSearchEngine\\part3\\SearchEngine\\resources\\JTableSaveInfo.txt"))) {
            
            br.readLine();
            br.readLine();
            br.readLine();
            String line;
            while(!(line = br.readLine()).equals(FILE_END) ) 
            {
                String[] seperate = line.split("\t");
                loadTable.addRow(new Object[]{seperate[1], seperate[2]});
            }

		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}

