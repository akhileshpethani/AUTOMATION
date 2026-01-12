package Assignment_6;

import java.util.Scanner;

public class P015_TryCatchblocker {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter another number: ");
	        int num2 = sc.nextInt();

	        try {
	            int result = num1 / num2;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }

	        System.out.println("Program continues after try-catch block.");
	        sc.close();
	    }

}
