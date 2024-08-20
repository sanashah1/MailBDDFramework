package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefinitions {
	
	@Before
	public void setUP(){
		System.out.println("launch FireFox");
		System.out.println("Enter URL for Mail APP");
	}
	
	@After
	public void tearDown(){
		System.out.println("close the browser");
	}
	
	@Given("^user is on oraganizer page$")
	public void user_is_on_organizer_oage() {
		System.out.println("user is on oraganizer page");
	}
	
	@When("^user fills the oraganizer form$")
	public void user_fills_the_organizer_form() {
		System.out.println("user fills the oraganizer form");
	}
	
	@Then("oraganizer is created")
	public void oraganizer_is_created() {
	    System.out.println("organizer is created");
	}
		
	
	@Given("^user is on contact page$")
	public void user_is_on_contact_page() throws Throwable {
		System.out.println("user is on contact page");
	
	}
	
	@When("^user fills the contact form$")
	public void user_fills_the_contact_form() throws Throwable {
		System.out.println("create a contact");
	}
	
	@Then("^contact is created$")
	public void contact_is_created() throws Throwable {
		System.out.println("contact is created");
	}
	
	
	
	@Given("^user is on mail page$")
	public void user_is_on_mail_page() throws Throwable {
		System.out.println("user is on mail pahge");
	}
	
	@When("^user fills the mail form$")
	public void user_fills_the_mail_form() throws Throwable {
		System.out.println("create a mail");
	}

	@Then("^mail is created$")
	public void mail_is_created() throws Throwable {
		System.out.println("mail is created");
	}	
	
	}


