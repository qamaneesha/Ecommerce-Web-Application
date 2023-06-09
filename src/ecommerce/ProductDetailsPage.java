package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
	
	WebDriver driver;
	
	By sizeElement = By.xpath("//body[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]");
	By colorElement = By.xpath("//body[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]");
	By quantityElement = By.name("qty");
	By addToCartElement = By.id("product_addtocart_form");
	
	ProductDetailsPage(WebDriver driver){
		this.driver = driver;
	}
 
	public void setSize(){
		driver.findElement(sizeElement).click();
	}	
	public void setColor() {	
		driver.findElement(colorElement).click();
	}
	public void setQuantity(String quantity) {
		driver.findElement(quantityElement).sendKeys(quantity);
	}
	public void setAddToCart() {
			driver.findElement(addToCartElement).submit();
		
	}
	
}
