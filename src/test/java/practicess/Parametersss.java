package practicess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametersss {
	WebDriver driver;
	
	@Given("^open browser and enter valid (.*)$")
	public void open_browser_and_enter_valid_http_localhost_index_php_action_index_module_home(String url) {
	   WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	   driver.get(url);
	}

	@When("enter valid (.*) and (.*)")
	public void enter_valid_admin_and_admin(String username,String password) {
	    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
	}

	@When("hit on login button")
	public void hit_on_login_button() {
	    driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	}

	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
	    System.out.println("validation pass");
	}


}
