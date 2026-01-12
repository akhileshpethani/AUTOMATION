package Assignment_6;

import java.util.ArrayList;

public class P019_itrate {
	 public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");

	        // 1. Using for loop
	        System.out.println("Using for loop:");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println(list.get(i));
	        }

	        // 2. Using enhanced for-each loop
	        System.out.println("\nUsing for-each loop:");
	        for (String item : list) {
	            System.out.println(item);
	        }

	        // 3. Using iterator
	        System.out.println("\nUsing Iterator:");
	        java.util.Iterator<String> it = list.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        // 4. Using forEach method with lambda (Java 8+)
	        System.out.println("\nUsing forEach with lambda:");
	        list.forEach(item -> System.out.println(item));
	    }

}
