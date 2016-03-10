/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
        try 
        {
            File file = new File("D:\\JavaProj3\\project3\\SearchEngine\\src\\resources");
            if(!file.exists())
            {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file.getAbsolutePath());
            writer = new BufferedWriter(fw);
            
            for(int i = 0; i < Maintenance.table.getRowCount(); i++)
                for(int j = 0; j < Maintenance.table.getColumnCount(); j++)
                {
                    writer.write(Maintenance.table.getModel().getValueAt(i, j) + " ");
                }
            writer.write("\n__________\n");
            writer.close();
            fw.close();
            //obj = new OutputStreamWriter(new FileOutputStream("D:\\JavaProj3\\project3\\SearchEngine\\src\\resources\\JTableSaveInfo.txt", true));
            //obj.write(Maintenance.table);
            //obj.close();
        } catch (IOException ex) {
            Logger.getLogger(ActionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   /* public void loadJTable()
    {
        try {
            objIn = new ObjectInputStream(new FileInputStream("\\resources\\JTableSaveInfo"));
            Maintenance.table = (JTable) objIn.readObject();
        } catch (IOException ex) {
            Logger.getLogger(ActionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
}
