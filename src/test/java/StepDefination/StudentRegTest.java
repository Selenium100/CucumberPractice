package StepDefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StudentRegTest {
	
	

	@Given("Launch Student Reg From")
	public void launch_student_reg_from() {
	   
		System.out.println("Launch URL");
	}

	@Then("Enter below info in Reg from")
	public void enter_below_info_in_reg_from(DataTable dataTable) {
	    
		List<List<String>> data=dataTable.asLists(String.class);
		
		for(List<String> eachdatatable:data) {
			
			System.out.println(eachdatatable);
		}
	}
	
	
	
}
