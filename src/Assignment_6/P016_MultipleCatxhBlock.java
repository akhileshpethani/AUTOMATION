package Assignment_6;

import java.util.Scanner;

public class P016_MultipleCatxhBlock {
	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter first number: ");
	            int num1 = sc.nextInt();

	            System.out.print("Enter second number: ");
	            int num2 = sc.nextInt();

	            int result = num1 / num2;
	            System.out.println("Division Result: " + result);

	            int[] arr = new int[5];
	            arr[10] = 100; // This will cause ArrayIndexOutOfBoundsException
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index out of bounds.");
	        } 
	        catch (Exception e) {
	            System.out.println("Error: Some other exception occurred.");
	        }

	        System.out.println("Program continues after multiple catch blocks.");
	        sc.close();
	    }

}
