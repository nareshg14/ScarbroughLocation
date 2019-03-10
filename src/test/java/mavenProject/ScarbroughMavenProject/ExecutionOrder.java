package mavenProject.ScarbroughMavenProject;

import org.testng.annotations.Test;

public class ExecutionOrder {
	//Login, Transfer, Logout
	
	
	@Test(priority = 25)
	public void booking(){
		System.out.println("Booking");
	}
	
	@Test(priority = 30)
	public void logout(){
		System.out.println("Logout");
	}
	
	@Test(priority = 5)
	public void login(){
		System.out.println("Log in");
	}

}
