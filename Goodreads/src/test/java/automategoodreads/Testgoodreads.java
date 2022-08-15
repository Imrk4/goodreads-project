package automategoodreads;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
 public void Signinemail() throws InterruptedException
 {
	 driver.findElement(By.linkText("Sign In")).click();
	  driver.findElement(By.linkText("Sign in with email")).click();
	  driver.findElement(By.id("ap_email")).sendKeys("imharshadmehta1992@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("ap_password")).sendKeys("12345678");
	  driver.findElement(By.id("a-autoid-0")).click();
	  driver.findElement(By.linkText("Home")).click();
     Thread.sleep(2000);      
//     driver.findElement(By.linkText("My Books")).click(); 
//     Thread.sleep(2000);
//    driver.findElement(By.partialLinkText("Browse")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.partialLinkText("Giveaways")).click();
//    driver.navigate().back();
//    Thread.sleep(2000);
    //driver.findElement(By.xpath("//*[@aria-label='Search books']")).sendKeys("Scams in India",Keys.ARROW_DOWN);
  // driver.findElement(By.xpath("//*[@class='searchBox_input searchBox_input--navbar']")).sendKeys("Scams in India",Keys.ARROW_DOWN);  
    //Thread.sleep(3000);
    //driver.findElement(By.xpath("//*[@class='gr-book_title gr-book_title--navbar u-defaultType']")).click();
    //Thread.sleep(3000);
//    driver.findElement(By.linkText("Home")).click();
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//*[@title='Notifications']")).click();
//    driver.findElement(By.xpath("//*[@title='My group discussions']")).click();
//    driver.findElement(By.xpath("//*[@title='Messages']")).click();
//    driver.findElement(By.xpath("//*[@aria-label='Friend Requests']")).click();
//    Thread.sleep(3000);
   
    Actions click= new Actions(driver);
    WebElement profilemenu= driver.findElement(By.xpath("//*[@class='dropdown dropdown--profileMenu']"));
    click.moveToElement(profilemenu).click().build().perform();
    Thread.sleep(2000);
  //click.keyDown(profile, Keys.ARROW_DOWN).click().build().perform();
    WebElement profile = driver.findElement(By.xpath("//*[@aria-label='Profile']"));
    click.moveToElement(profile).click().build().perform();
    
  //  driver.findElement(By.xpath("//*[@class='leftAlignedProfilePicture']")).click();
    
   // WebElement uploadpic = driver.findElement(By.id("user_photo"));
   // uploadpic.sendKeys("D://Resume things//photo.jpeg");
   // driver.findElement(By.id("user_photo")).sendKeys("D://Resume things//photo.jpeg");
    
   // driver.findElement(By.name("commit")).click();
    
   driver.findElement(By.xpath("//*[@class='dropdown dropdown--profileMenu']")).click();
   Thread.sleep(3000);
 //  driver.findElement(By.linkText("Sign out")).click();
    
    
    
    
    
    
    
    
    
	 
	 
	 
	 
	 
	 
	 //WebElement d= driver.findElement(By.xpath("//*[@id='signInUsingContent']/a[1]"));
	// Actions click= new Actions(driver);
	// click.moveToElement(d).click().build().perform();
	// driver.navigate().back();
	 
	 
	 
	//WebElement fb= driver.findElement(By.id("email")).sendKeys("8951560426");
	 
	 
	 
	 
 }

 
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  //Thread.sleep(3000);
	  //driver.close();
  }

}
