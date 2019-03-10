package mavenProject.ScarbroughMavenProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchingFacebook {
	WebDriver driver = null;
	
	@Test
	public void invokeFacebook(){
		try {
			String expAppTitle = "Facebook - Log In or Sign Upssss";
			
			System.setProperty("webdriver.chrome.driver", "C:\\ClassTraining\\Selenium\\Downloaded Files\\chromedriver.exe");
			driver = new ChromeDriver();
			//Maximise application
			driver.manage().window().maximize();
			//Invoke application
			driver.get("http://www.facebook.com");
			//Capturing the title
			String actAppTitle = driver.getTitle();
			//Validate if Facebook is opened
			//Assertions
			Assert.assertEquals(actAppTitle, expAppTitle);
		} catch (Exception e) {
			System.out.println(e);
		}finally{
			driver.quit();
		}
		
		
		
		
		
	}

}
