package Selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	//sample alert(accept)
	//confirmation alert(accept or cancel)
	//prompt alerts(add input,then acccept or cancel)
	
	WebElement samplealert=driver.findElement(By.id("alertButton"));
	samplealert.click();
	Thread.sleep(3000);
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	WebElement Timeralert=driver.findElement(By.id("timerAlertButton"));
	Timeralert.click();
	Thread.sleep(6000);
	Alert alert2=driver.switchTo().alert();
	alert2.accept();
	
	Thread.sleep(2000);
	WebElement confirmalert=driver.findElement(By.id("confirmButton"));
	confirmalert.click();
	Thread.sleep(3000);
	Alert alert1=driver.switchTo().alert();
	alert1.dismiss();
	
	Thread.sleep(3000);
	WebElement promptalert=driver.findElement(By.id("promtButton"));
	promptalert.click();
	Thread.sleep(2000);
	Alert alert3=driver.switchTo().alert();
	alert3.sendKeys("Harry");
	alert3.accept();
}
}
