/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectTwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author W207282211
 */
public abstract class DataManager {
    
     public abstract String write(String fileName) throws Exception;
     
     public String read(String fileLocation) throws Exception {
			return null;	   
    	}
     }
