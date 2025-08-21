package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		//driver.get("https://demoqa.com/buttons");
		Thread.sleep(5000);
//		driver.manage().window().maximize();
//		
//		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
//		Actions act=new Actions(driver);
//		act.doubleClick(doubleclick).perform();
//		
//		Thread.sleep(3000);
//		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
//		act.contextClick(rightclick).perform();
//		
		//perform mouse hover actions
//		driver.get("https://www.ebay.com/");
//		driver.manage().window().maximize();
//        Actions act=new Actions(driver);
//        WebElement motors=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
//		act.moveToElement(motors).perform();
//		Thread.sleep(3000);
//		WebElement sports=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a"));
//		act.moveToElement(sports).perform();
//		Thread.sleep(3000);
//		WebElement fashion=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
//		act.moveToElement(fashion).perform();
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
        act.dragAndDrop(source, target).perform();
		
	}

}
