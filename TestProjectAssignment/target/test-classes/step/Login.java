package step;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class Login {

	ChromeDriver driver = null;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws MalformedURLException {
		System.out.println("I am inside Given");
		
		driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
				.withRemoteAddress(new URL("http://localhost:8080"))
				.withToken("saZIULrXwX38LK82QuVPxtcYm8-MXVTa1GCsIO31StM1").build(ChromeDriver.class);
		
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("I am inside When");
		driver.findElement(By.cssSelector("#name")).sendKeys("Jhon Smith");
		driver.findElement(By.cssSelector("#login")).sendKeys("12345");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("I am inside And");
		driver.findElement(By.cssSelector("#login")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("I am inside Then");
		boolean passed = driver.findElement(By.cssSelector("#logout")).isDisplayed();
		if (passed) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		driver.quit();
	}

}
