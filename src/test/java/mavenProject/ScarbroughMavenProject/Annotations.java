package mavenProject.ScarbroughMavenProject;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeTest
	public void loginintoCitrix(){
		System.out.println("Citrix Login");
	}
	
	@AfterTest
	public void logoutCitrix(){
		System.out.println("Logging out from Citrix");
	}
	@BeforeClass
	public void launchBrowser(){
		System.out.println("Opening Browser");
	}
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("Closing browser");
	}
	
	@BeforeMethod
	public void login(){
		System.out.println("Login");
		Assert.assertEquals(true, true);
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("Log Out");
	}
	
	@Test
	public void bookTickets(){
		System.out.println("Booking Tickets");
	}
	
	@Test
	public void cancelTickets(){
		System.out.println("Cancel Tickets");
	}

}
