package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addToCartStep {
	WebDriver driver;
	
	
	
	@Given("User is on HomePage")
	public void user_is_on_home_page() {
		driver = new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    
	}

	@When("click on the Search Bar")
	public void click_on_the_search_bar() {
		driver.findElement(By.cssSelector("[placeholder=\"Search books or authors\"]")).click();
	    
	}

	@When("search the book")
	public void search_the_book() {
		driver.findElement(By.cssSelector("[placeholder=\"Search books or authors\"]")).sendKeys("Slayer");
		driver.findElement(By.id("mat-option-4")).click();
		

	}

	@When("verify the book")
	public void verify_the_book() {
		WebElement verifyBook = driver.findElement(By.xpath("//img[@src=\"/Upload/6d91b7b0-b8d1-41ad-a0ef-65e2324fc1b3Slayer.jpg\"]"));
		if(verifyBook.isDisplayed()) {
			System.out.println("<-------Verify Book-------->");
		}else {
			System.out.println("<-------Not Verify Book--------->");
		}
	    
	}

//	@Given("user on the search section")
//	public void user_on_the_search_section() {
//	    
//	}

	@When("click on the add to cart icon")
	public void click_on_the_add_to_cart_icon() {
		
		driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
	    
	}

//	@When("verify succesfull add product")
//	public void verify_succesfull_add_product() {
//	    
//	}

//	@Then("Remove the product from add to cart")
//	public void remove_the_product_from_add_to_cart() {
//	    
//	}

	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}


}
