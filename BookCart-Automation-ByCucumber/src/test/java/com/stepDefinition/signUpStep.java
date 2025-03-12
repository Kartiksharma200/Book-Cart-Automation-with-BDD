package com.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signUpStep {
	
	
	
	@Given("the user is on the sign-up page")
	public void the_user_is_on_the_sign_up_page() {
	    
	}

	@When("the user enters valid details")
	public void the_user_enters_valid_details(io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@When("clicks the sign-up button")
	public void clicks_the_sign_up_button() {
	    
	}

	@Then("the user should be redirected to the Sign In page")
	public void the_user_should_be_redirected_to_the_sign_in_page() {

	}

	@Then("see a confirmation message {string}")
	public void see_a_confirmation_message(String string) {
	    
	}

	@When("the user enter name {string}")
	public void the_user_enter_name(String string) {
	    
	}

	@When("click the sign-up button")
	public void click_the_sign_up_button() {

	}

	@Then("the user should see an error message {string}")
	public void the_user_should_see_an_error_message(String string) {
	    
	}

	@When("the user enters an already registered email {string}")
	public void the_user_enters_an_already_registered_email(String string) {

	}

	@When("the user enters a weak password {string}")
	public void the_user_enters_a_weak_password(String string) {
	    
	}

	@When("the user enters a password {string}")
	public void the_user_enters_a_password(String string) {
	    
	}

	@When("the user enter a diffrent password {string}")
	public void the_user_enter_a_diffrent_password(String string) {
	   
	}

	@When("the user leaves the required fields empty")
	public void the_user_leaves_the_required_fields_empty() {
	    
	}

	@When("the user enters an invalid email format {string}")
	public void the_user_enters_an_invalid_email_format(String string) {

	}

}
