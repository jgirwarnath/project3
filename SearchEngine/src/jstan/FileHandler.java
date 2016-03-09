/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thomas
 */
public class FileHandler 
{
    String index = "Indexed";
    DefaultTableModel dtm;
    
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
        }
    }
    
    public void removeFileRow()
    {
        if (Maintenance.table.getSelectedRow() != -1)
        {
            int numRows = Maintenance.table.getSelectedRows().length;
            for(int i = 0; i < numRows; i++)
            {
                dtm.removeRow(Maintenance.table.getSelectedRow());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No files to remove", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}
