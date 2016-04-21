/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thomas
 */
public class OrSearching 
{
    String wordsToSearch = SearchEngine.schTxt.getText();
    
    public void outPut()
    {
        DefaultTableModel searchedFiles = (DefaultTableModel) SearchEngine.searchTable.getModel();
        searchedFiles.addRow(new String [] {wordsToSearch});
        System.out.println(wordsToSearch);
    }
}
