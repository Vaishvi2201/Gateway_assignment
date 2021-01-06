package automationFramework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
	
		 driver.manage().window().maximize();
		 
	
		 String title = driver.getTitle();
		 System.out.println("The page title is : " +title);
		 
	
		 WebElement uName = driver.findElement(By.xpath("//*[@id='userName']"));
		 WebElement pswd = driver.findElement(By.xpath("//*[@id='password']"));
		 WebElement loginBtn = driver.findElement(By.xpath("//*[@id='login']"));
		 
		 
		
		 uName.sendKeys("Vaishvi");
		 pswd.sendKeys("Vaishvi@123");
		 loginBtn.click();
		 
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 try {
			 
			
			 WebElement logoutBtn = driver.findElement(By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']"));
		
			 if(logoutBtn.isDisplayed()){
			 

			 logoutBtn.click();
			 System.out.println("LogOut Successful!");
			 }
			 } 
			 catch (Exception e) {
			 System.out.println("Incorrect login....");
			 }
			 

			 driver.quit();
			 
			 
		
	}

}
