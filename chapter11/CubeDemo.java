package chapter11;

import java.util.Scanner;

/**
 * This program demonstrates passing arguments
 * to a superclass constructor.
 * @author Gustavo
 *
 */

public class CubeDemo {

	public static void main(String[] args) {
		
		double length;			// The cube's length.
		double width;			// The cube's width.
		double height;			// The cube's height.
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		// Get cube's length.
		System.out.println("Enter the following dimensions of a cube:");
		System.out.println("Length: ");
		length = keyboard.nextDouble();
		
		// Get the cube's width
		System.out.println("Width: ");
		width = keyboard.nextDouble();
		
		// Get the cube's height.
		System.out.println("Height: ");
		height = keyboard.nextDouble();
		
		// Createa cube object and pass the
		// dimensions to the constructor.
		Cube myCube = new Cube(length, width, height);
		
		// Display the cube's properties.
		System.out.println("Here are the cube's properties:");
		System.out.println("Length: " + myCube.getlength());
		System.out.println("Width: " + myCube.getWidth());
		System.out.println("Height: " + myCube.getHeight());
		System.out.println("Base Area: " + myCube.getArea());
		System.out.println("Surface Area: " + myCube.getSurfaceArea());
		System.out.println("Volume: " + myCube.getVolume());
	}
}
