package stepdefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/*public class LoginStepDefinitions {
	
	WebDriver driver;
	
	@Given("user is at mail page")
	public void user_is_at_mail_page() {
	   driver = new FirefoxDriver();
	   driver.get("https://www.mail.com/");
	   driver.manage().window().maximize();
	}

	@When("title page of login is Free email accounts with mail.com | Log in here or register today")
	public void title_page_of_login_is_free_email_accounts_with_mail_com_log_in_here_or_register_today() {
	    String title =driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("Free email accounts with mail.com | Log in here or register today", title);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	   driver.findElement(By.id("login-button")).click();
	}
	
//	//Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"

	@Then("user enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_email_and_password(String username,String Password) {
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(Password);
	}

	@Then("user enters the log in button")
	public void user_enters_the_log_in_button() {
	    driver.findElement(By.xpath("//button[@class='btn btn-block login-submit']")).click();
	}

	@Then("user is logged to home page")
	public void user_is_logged_to_home_page() {
	    String hometitle = driver.getTitle();
	    System.out.println("homepage:"+hometitle);
	    Assert.assertEquals("Free Email Addresses: Web based and secure Email - mail.com", hometitle);
	}
	
	@Then("user clicks on contact page")
	public void user_clicks_on_contact_page() {
		driver.findElement(By.linkText("Contacts")).click();
	}
	
	@Then("^user moves on new contact link$")
	public void user_moves_on_new_contact_link() throws InterruptedException {
		driver.switchTo().frame("thirdPartyFrame_addressbook");
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//*[text()='New Contact'])[1]")));
		
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_title_firstname_lastname_company(String title,String firstname,String lastname,String Company) {
		driver.findElement(By.name("title")).sendKeys(title);
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("name")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys(Company);
	}

	@Then("user hits save button")
	public void user_hits_save_button() {
		driver.findElement(By.xpath("//button[@class='button primary normal']")).click();
	}
	
	
	@Then("^user quit$")
	public void user_quit() {
	    driver.quit();
	}
	
	
}*/
