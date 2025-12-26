package JAVA;

import java.util.InputMismatchException;
import java.util.Scanner;

class student{
	public void division ()throws ArithmeticException,InputMismatchException {
	
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter num 1 : ");
		int num1 = sc.nextInt();
		System.out.println("enter num 2 : ");
		int num2 = sc.nextInt();
//		int num3 = num1 / num2 ;
		if (num1>0 && num2 > 0 ) {
			int num3 = num1/num2;
			System.out.println(" num 3 : " + num3 );
			sc.close();
		}
		else {
//			throw new  ArithmeticException ("msg");
		}
	}
	public static void call()
	{
		System.out.println("call static");

	}
}

public class P012_Exception {
	
	public static void main(String[] args) {
		try {
			student.call();
			student s = new student ();
			s.division();
		}catch (ArithmeticException e) {
			System.out.println("enter greter than 0 number ");
		} catch (InputMismatchException e) {
			System.out.println("enter number only");
		}
//		try {
//			
//			Scanner sc = new Scanner (System.in);
//			System.out.println("enter num 1 : ");
//			int num1 = sc.nextInt();
//			System.out.println("enter num 2 : ");
//			int num2 = sc.nextInt();
//			int num3 = num1 / num2 ;
//			System.out.println("num 3 : " + num3 );
//			sc.close();
//		}
//		catch ( ArithmeticException e )
//		{
//			System.out.println("value should be greater than 0 ");
//		}
//		catch ( InputMismatchException e )
//		{
//			System.out.println("value should be numeric value ");
//		
//		}
//		finally 
//		{
//			System.out.println(" finally will execute everytime ");
//			
		}
	}
		
	
