package chapter11;

/**
 * Relatable interface
 * @author Gustavo
 *
 */

public interface Relatable {
	
	boolean equals(GradedActivity g);
	boolean isGreater(GradedActivity g);
	boolean isLess(GradedActivity g);

}
