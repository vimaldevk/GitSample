package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String getPageTitle() {
		String pagetite=driver.getTitle();
		return pagetite;
	}
	
	public void login(String uname,String pwd) {
		email.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
}
