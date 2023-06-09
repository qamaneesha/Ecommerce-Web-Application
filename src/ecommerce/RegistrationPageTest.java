package ecommerce;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RegistrationPageTest {
	
	WebDriver driver;
	  
    String registrationPageURL = "https://magento.softwaretestingboard.com/customer/account/create/";
    String chromeWebDriverPath = "D:\\AUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe";
	  
    @BeforeTest
    public void beforeTest() {
    	System.setProperty("webdriver.chrome.driver", chromeWebDriverPath);
    	
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get(registrationPageURL);
    }
    
    @Test
    public void verifyRegistrationForm() throws InterruptedException {
    	
    	RegistrationPage registrationPage = new RegistrationPage(driver);
    	
    	registrationPage.setFirstName("Maneesha");
    	registrationPage.setlastName("N");
    	registrationPage.clickIsSubscribed();
    	registrationPage.setEmail("maneeshamanu53@gmail.com");
    	registrationPage.setPassword("manu@1234");
    	registrationPage.setPasswordConfirmation("manu@1234");
    	registrationPage.clickSubmitButton();
    	
    	Thread.sleep(4000);
    }

    @AfterTest
    public void afterTest() {
    	driver.close();
	}
}
