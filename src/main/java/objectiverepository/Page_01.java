package objectiverepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_01 {
	
	WebDriver driver;
	
	By txt_username=By.xpath("//input[@name='user_name']");
	
	
	By txt_password=By.xpath("//input[@name='user_password']");
	
	By btn_login=By.id("submitButton");
	
	public Page_01(WebDriver driver) {
		this.driver=driver;
	}

	public void username(String name) {
		driver.findElement(txt_username).sendKeys(name);
	}
	public void passwors(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void login() {
		driver.findElement(btn_login).click();
	}
}
