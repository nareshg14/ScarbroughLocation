package mavenProject.ScarbroughMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepedingMethods {
	
	@Test
	public void login(){
		System.out.println("Login");
		Assert.assertEquals(true, true);
	}
	
	@Test(dependsOnMethods = "login")
	public void logout(){
		System.out.println("Log Out");
	}

}
