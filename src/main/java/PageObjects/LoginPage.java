package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//button[contains(@class,'orangehrm-login-button')]

	@FindBy(xpath = "//input[@name ='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@name ='password']")
	private WebElement password;

	@FindBy(xpath = "//button[contains(@class,'orangehrm-login-button')]")
	private WebElement loginButton;


	public AdminPage Login(String LoginUsername, String LoginPassword) {
		username.sendKeys(LoginUsername);
		password.sendKeys(LoginPassword);
		loginButton.click();
		return new AdminPage(driver);
		
	}


}
