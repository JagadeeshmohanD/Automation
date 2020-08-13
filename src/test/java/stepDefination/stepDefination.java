package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code to navigate to login url
    	System.out.println("Navigated to login url");
  
    	
    }
	
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String strArg1,String strArg2) throws Throwable {
        //code to login
    	System.out.println("logged in successfuly");
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //code to page validation
    	System.out.println("validated Home Page");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String Arg1) throws Throwable {
        //code for card validation
    	System.out.println(Arg1);
    }
	
	
   
}
