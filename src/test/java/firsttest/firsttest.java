package firsttest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class firsttest {
	
	@Given("I enter 50 in the calculator")
	public void step1 ()
	{
		System.out.println("enter 50");
	}
	@Then("I press add")
	public void step2 ()
	{
		System.out.println("add button is pressed");
	}
	@And("I enter 70")
	public void step3 ()
	{
		System.out.println("enter 70");
	}
	@When("I press equals button")
	public void step4 ()
	{
		
		System.out.println("press = button");
	}
	@Then("The result should be 120 on the screen")
	public void step5 ()
	{
		System.out.println("result = 120");
	}

}
