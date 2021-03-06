package chapter10;

/** 
 * This program demonstrates the DateComponent class.
 * @author Gustavo
 *
 */

public class DateTester {

	public static void main(String[] args) {
		
		String date = "10/23/2009";
		DateComponent dc = new DateComponent(date);
		
		System.out.println("Here's the date: " + date);
		System.out.println("The month is " + dc.getMonth());
		System.out.println("The day is " + dc.getDay());
		System.out.println("The year is " + dc.getYear());
	}
}
