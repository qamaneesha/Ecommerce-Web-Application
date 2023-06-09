package ecommerce;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ShoppingCartTest {
	
	WebDriver driver;

	String productDetailsPageURL = "https://magento.softwaretestingboard.com/proteus-fitness-jackshirt.html";
	String shoppingCartPageURL = "https://magento.softwaretestingboard.com/checkout/cart/";
    String chromeWebDriverPath = "D:\\AUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe";
    
    
    
  @Test(priority=0)
  public void addProductToCart() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", chromeWebDriverPath);
  	
  	driver = new ChromeDriver();
  	driver.manage().window().maximize();
  	driver.get(productDetailsPageURL);
  	
  	ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
  	productDetailsPage.setSize();
  	productDetailsPage.setColor();
  	productDetailsPage.setQuantity("2");
  	productDetailsPage.setAddToCart();
  	
  	Thread.sleep(3000);
  }
  
  
  @Test(priority=1)
  public void updateCart() throws InterruptedException {
	driver.get(shoppingCartPageURL);
	  
  	ShoppingCartPage shoppingCartPage = new ShoppingCartPage (driver);
  	shoppingCartPage.setQuantity("2");
  	shoppingCartPage.setUpdate();
	  
	Thread.sleep(4000);
  }
  
  
   @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
