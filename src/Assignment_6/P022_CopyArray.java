package Assignment_6;

import java.util.Arrays;

public class P022_CopyArray {
	  public static void main(String[] args) {
	        int[] source = {10, 20, 30, 40, 50};
	        int[] destination = new int[source.length];

	        // Copying array using loop
	        for (int i = 0; i < source.length; i++) {
	            destination[i] = source[i];
	        }

	        System.out.println("Source array: " + Arrays.toString(source));
	        System.out.println("Destination array: " + Arrays.toString(destination));
	    }

}
