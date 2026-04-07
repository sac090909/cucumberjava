package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	

@Given("The user is at bank application login page")
public void the_user_is_at_bank_application_login_page() {
   System.out.println("Background");
}
@Given("The user is checking user")
public void the_user_is_checking_user() {
  
	 System.out.println("Given");
	
}
//
//@When("User provide valid email {string} and password {string}")
//public void user_provide_valid_email_and_password(String string, String string2) {
//	System.out.println("Email: " + string + "Password: " + string2);
//}

@When("^User provide valid (.+) and (.+)$")
public void user_provide_valid_user1_and_password1(String uname, String pwd) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("uname: " + uname + "pwd: " + pwd);
}
@Then("User gets login to the page")
public void user_gets_login_to_the_page() {
	 System.out.println("Then");
}



}
