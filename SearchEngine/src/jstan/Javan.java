/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstan;

/**
 *
 * @author Saurel
 */
import java.awt.List;
import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import javax.swing.table.DefaultTableModel;

public class Javan{

private static final String DELIMITER = null;

//the map for the inverted index
private static HashMap<String,ArrayList> mapIndex = new HashMap<String,ArrayList>();


public Javan(){
	}




//this method will test to see if the word is in the index	
public boolean containsKey(String key) {
	//if (mapIndex.containsKey(key))
	return mapIndex.containsKey(key);
	
}

/**
public static  void checkMap(String file) throws FileNotFoundException {
	int checker = 1;
	String[] tokens = file.split(DELIMITER);
	String filePath = tokens[0];
	
	Scanner userinput = new Scanner(new File(filePath));
	
    Iterator it = mapIndex.entrySet().iterator();
    
    while (it.hasNext()) {
    //   HashMap.Entry pairs = (Map.Entry)it.next();
       
        String input = userinput.next();
        if (mapIndex.containsKey(input)){
        	ArrayList value = new ArrayList();
        	Pair<String,Integer> pair = new Pair<String,Integer>(filePath, checker);
        	value.add(pair);
			mapIndex.put(input, value);
        }
        else{
        	ArrayList value = mapIndex.get(input);
        	Pair<String,Integer> pair = new Pair<String,Integer>(filePath, checker);
			value.add(pair);
        	mapIndex.put(input, value);
        }
     
        }
   
}

*/






//method to iterate 
public void newM(){
	for(String key : mapIndex.keySet()) {
	    if(key.length() == 4){
	    	mapIndex.put(key, mapIndex.get(key));
	    }
	}
}


  public void Javan(HashMap<String, ArrayList> maps){
	        this.mapIndex = maps;

	    }

	 
		
 public void printIndex() {
			Iterator iter = mapIndex.keySet().iterator();
			while (iter.hasNext()) {
				String key = iter.next().toString();
				String value = mapIndex.get(key).toString();
				System.out.println(key + " " + value);
			}
		}
				 
	 
//method to add the file to the jTable
 public static void jTable(String data) {
			
			( (DefaultTableModel) SearchEngine.table.getModel() ).addRow(data.split(DELIMITER));
		}
	 
	
	 

 //this method will check to see in the term is in the file
 //all term search
 public static  Javan containedItems(String[] keys) {
		
		boolean inThere = false;
		
		boolean notIndex = false;
		int counter = 0;
		
		for (String k : keys) {
			if (mapIndex.containsKey(k)) {
				notIndex = true;
			}
		}
		
		
		
		if (!notIndex) {
			for (String s : Maintenance.userFiles) {
				String[] tokens = s.split(DELIMITER);
				String doc = tokens[0];
				for (String k : keys) {
					ArrayList<Pair> vals = mapIndex.get(k);
					for (Pair p : vals) {
						if (p.getLeft().toString() == doc) {
							inThere = true;
						}
					}
					if (inThere = true)
						;
					{
						counter++;
					}
					inThere = false;
				}
				
			}
			
		} 
		
		return null;
	}
	
	
}