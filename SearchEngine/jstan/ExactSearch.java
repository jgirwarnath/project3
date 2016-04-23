/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author alexanderinfante
 */
public class ExactSearch  extends JPanel 
{

   ExactSearch() throws FileNotFoundException{
            
      
      
      int lnCnt = 0;
      
      //read file in and save as hashmap
      Scanner in = new Scanner(new FileReader("/resources/JTableSaveInfo.txt"));    
      Map<String, String> map = new HashMap<>();
      
      while (in.hasNextLine() )
      {
          lnCnt ++;
          String[] columns;
          columns = in.nextLine().split("/n");
          map.put(columns[0], columns[1]);
          
      }
       
      JOptionPane.showMessageDialog(null, map.toString());
        
    }

    
    
    
}
