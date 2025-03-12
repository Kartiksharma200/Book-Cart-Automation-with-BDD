package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {

	WebDriver driver;

	@Given("User on Login Page")
	public void user_on_login_page() {

		driver = new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement loginIcon = driver.findElement(By.xpath("//span[normalize-space()='Login']"));
		loginIcon.click();

	}

	@When("enter an valid username and password details")
	public void enter_an_valid_username_and_password_details() throws InterruptedException {
		Thread.sleep(2000);
		WebElement userField = driver.findElement(By.cssSelector("[placeholder=\"Username\"]"));
		userField.sendKeys("Sher123");
		WebElement passField = driver.findElement(By.cssSelector("[placeholder=\"Password\"]"));
		passField.sendKeys("Sher@123");

	}

	@And("click on login button")
	public void click_on_login_button() {

		WebElement loginBtn = driver.findElement(By.xpath(
				"//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']//span[@class='mdc-button__label'][normalize-space()='Login']"));
		loginBtn.click();

	}

	@Then("user redirect to home page")
	public void user_redirect_to_home_page() {
		WebElement confirmation = driver.findElement(By.xpath("//span[contains(text(),'Sher123')]"));
		if (confirmation.isDisplayed()) {
			System.out.println("<-------Successful Login with Valid Data------->");
		} else {
			System.out.println("<----------Login failed--------->");
		}
		
		driver.close();
	}
//
//	@When("enter an invalid <username> and <password> details")
//	public void enter_an_invalid_username_and_password_details() {
//	    
//	}
//
//	@Then("user get an error")
//	public void user_get_an_error(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("user left blank both username and password")
//	public void user_left_blank_both_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("user getting error message")
//	public void user_getting_error_message() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//
}
