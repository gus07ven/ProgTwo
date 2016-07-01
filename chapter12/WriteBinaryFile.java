package chapter12;

import java.io.*;

/** 
 * This program opens a binary file and writes the contents 
 * of an int array to the file. 
 * @author Gustavo
 *
 */

public class WriteBinaryFile {
	
	public static void main(String[] args) throws IOException {
		
		// An array to write to the file
		int[] numbers = {2,4,6,8,10,12,14};
		
		// Create the binary output objects.
		FileOutputStream fStream = new FileOutputStream("Numbers.dat");
		DataOutputStream outputFile = new DataOutputStream(fStream);
		
		System.out.println("Writing the numbers to the file...");
		
		// Write the array elements to the file.
		for (int i = 0; i< numbers.length; i++)
			outputFile.writeInt(numbers[i]);
		
		System.out.println("Done.");
		
		// Close the file.
		outputFile.close();
	}

}
