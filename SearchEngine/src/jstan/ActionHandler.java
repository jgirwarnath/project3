/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author thomas
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
    
    @SuppressWarnings("empty-statement")
    public void addFile()
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION)
        {
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
    
    public void saveJTable()
    {
        try {

            toFile = new FileWriter("D:\\JavaProj3\\project3\\SearchEngine\\src\\resources\\JTableSaveInfo.txt");

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
/* try 
        {
            obj = new ObjectOutputStream(new FileOutputStream("D:\\JavaProj3\\project3\\SearchEngine\\src\\resources\\JTableSaveInfo.txt", true));
            obj.writeObject(dtm);
            obj.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/