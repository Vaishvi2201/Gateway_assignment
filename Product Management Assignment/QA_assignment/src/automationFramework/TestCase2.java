package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("www.google.com");
		
		 String Actual = driver.getTitle();
	        String Expected = "Vaishvi Patel";

	        if (Actual.equals(Expected)) {
	                   System.out.println("Test Passed!");
	        } else {
	                   System.out.println("Test Failed");
	        }

	        driver.close();
		
	}

}
