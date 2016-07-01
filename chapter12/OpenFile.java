package chapter12;

import java.io.*;					// For File class and FileNotFoundException
import java.util.Scanner;			// For the Scanner class

import javax.swing.JOptionPane;		// For the JOptionPane class

import org.eclipse.swt.internal.mozilla.nsDynamicFunctionLoad;

/**
 * This program demonstrates how a FileNotFoundException
 * exception can be handled. 
 * @author Gustavo
 *
 */

public class OpenFile {
	
	public static void main(String[] args) {
	
		File file;				// For file input
		Scanner inputFile;		// For file input
		String fileName;		// To hold a file name
		
		// Get a file name from the user
		fileName = JOptionPane.showInputDialog("Enter the name of the file: ");
		
		// Attempt to open the file
		try {
			file = new File(fileName);
			inputFile = new Scanner(file);
			JOptionPane.showMessageDialog(null, "The file was found.");
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File not found.");
		}
		
		JOptionPane.showMessageDialog(null, "Done.");
		System.exit(0);
	}
}
