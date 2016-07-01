package projectTwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;


public class GarageSaleImp extends DataManager implements IGarageSale {
	
	//Dawit, I commented out all the methods in the main method. Let me know if you prefer
	// for me to do things differently in the future sir. Thank you!

	public static void main(String[] args) throws Exception {
		GarageSaleImp b1 = new GarageSaleImp();
		//b1.read("C:\\Users\\Gustavo\\Documents\\workspace\\COSC 1437 - Programming II\\src\\projectTwo\\garageSale.txt");
		//b1.write("gs2.txt");
		//b1.read("garagaSale.txt");
		//b1.displayAllItems();
		//b1.searchItem("car");
		//b1.deleteItem("weight");
	}

	private String fileName;
	private String fileLocation;

	@Override
	public String searchItem(String itemSer) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(
					new File(
							"C:\\Users\\Gustavo\\Documents\\workspace\\COSC 1437 - Programming II\\src\\projectTwo\\garageSale.txt"));
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String a = line;
				String b = itemSer;
				if (a.toLowerCase().contains(b.toLowerCase())) {
					System.out.println(a);
					JOptionPane.showMessageDialog(null,
							"The item has been printed to the console.");
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String displayAllItems() {
		try {
			File file = new File(
					"C:\\Users\\Gustavo\\Documents\\workspace\\COSC 1437 - Programming II\\src\\projectTwo\\garageSale.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, ",", true);
				while (st.hasMoreTokens()) {
					line = st.nextToken();
					if (line.equals(",")) {
						break;
					} else {
						System.out.println(line);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null,
				"The items are displayed in the console.");
		return null;
	}

	@Override
	public String addItemAndLocation(GarageSale a) throws IOException {
		FileWriter fwriter = new FileWriter(
				"C:\\Users\\Gustavo\\Documents\\workspace\\COSC 1437 - Programming II\\src\\projectTwo\\garageSale.txt",
				true);
		PrintWriter outputFile = new PrintWriter(fwriter);
		outputFile.println("\n" + a.getItem() + ", " + a.getLocation());
		outputFile.close();
		String result = "The item " + a.getItem() + " and location "
				+ a.getLocation() + " have been added";
		System.out.print(result);
		return result;
	}

	@Override
	public String deleteItem(String itemDel) throws Exception {
		File inputFile = new File("C:\\Users\\Gustavo\\Documents\\workspace\\COSC 1437 - Programming II\\src\\projectTwo\\garageSale.txt"); 
		File tempFile = new File("C:\\Users\\Gustavo\\Documents\\workspace\\COSC 1437 - Programming II\\src\\myTempFile.txt");
		
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String lineToRemove = itemDel;
		String currentLine;
		
		while((currentLine = reader.readLine()) != null) {
			String trimmedLine = currentLine.trim();
		    if(trimmedLine.contains(lineToRemove)) continue;

		    writer.write(currentLine + System.getProperty("line.separator"));
		}

		reader.close();
		writer.close();
		inputFile.delete();
		
		File replaceFile = new File("C:\\Users\\Gustavo\\Documents\\workspace\\COSC 1437 - Programming II\\src\\projectTwo\\garageSale.txt");

		boolean successful = tempFile.renameTo(replaceFile);
		System.out.println(successful);
		String worked = "The item has been deleted";
		System.out.println(worked);
		return worked;
	}

	@Override
	public String write(String fileName) {
		String fileAddress = "C:\\Users\\Gustavo\\Documents\\workspace\\COSC 1437 - Programming II\\src\\projectTwo\\" + fileName;
		PrintWriter writer = null;
		try {
			FileWriter fw = new FileWriter(fileAddress, true);
			writer = new PrintWriter(fw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String add = JOptionPane
				.showInputDialog("Please type what you would like to add to the file.");
		writer.println("\n");
		writer.println(add);
		writer.close();
		String added = "The info was added to the file. Thank you!";
		JOptionPane.showMessageDialog(null,
				"The input has been added to the file. Thanks!");
		return added;
	}

	@Override
	public String read(String fileLocation) {
		fileLocation = "C:\\Users\\Gustavo\\Documents\\workspace\\COSC 1437 - Programming II\\src\\projectTwo\\garageSale.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(fileLocation);
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null,
				"The file content printed in the console. Thanks!");
		return null;
	}
}

