package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginStepDef extends TestBase{

	LoginPage loginpage;
	
@Given("^User is already on Login Page$")
public void user_is_already_on_Login_Page() throws Throwable {
    TestBase.initialize();
}

@Given("^title of login page is Free CRM$")
public void title_of_login_page_is_Free_CRM() throws Throwable {
	loginpage= new LoginPage();
	Assert.assertEquals("Cogmento CRM", loginpage.getPageTitle());
}

@When("^User enters login Credentials$")
public void user_enters_login_Credentials() throws Throwable {
	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}

@Then("^User is on Home page$")
public void user_is_on_Home_page() throws Throwable {
    System.out.println("User logged in successfully");
   // just to confirm whether script ran successfully
//    WebElement myname= driver.findElement(By.xpath("//div[@class='right menu']/span[1]"));
//    System.out.println(myname.getText());
}

@Then("^close the Browser$")
public void close_the_Browser() throws Throwable {
    driver.close();
}
}
