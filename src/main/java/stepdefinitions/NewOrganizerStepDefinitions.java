package stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*public class NewOrganizerStepDefinitions {
	
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
		List<List<String>> user =credentials.cells();
	    driver.findElement(By.name("username")).sendKeys(user.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(user.get(0).get(1));
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
	
	@Then("user clicks on to organizer button")
	public void user_clicks_on_contact_page() {
		driver.findElement(By.linkText("Organizer")).click();
	}
	
	@Then("^user clicks on add new appointment$")
	public void user_moves_on_new_contact_link() throws InterruptedException {
		driver.switchTo().frame("thirdPartyFrame_organizer");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='add-new-event']/a")).click();	
	}
	
	@Then("^user enters the title and Location and Description$")
	public void user_enters_title_location_calender(DataTable data) {
		List<List<String>> caldata =data.cells();
		driver.findElement(By.id("event-title")).sendKeys(caldata.get(0).get(0));
		driver.findElement(By.id("event-location")).sendKeys(caldata.get(0).get(1));
		driver.findElement(By.id("event-description")).sendKeys(caldata.get(0).get(2));
		
	}
	
	@Then("^user save the entry$")
	public void user_save_the_entry() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	
	@Then("^user quit$")
	public void user_quit() {
	    driver.quit();
	}

}
*/