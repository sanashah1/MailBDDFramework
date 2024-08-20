package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrganizerStepDefinitonsusingMaps {
	
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
	
	@Then("^user enters the username and password$")
	public void user_enters_the_email_and_password(DataTable credentials) {
	for	(Map<String, String> user :credentials.asMaps(String.class,String.class)){
		driver.findElement(By.name("username")).sendKeys(user.get("username"));
	    driver.findElement(By.name("password")).sendKeys(user.get("password"));
	}}
	
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
	
	@Then("user clicks on to organizer button")
	public void user_clicks_on_contact_page() {
		driver.findElement(By.linkText("Organizer")).click();
	}
	
	@Then("^user clicks on add new appointment$")
	public void user_moves_on_new_contact_link() throws InterruptedException {
		driver.switchTo().frame("thirdPartyFrame_organizer");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='btn btn-lg btn-call-to-action']")).click();
		
	}
	
	@Then("^user enters the title and Location and Description$")
	public void user_enters_title_location_calender(DataTable data) {
		for(Map<String,String> dt :data.asMaps(String.class,String.class)) {
		driver.findElement(By.id("event-title")).sendKeys(dt.get("title"));
		driver.findElement(By.id("event-location")).sendKeys(dt.get("location"));
		driver.findElement(By.id("event-description")).sendKeys(dt.get("description"));
		
		driver.findElement(By.xpath("//button[text()='Save']")).click(); //here first data will be saved
		
		driver.findElement(By.xpath("//div[@class='add-new-event']")).click(); // new data will start to load
		
	}}
	
	@Then("^user quit$")
	public void user_quit() {
	    driver.quit();
	}

}
