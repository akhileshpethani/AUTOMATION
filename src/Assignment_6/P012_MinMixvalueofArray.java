package Assignment_6;

public class P012_MinMixvalueofArray {
	public static void main(String[] args) {
		
	
	 int[] arr = {25, 10, 45, 5, 30};

     int max = arr[0];
     int min = arr[0];

     for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max) {
             max = arr[i];
         }
         if (arr[i] < min) {
             min = arr[i];
         }
     }

     System.out.println("Maximum value: " + max);
     System.out.println("Minimum value: " + min);
	
 }

}
