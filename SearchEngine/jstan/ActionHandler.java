/* This class will strictly deal with the functionality of
 * buttons.
*/
 
package jstan;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jstan
 */
public class ActionHandler
{
    private Object[][] fileList;
    static int ID = 0;
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
            System.out.println("fileList " + selectedFile.getAbsolutePath());
            dtm.addRow(new Object[]{selectedFile.getAbsolutePath(), index});
            
            saveJTable();
        }
    }
    
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
    
    // This method will save all indexed files to JTable which can later
    // be loaded into JTable.
    public void saveJTable()
    {
 
        try {

            toFile = new FileWriter("D:\\JavaSearchEngine\\part3\\SearchEngine\\resources\\JTableSaveInfo.txt", true);
            
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
        DefaultTableModel loadTable = (DefaultTableModel) Maintenance.table.getModel();
        String line = null;
        //trying out how this works
        try (BufferedReader br = Files.newBufferedReader(Paths.get("D:\\JavaSearchEngine\\part3\\SearchEngine\\resources\\JTableSaveInfo.txt"))) {
            
            br.readLine();
            br.readLine();
            while( (line = br.readLine() ) != null ) {
                        loadTable.addRow( line.split("\t") );
            }

		} catch (IOException e) {
			e.printStackTrace();
		}
       
    }
}

/*List<String> newList = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get("D:\\JavaSearchEngine\\part3\\SearchEngine\\resources\\JTableSaveInfo.txt"))) {

		//br returns as stream and convert it into a List
		newList = br.lines().collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}
	
		newList.forEach(System.out::println);*/