/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 09 - Exceptions, Java code convention
 * part 02 
 * *
 */

package hw09;

import java.util.Scanner;

/**
 * * Different Exceptions application 
 * 
 * @author alexl
 * 
 * @version 1.1
 *
 */

public class Application {
	/* This is a main application class*/
	public static void main(String[] args) throws Exception {

		double arg1 = 0;
		double arg2 = 0;
		Scanner sc = new Scanner(System.in);
		Methods methods;
		
		System.out.println("Input first argument arg1: ");
		if (sc.hasNextDouble()) {
			arg1 = sc.nextDouble();
		} else {
			System.out.println("not double, try again");
			System.exit(0);
			sc.close();
		}
		
		
		System.out.println("Input second argument arg2: ");
		if (sc.hasNextDouble()) {
			arg2 = sc.nextDouble();
		} else {
			System.out.println("not double, try again");
			System.exit(0);
			sc.close();
		}
		
		
		try {
			
			if ((arg1 < 0) && (arg2 < 0)) {
				throw new IllegalArgumentException("Illegal arguments!");
			}  
			
			if (((arg1 == 0) && (arg2 != 0)) || ((arg1 != 0) && (arg2 == 0))) {
				throw new ArithmeticException("Arithmetic exception!");
			} 
			
			if ((arg1 == 0) && (arg2 == 0)) {
				throw new IllegalAccessException("Illegal Exception!");
			} 
			
			if ((arg1 > 0) && (arg2 > 0)) {
				throw new MyException("My Exception!!!. Results are:");
				
			}
			
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		} catch (MyException e) {
			
			System.out.println(e.getMessage());
			
			
			
		}
		
		methods = new Methods(arg1, arg2);
		System.out.println("Sum is  " + methods.sumArguments());
		System.out.println("Substraction is  " + methods.substractArguments());
		System.out.println("Multiply is  " + methods.multiplyArguments());
		System.out.println("Devide is  " + methods.devideArguments());
		
		
		
	}

}
