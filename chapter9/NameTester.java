package chapter9;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * This program creates a FullName object, and then
 * calls the object's getLength method before values
 * are established for its refence fields. As a result,
 * this program will crash.
 * @author Gustavo
 *
 */

public class NameTester {

	public static void main(String[] args) {	
		
		// Create a FullName object
		FullName name = new FullName();
		
		// Get the length of the full name.
		int len = name.getLength();
		
		System.out.print(len);
	}
}
