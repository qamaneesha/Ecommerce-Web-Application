package ecommerce;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ProductDetailsTest {
	WebDriver driver;
	  
    String productDetailsPageURL = "https://magento.softwaretestingboard.com/proteus-fitness-jackshirt.html";
    String chromeWebDriverPath = "D:\\AUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe";
	  
    @BeforeTest
    public void beforeTest() {
    	System.setProperty("webdriver.chrome.driver", chromeWebDriverPath);
    	
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get(productDetailsPageURL);
    }
  
  

    @Test
     public void selectProduct() throws InterruptedException {
    	ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
    	productDetailsPage.setSize();
    	productDetailsPage.setColor();
    	productDetailsPage.setQuantity("2");
    	productDetailsPage.setAddToCart();
    	
    	Thread.sleep(4000);
	  
    }
  
  
    @AfterTest
    public void afterTest() {
	  driver.close();
    }
    
    }
