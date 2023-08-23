package SeleniumProjectPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
//		Window maximized command
		driver.manage().window().maximize();
		
//		Get URL command
		driver.get("https://www.saucedemo.com/");
		
//		Browser window time command
		Thread.sleep(3000);
		
//      ID select and pass the user name, password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
//		Browser window time command
		Thread.sleep(2000);
		
//      ID select and click login button
        driver.findElement(By.id("login-button")).click();
		
//		Browser window time command
		Thread.sleep(6000);
		
//		Browser window close command
		driver.close();

		

	}

}
