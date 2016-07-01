package projectTwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class S2 {
	
	public String deleteItem(String itemDel) {
		try {
			File inputFile = new File("C:\\Users\\Gustavo\\Documents\\workspace\\COSC 1437 - Programming II\\src\\projectTwo\\list.txt");
			File tempFile = new File("C:\\Users\\Gustavo\\Documents\\workspace\\COSC 1437 - Programming II\\src\\projectTwo\\myTempFile.txt");

			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

			String lineToRemove = itemDel;
			String currentLine;

			while((currentLine = reader.readLine()) != null) {
			    // trim newline when comparing with lineToRemove
			    String trimmedLine = currentLine.trim();
			    if(trimmedLine.contains(lineToRemove)) continue;
			    writer.write(currentLine + System.getProperty("line.separator"));
			}
			writer.close(); 
			reader.close();
			inputFile.delete();
			boolean success = tempFile.renameTo(name);
			
			JOptionPane.showMessageDialog(null, success);
	} catch (FileNotFoundException e){
		e.printStackTrace();
	} catch (Exception e){
		e.printStackTrace();
	}
		return null;
	}


	
public static void main(String[] args) throws IOException, NullPointerException{
	S2 a = new S2();
	a.deleteItem("car");
}
}
