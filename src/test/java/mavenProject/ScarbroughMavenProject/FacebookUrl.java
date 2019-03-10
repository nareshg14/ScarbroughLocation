package mavenProject.ScarbroughMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookUrl {
	@Test
	public void checkUrl(){
		System.setProperty("webdriver.chrome.driver", "C:\\ClassTraining\\Selenium\\Downloaded Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Maximise application
		driver.manage().window().maximize();
		//Invoke application
		driver.get("http://www.facebook.com");
		
		System.out.println("App Url is : " + driver.getCurrentUrl());
		
		driver.quit();
	}

}
