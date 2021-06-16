package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before(order=1)
	public void setup_browser(Scenario sc) {
		System.out.println("Open Chrome Browser");
		System.out.println(sc.getStatus());
	}
	
	@Before(order=0)
	public void setup_url() {
		System.out.println("Open Amazon URL");
	}
	
	
	@After(order=2)
	public void teardown_closeBrowser() {
		
		System.out.println("Close the browser");
	}
	
	@After(order=1)
	public void teardown_QuitResourses() {
		
		System.out.println("Quit Resourses");
	}
	
	@BeforeStep
	public void takeScreenshot() {
		
		System.out.println("Take screenshot");
	}
	
	@AfterStep
	public void refreshPage() {
		
		System.out.println("Refresh the page");
	}

}
