package chapter12;

import java.util.StringTokenizer;

/**
 * The DateComponent class extracts the month, 
 * day, and year from a string containing a date.
 * @author Gustavo
 *
 */

public class DateComponent {

	private String month;		// To hold the month
	private String day;			// To hold the day
	private String year;		// To hold the year
	
	/**
	 * The constructor accepts a String containing a date
	 * in the form MONTH/DAY/YEAR. It extracts the month,
	 * day, and year from the string.
	 * @param dateStr A String containing a date.
	 */
	
	public DateComponent(String dateStr){
		
		// Added this part in Chapter 12 for exceptions section 12.2
		// Ensure that dateStr is not null.
		if(dateStr == null)
		{
			throw new IllegalArgumentException(
					"null reference passed to DateComponent constructor.");
		}
		
		// Create a StringTokenizer object.
		StringTokenizer strTokenizer = new StringTokenizer(dateStr, "/");
		
		// Extract the tokens.
		month = strTokenizer.nextToken();
		day = strTokenizer.nextToken();
		year = strTokenizer.nextToken();
	}
	
	/** 
	 * getMonth method
	 * @return The month field.
	 */
	
	public String getMonth(){
		
		return month;
	}
	
	/** 
	 * getDay method
	 * @return The day field.
	 */
	
	public String getDay(){
		
		return day;
	}
	
	/** 
	 * getYear method
	 * @return The year field.
	 */
	
	public String getYear(){
		
		return year;
	}
}
