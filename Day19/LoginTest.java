package Day19;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
	
	
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Welocme to Login Page");
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement pswd=driver.findElement(By.id("password"));
		pswd.sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		String actualurl="https://www.saucedemo.com/";
		
		String expectedurl=driver.getCurrentUrl();
		
		if(expectedurl.equals(actualurl)) {
		System.out.println("Login Failed");
		}
}
}
