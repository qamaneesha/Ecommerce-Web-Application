package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShoppingCartPage {
  
	
	WebDriver driver;
	
	By quantityElement = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]");
	By updateElement = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[2]/button[2]/span[1]");
	
	ShoppingCartPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void setQuantity(String quantity) {
		driver.findElement(quantityElement).sendKeys(quantity);
	}
	public void setUpdate() {
		driver.findElement(updateElement).click();
	}
}
