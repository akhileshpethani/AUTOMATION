package Assignment_6;

import java.util.ArrayList;

public class P021_RemoveElement {
	public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Original ArrayList: " + list);

        // Remove the third element (index 2)
        if (list.size() >= 3) {
            list.remove(2); // Index starts from 0
            System.out.println("After removing third element: " + list);
        } else {
            System.out.println("ArrayList has less than 3 elements.");
        }
    }

}
