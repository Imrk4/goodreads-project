package automategoodreads;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterTest;

public class Testgoodreads {
	
	WebDriver driver;
	
	
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.goodreads.com/");	  
	  driver.manage().window().maximize();
  }
 
  @Test(enabled=false)
  public void ByEmail() {
	  driver.findElement(By.linkText("Sign up with email")).click();
	  //driver.findElement(By.xpath("//*[@id='signInUsingContent']/a[4]")).click();
	  driver.findElement(By.id("ap_customer_name")).sendKeys("Harshad mehta");
	  driver.findElement(By.name("email")).sendKeys("mehtamadarchod@gmail.com");
	  driver.findElement(By.id("ap_password")).sendKeys("gandu@123");
	  driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("gandu@123");
	  driver.findElement(By.xpath("//span[@id='a-autoid-0']")).click();	 
  }
 @Test
 public void ByFb()
 {
	WebElement d= driver.findElement(By.xpath("//*[@id='signInUsingContent']/a[1]"));
	 Actions click= new Actions(driver);
	 click.moveToElement(d).click().build().perform();
	// driver.navigate().back();
	 
	 
	 
	//WebElement fb= driver.findElement(By.id("email")).sendKeys("8951560426");
	 
	 
	 
	 
 }

 
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  //driver.close();
  }

}
