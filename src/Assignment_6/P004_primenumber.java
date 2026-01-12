package Assignment_6;

public class P004_primenumber {
	public static void main(String[] args) {
		
		//int num = 67 ;
	for(int a = 1; a <=1000 ; a++) {
		
	
	
	int counter = 0 ;

	for (int i = 1 ; i <= a ; i++) {
		
		if (a % i == 0) {
			
			counter ++ ;
				
		}
		
	}
	
	if (counter == 2) {
		
		
		System.out.println(a +  " prime number");
	}
}

}


}
