package JAVA;

public class P003_Operator {
	public static void main(String[] args) {
		//arithmetic operator:+,-,*,/,%
		int a = 56 , b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b );
		System.out.println(a / b);
		System.out.println(a % b);
		
		double base = 23.33 , height = 34.23 ;
		double AreaOfTraingle = (base*height)/2;
		System.out.println("Area Of Traingle = " + AreaOfTraingle);
		
		// Assignment -> =,+=,-=,*=,/=
		
		int i = 10 ; 
		i += 12; // i = i + 12
		System.out.println("int i += " + i);
		
		int j = 40 ;
		i += j ; // i = i + j
		System.out.println("i+=j " + i); //62
		
		i -= j ;
		System.out.println("i -= " + i);
		
		i *= 5;
		System.out.println("i *= " + i);
		
		i /= 3;
		System.out.println("i /= " + i);
		
		// Unary -> ++,--
		
		int A = 2;
		A++; // A=A + 1
		System.out.println(A);
		
		A--; 
		System.out.println(A);
		
		// conditional -> >,>=,<,<=,==,!=
		
		int p = 100 , o = 10 ;
		
		System.out.println(p > o);
		System.out.println(p < o);
		System.out.println(p >= o);
		System.out.println(p <= o);
		System.out.println(p == o);
		System.out.println(p != o);
		
		//logical -> &&, || , !
	}

}
