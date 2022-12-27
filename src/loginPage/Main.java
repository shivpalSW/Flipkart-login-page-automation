package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static void main (String [] args) throws Exception  {
		
		// setting properties and path for ChromeBrowser
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING_FOLDER\\SOFTWARES\\chromedriver_Version-94.0.4606.61_win32\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();//Object creation
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
		driver .findElement(By.xpath("//input[@id ='email']")).sendKeys("abc@gmail.com");
		
		
		driver .findElement(By.xpath("//input[@id ='pass']")).sendKeys("abc");
		
		
		//driver .findElement(By.xpath("//button[@id ='u_0_d_mz']")).click();
		
		//driver.close();
		
		
		
		
		
	}

}
