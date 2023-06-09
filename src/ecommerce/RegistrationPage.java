package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
	  WebDriver driver;
	  
	  By firstNameElement = By.name("firstname");
	  By lastNameElement = By.name("lastname");
	  By isSubscribedElement = By.name("is_subscribed");
	  By emailElement = By.name("email");
	  By passwordElement = By.name("password");
	  By passwordConfirmationElement = By.name("password_confirmation");
	  By submitButtonXPath = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]");
	  
	  RegistrationPage(WebDriver driver){
		  this.driver = driver;
	  }
	  
	  public void setFirstName(String firstName) {
		  driver.findElement(firstNameElement).sendKeys(firstName);
	  }
	  
	  public void setlastName(String lastName) {
		  driver.findElement(lastNameElement).sendKeys(lastName);
	  }
	  
	  public void clickIsSubscribed() {
		  driver.findElement(isSubscribedElement).click();
	  }
	  
	  public void setEmail(String email) {
		  driver.findElement(emailElement).sendKeys(email);
	  }
	  
	  public void setPassword(String password) {
		  driver.findElement(passwordElement).sendKeys(password);
	  }
	  
	  public void setPasswordConfirmation(String passwordConfirmation) {
		  driver.findElement(passwordConfirmationElement).sendKeys(passwordConfirmation);
	  }
	  
	  public void clickSubmitButton() {
		  driver.findElement(submitButtonXPath).click();
	  }
	  
}
