package basic;

import org.testng.annotations.Test;

public class P003_Dependency {
	@Test(priority = 1)
	public void Createaccount() {
		System.out.println("Createaccount");
	}
	@Test(priority = 2)
	public void Login() {
//		int a=10/0;
		System.out.println("Login :");
	}
	@Test(priority = 3,dependsOnMethods = "Login")
	public void Profile() {
		System.out.println("Profile");
	}

}
