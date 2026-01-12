package Assignment_6;

import java.util.Scanner;

public class P003_FactorialProgram {

    public static void main(String[] args) {
    	
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            long fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial of " + n + " is: " + fact);

            sc.close();
    }
}



