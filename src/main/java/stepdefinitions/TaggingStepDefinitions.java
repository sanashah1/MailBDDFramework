package stepdefinitions;

import io.cucumber.java.en.Given;

public class TaggingStepDefinitions {
	
	@Given("This is a valid login test")
	public void this_is_a_valid_login_test() {
	   System.out.println("system is logged with correct username and password");
	}
	
	@Given("This is a invalid login test")
	public void this_is_a_invalid_login_test() {
	    System.out.println("system logged with incorrect username and password");;
	}

	@Given("This is a contact test case")
	public void this_is_a_contact_test_case() {
	    System.out.println("This is contact test case");
	}
	
	@Given("This is a organizer test case")
	public void this_is_a_organizer_test_case() {
	    System.out.println("This is an organizer test");;
	}
	
	@Given("This is a mail test case")
	public void this_is_a_mail_test_case() {
	   System.out.println("this is a mail test");
	}
	
	@Given("This is a case test case")
	public void this_is_a_case_test_case() {
	    System.err.println("this is a case test");
	}
	
	@Given("clicking on header panel links")
	public void clicking_on_header_panel_links() {
	    System.out.println("clicked on header panel links");
	}
	
	@Given("clicking on footer panel links")
	public void clicking_on_footer_panel_links() {
		System.out.println("clicked on footer panel links");
	}

	@Given("This is a organizer deal test")
	public void this_is_a_organizer_deal_test() {
	   System.out.println("this is an organizer deal");
	}
	
	@Given("This is a search contact test")
	public void this_is_a_search_contact_test() {
	    System.out.println("this is search contact test");
	}

	@Given("This is a search case test")
	public void this_is_a_search_case_test() {
		 System.out.println("this is search case test");
	}

	@Given("This is an mail task test")
	public void this_is_an_mail_task_test() {
		 System.out.println("this is mail task test");
	}

	@Given("This stared mail task test")
	public void this_stared_mail_task_test() {
		System.out.println("this is stared mail task test");
	}
	
	@Given("This is a search docs test")
	public void this_is_a_search_docs_test() {
		System.out.println("this is search docs test");
	}

	@Given("This is a cloud forms test")
	public void this_is_a_cloud_forms_test() {
		System.out.println("this is search forms test");
	}
	
	@Given("This is a report test")
	public void this_is_a_report_test() {
	 System.out.println("this is a report test");
	}

	@Given("This is a logout test")
	public void this_is_a_logout_test() {
	    System.out.println("this is a logout test");
	}
	
	@Given("This is a close broswer test")
	public void this_is_a_close_broswer_test() {
	    System.out.println("this is a close browser test");
	}
	
}
