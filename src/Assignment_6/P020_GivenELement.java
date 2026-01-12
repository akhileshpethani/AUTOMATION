package Assignment_6;

import java.util.Scanner;

public class P020_GivenELement {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] arr = {10, 20, 30, 40, 50};

	        System.out.println("Original array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Input position and new value
	        System.out.print("Enter the index to update (0 to " + (arr.length - 1) + "): ");
	        int index = sc.nextInt();

	        System.out.print("Enter the new value: ");
	        int newValue = sc.nextInt();

	        // Update the element
	        if (index >= 0 && index < arr.length) {
	            arr[index] = newValue;
	            System.out.println("Updated array:");
	            for (int num : arr) {
	                System.out.print(num + " ");
	            }
	        } else {
	            System.out.println("Invalid index!");
	        }

	        sc.close();
	    }

}
