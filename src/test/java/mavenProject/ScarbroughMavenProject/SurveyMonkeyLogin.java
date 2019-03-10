package mavenProject.ScarbroughMavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SurveyMonkeyLogin {
	
	@Test(dataProvider = "passValues")
	public void loginApp(String userName, String passWord) throws IOException{
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\ClassTraining\\Selenium\\Programs\\ScarbroughMavenProject\\Config.properties");
		
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "C:\\ClassTraining\\Selenium\\Downloaded Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//button[@class='wds-button wds-button--stretch wds-button--icon-right wds-button--arrow-right']")).click();
		driver.quit();
	}
	
	@DataProvider
	public Object passValues(){
		Object userDetails[][] = new Object[2][2];
		userDetails[0][0] = "seleniumtraining";
		userDetails[0][1] = "selenium1234";
		userDetails[1][0] = "seleniumtraining1";
		userDetails[1][1] = "selenium1234";
		
		return userDetails;
	}

}
