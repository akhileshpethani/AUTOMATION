package basic;

import org.testng.annotations.Test;

public class P002_Priority {
	
	@Test(priority = 1)
	public void Createaccount() {
		System.out.println(" Createaccount ");
	}
	
	@Test(priority = 5)
	public void Login() {
		System.out.println(" Login ");
	}
	
	@Test(priority = 3)
	public void Profile() {
		System.out.println(" Profile ");
	}
	
	@Test(priority = 4)
	public void ChangePassword() {
		System.out.println(" ChangePassword ");
	}
	
	@Test(priority = 2)
	public void ForgetPassword () {
		System.out.println(" ForgetPassword ");
	}


}
