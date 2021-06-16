package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchTest {
	
	@Given("User is on Amazon Login Page")
	public void user_is_on_amazon_login_page() {
	   
		System.out.println("User is on Amazon Login Page");
	}

	@When("User is entered user details")
	public void user_is_entered_user_details() {
	    
		System.out.println("User is entered user details");//Nitya is a bad boy
	}

	@Then("User is entered password details")
	public void user_is_entered_password_details() {
	    
		System.out.println("User is entered password details");
	}

	@Then("User is clicked login Button")
	public void user_is_clicked_login_button() {
	    
		System.out.println("User is clicked login Button");
	}

	@Then("User navigate to order page")
	public void user_navigate_to_order_page() {
	    
		System.out.println("User navigate to order page");
	}

	@Then("User is clicked on Previous order details")
	public void user_is_clicked_on_previous_order_details() {
	    
		System.out.println("User is clicked on Previous order details");
	}

	@Then("user clicks on order link")
	public void user_clicks_on_order_link() {
	   
		System.out.println("user clicks on order link");
	}

	@Then("User checks the previous orders")
	public void user_checks_the_previous_orders() {
	    
		System.out.println("User checks the previous orders");
	}



}
