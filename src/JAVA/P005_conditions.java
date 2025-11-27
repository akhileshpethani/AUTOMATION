package JAVA;

public class P005_conditions {
	public static void main(String[] args) {
		
		// if{} else{}
		 int a = 12 , b = 100;
		 if(a < b ) {
			 System.out.println("a is greater than b");
			 
		 }
		 else {
				System.out.println("b is greater than a ");
			}
		
		// nested if
		 int age = 85;
		 if (age > 18) {
			 if(age <55)
			System.out.println("vote open");
			 else {
				System.out.println("age is greater than 55");
			}
		}
	
		 else {
			System.out.println("GO TO HOME ");
		}
		// else if ladder
		 double m = 100;
		 
		 if (m < 35) {
			System.out.println("fail");
			
		}
		 else if (m != 35 && m <=60) {
				System.out.println("pass");
		
		 }
		 else if (m >= 60 && m <= 70) {
			 System.out.println("GRADE C");
			
		 }
		 else if (m >= 70 && m <= 80) {
			 System.out.println("GRADE B");
			
		}
		 else if (m >= 80 && m <= 90) {
		 System.out.println("GRADE A");
		
		 }
		 else if (m >= 90 && m <= 100) {
			 System.out.println("GRADE A+");
			
		}
		 else {
			System.out.println("WRONG VALUE");
			
		}
		 
		// switch case
		 System.out.println();
		 System.out.println("SELECT LANGUAGE");
		 
		 System.out.println("1.English,2.Hindi,3.Gujrati");
		 int A = 5;
		switch (A) {
		case 1:
			System.out.println("you select english");
			
			break;
		case 2 :
			System.out.println("you select hindi");
			break;
		case 3 :
			System.out.println("you select gujrati");
			
		default:
			System.out.println("invalid value");
			break;
		}
		 
	}

}
