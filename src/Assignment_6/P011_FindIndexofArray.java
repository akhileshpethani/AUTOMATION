package Assignment_6;

import java.util.Scanner;

public class P011_FindIndexofArray {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] arr = {10, 20, 30, 40, 50};

	        System.out.print("Enter element to find its index: ");
	        int key = sc.nextInt();

	        int index = -1;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	            System.out.println("Element found at index: " + index);
	        } else {
	            System.out.println("Element not found in the array.");
	        }

	        sc.close();
	    }
	

}
