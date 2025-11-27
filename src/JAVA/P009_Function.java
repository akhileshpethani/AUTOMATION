package JAVA;

	// function/method
	//without return type without parameter
class abc {
	public void show () {
		
		System.out.println("show method ->without return type without parameter");
		
	}

	//without return type with parameter
	
	public void call(int i) {
		System.out.println("fun -> without return type with parameter : " + i);
	}
	
	//with return type without parameter
	public int fun() {
		System.out.println("fun -> with return type without parameter");
		return 324;
	}
	//with return type with parameter
	public int getSquare(int num) {
		System.out.println("num : " + num + " is coming from main method");
		return num * num;
	}
	

}

public class P009_Function {
	public static void main(String[] args) {
		System.out.println("main method");
		abc a = new abc ();
		
		a.show ();
		a.call(987654);
		
		int res = a.fun();
		System.out.println(res);

		int sq = a.getSquare(123);
		System.out.println("square of num is : " + sq);


	}
}
