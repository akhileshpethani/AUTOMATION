package JAVA;

import java.util.Scanner;

public class P011_Array {
	public static void main(String[] args) {
		
		int a = 1 ;
		System.out.println(a);
		int arr[] = {123,654,987,6541,654682,3214658,321435,32135,321435};
		for (int index=0; index<arr.length; index++) {
			System.out.println(arr[index]);
		}
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int ar[] = new int[size];
		for (int index = 0; index < ar.length; index++) {
			System.out.print("enter element at ar[" + index + "] : ");
			ar[index] = sc.nextInt();
		}
		int sum = 0;
		for (int index = 0; index < ar.length; index++) {
			sum = sum + ar[index];
			System.out.println("sum : " + sum);
		}
		System.out.println("sum : " + sum);

		System.out.println("enter num to search in array : ");
		int num = sc.nextInt();

		int counter = 0;
		for (int index = 0; index < ar.length; index++) {
			if (num == ar[index]) {
				counter++;
			}
		}
		if (counter > 0) {
			System.out.println("yes exist " + counter + " times");
		} else {
			System.out.println("not exist");
		}
		sc.close();
	
		}
	
	}
