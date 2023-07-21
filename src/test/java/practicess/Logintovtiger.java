package practicess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectiverepository.Page_01;

public class Logintovtiger {
	 WebDriver driver;
	
	@Given("^open browser$")
	public void open_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	  driver.navigate().to("http://localhost:8888");
	}

	@When("^enter valid username and password$")
	public void enter_valid_username_and_password() {
		Page_01 ob=new Page_01(driver);
	 ob.username("admin");
	 ob.passwors("admin");
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
		Page_01 ob=new Page_01(driver);
	    ob.login();
	}

}
