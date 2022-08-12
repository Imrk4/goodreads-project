package automategoodreads;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
 
  @Test
  public void ByEmail() {
	  driver.findElement(By.linkText("Sign up with email")).click();
	  //driver.findElement(By.xpath("//*[@id='signInUsingContent']/a[4]")).click();
	  driver.findElement(By.id("ap_customer_name")).sendKeys("Harshad mehta");
	  driver.findElement(By.name("email")).sendKeys("mehtamadarchod@gmail.com");
	  driver.findElement(By.id("ap_password")).sendKeys("gandu@123");
	  driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("gandu@123");
	  driver.findElement(By.xpath("//span[@id='a-autoid-0']")).click();
	 
  }
 

 
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  //driver.close();
  }

}
