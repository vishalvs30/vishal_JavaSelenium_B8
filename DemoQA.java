package Selenium1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DemoQA {
	
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)");
	
	WebElement fname=driver.findElement(By.id("firstName"));
	//fname.click();
	fname.sendKeys("vishal");
	
	WebElement lname=driver.findElement(By.id("lastName"));
    lname.sendKeys("V S");
    
    WebElement email=driver.findElement(By.id("userEmail"));
    email.sendKeys("Vvs@gmail.com");
    
    WebElement Number=driver.findElement(By.id("userNumber"));
    Number.sendKeys("9546382734");
    
    driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	js.executeScript("window.scrollBy(0,700)");

    //Selecting DOB Year
//    driver.findElement(By.id("dateOfBirthInput"));
//    WebElement year=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
//    Select sel=new Select(year);
    //sel.selectByIndex(125);
    //sel.selectByValue("2025");
    //sel.selectByVisibleText("2025");
    
    //Selecting DOB MONTH
   // WebElement month=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
  //  Select sel1=new Select(month);
    //sel1.selectByIndex(1);
    //sel1.selectByValue("0");
    //sel1.selectByVisibleText("August");
    //driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
    
    //subjects
//    WebElement sub=driver.findElement(By.id("subjectsInput"));
//    sub.sendKeys("Maths");
//    sub.sendKeys(Keys.ENTER);
//    sub.sendKeys("Phy");
//    sub.sendKeys(Keys.ENTER);
//    sub.sendKeys("co");
//    sub.sendKeys(Keys.ARROW_DOWN);
//    sub.sendKeys(Keys.ENTER);
	
	driver.findElement(By.id("dateOfBirthInput")).click();
	WebElement year = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
	Select sel = new Select(year);
	sel.selectByIndex(125);
	
	WebElement mon = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
	Select sel1 = new Select(mon);
	sel1.selectByValue("7");
	driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[7]")).click();
    
    String[] subjects= {"Math","Phy","Eco","Eng"};
    WebElement sub=driver.findElement(By.id("subjectsInput"));
    for(String subject:subjects) {
    	sub.sendKeys(subject);
    	sub.sendKeys(Keys.ENTER);
    }
    
    
    //driver.findElement(By.id("hobbies-checkbox-1"));
    //driver.findElement(By.id("hobbies-checkbox-2"));
    //driver.findElement(By.id("hobbies-checkbox-3"));

    
    //picture
    WebElement img=driver.findElement(By.id("uploadPicture"));
    img.sendKeys("C:\\Users\\swami\\OneDrive\\Pictures\\vsddos.jpg");
    
    WebElement state=driver.findElement(By.id("react-select-3-input"));
    state.sendKeys("NCR");
    state.sendKeys(Keys.ENTER);
    
    WebElement city=driver.findElement(By.id("react-select-4-input"));
    city.sendKeys("Delhi");
    city.sendKeys(Keys.ENTER);
    
    //submit button
    driver.findElement(By.id("submit")).click();
    Thread.sleep(2000);
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  
    File dest=new File("screenshot.png");
    Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);

}
}
