package stepdefs;

import com.cucumber.listener.Reporter;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sampleDefs {

	@Before
	public void setup() {
		Reporter.assignAuthor("Vimal");
	}
	
@Given("^Sample given$")
public void sample_given() throws Throwable {
    System.out.println("sample given");
}

@When("^Sample When$")
public void sample_When() throws Throwable {
	System.out.println("sample when");
}

@Then("^Sample Then$")
public void sample_Then() throws Throwable {
	System.out.println("sample Then");
}
}
