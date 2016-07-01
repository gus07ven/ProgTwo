package chapter11;

public class FinalExam2 extends GradedActivity2 {

/**
 * This class determines the grade for a final exam.
 * @author Gustavo
 *
 */
	
	private int numQuestions;		// Number of questions
	private double pointsEach;		// Points for each question
	private int numMissed;			// Questions missed
	
	/**
	 * The constructor sets the number of questions on the 
	 * exam and the number of questions missed.
	 * @param questions The number of questions.
	 * @param missed The number of questions missed.
	 */

	public FinalExam2(int questions, int missed){
		
		double numericScore;		// To hold a numeric score
		
		// Set the numQuestions and numMissed fields.
		numQuestions = questions;
		numMissed = missed;
		
		// Calculate the points for each question and 
		// The number score for this exam.
		pointsEach = 100.0/ questions;
		numericScore = 100.0 - (missed * pointsEach);
		
		// Call the inherited setScore method to 
		// set the numeric score.
		setScore(numericScore);
	}
	
	/**
	 * The getPointsEach method returns the number of 
	 * points each question is worth.
	 * @return The value in the pointsEach field.
	 */
	
	public double getPointsEach(){
		
		return pointsEach;
	}
	
	/**
	 * The getNumMissed method returns the number of 
	 * questions missed.
	 * @return The value in the numMissed field.
	 */
	
	public int getNumMissed(){
		
		return numMissed;
	}
	
	/**
	 * The adjustScore method adjusts a numeric score.
	 * If score is within 0.5 points of the next whole
	 * number, it rounds the score up.
	 */
	
	private void adjustScore(){
		
		double fraction;
		
		// Get the fractional part of the score.
		fraction = score - (int) score;
		
		// If the fractional part is .5 or greater, 
		// round the score up to the next whole number.
		if(fraction >= .05)
			score = score + (1.0 - fraction);
	}
}