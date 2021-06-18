package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	String Title;
	
	@Given("Login to Facebook Application")
	public void login_to_facebook_application() {
	   
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito","--start-maximized");
		driver=new ChromeDriver(options);
		driver.get("https://facebook.com");
		 Title=driver.getTitle();
		System.out.println("Login to Facebook");
		
	}

	@Then("Enter username {string} to application")
	public void enter_username_to_application(String Usename) {
	    
		driver.findElement(By.id("email")).sendKeys(Usename);
		System.out.println("Enter Username " + Usename);
	}

	@Then("Enter password {string}  to application")
	public void enter_password_to_application(String Password) {
	    
		driver.findElement(By.id("pass")).sendKeys(Password);
		System.out.println("Enter Password " + Password);
	}


	@Then("click Login button")
	public void click_login_button() {
	   
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("Click login button");
	}

	@Then("Verify user lands on home page or not")
	public void verify_user_lands_on_home_page_or_not() {
	   
		System.out.println("Title is " + Title);
		Assert.assertEquals("HomePage", Title);
		
		
		
		
		
		
	}
	
	



}
