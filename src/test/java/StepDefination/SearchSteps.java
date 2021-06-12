package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	@Given("I have search field on Amazon Page")
	public void i_have_search_field_on_amazon_page() {
	   
		System.out.println("Step 1: I have search field on Amazon Page");
	}

	@When("I search a product with name {string} and Price {int}")
	public void i_search_a_product_with_name_and_price(String ProductName, Integer Price) {
	    
		System.out.println("Step 2: I search a product name :" + ProductName + "Price :" + Price );
	}

	@Then("Procuct with name {string} should be displayed.")
	public void procuct_with_name_should_be_displayed(String ProductName) {
	   
		System.out.println("Step 3 : Procuct with name " + ProductName + "is displayed" );
	}


}
