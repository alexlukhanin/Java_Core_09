/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 09 - Exceptions, Java code convention
 * part 02 
 * *
 */

package hw09;

/**
 * * Different Exceptions application
 * 
 * @author alexl
 * 
 * @version 1.0
 *
 */

public class Methods {
	/* This class can do 4 arithmetic methods */

	/* The declaration of the arguments for arithmetic operations */
	private double arg1;
	private double arg2;

	/* The constructor of the class. Uses exceptions for arguments arg1 and arg2 */
	public Methods(double arg1, double arg2) {
		super();
		this.arg1 = arg1;
		this.arg2 = arg2;

	}

	/* getters */
	public double getArg1() {
		return arg1;
	}

	public double getArg2() {
		return arg2;
	}

	/* declaration of methods */
	public double sumArguments() {
		return arg1 + arg2;
	}

	public double substractArguments() {
		return arg1 - arg2;
	}

	public double multiplyArguments() {
		return arg1 * arg2;
	}

	public double devideArguments() {
		return arg1 / arg2;
	}

}
