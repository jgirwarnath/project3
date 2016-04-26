/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;


import javax.swing.table.DefaultTableModel;


/**
 *
 * @author alexanderinfante
 */
public class ExactSearch
{

   



    public String outPut()
    {
        //get phrase to search for
        String wordToSearch = SearchEngine.schTxt.getText();
        
        //gets information to search for and writes it to the JTable on search engine
        DefaultTableModel searchedFiles = (DefaultTableModel) SearchEngine.searchTable.getModel();
        searchedFiles.addRow(new String [] {wordToSearch});
  
       return (wordToSearch);
       
    }
        
    

    
    
    
}
