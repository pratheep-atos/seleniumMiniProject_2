package PageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public WebDriver driver;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(css = ".oxd-main-menu-item")
	private WebElement AdminSection;
	
	@FindBy(css = ".oxd-table-row .oxd-table-cell:nth-child(2)")
	private List<WebElement> UserName;
	
	
	
	@FindBy(xpath = "//div[@class='orangehrm-header-container'] //button[contains(@class,'oxd-button')]")
	private WebElement AddAccount;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	private WebElement UserRole;
	
	
	@FindBy(xpath = "//div[@class='oxd-select-option'] //span[text()='Admin']")
	private WebElement AdminDropDown;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Type for hints')]")
	private WebElement EmployeeName;
	
	@FindBy(css = ".oxd-autocomplete-option")
	private List<WebElement> employeeOptions;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	private WebElement Status;
	
	@FindBy(xpath = "//div[@class='oxd-select-option'] //span[text()='Enabled']")
	private WebElement StatusDropDown;
	
	@FindBy(css = ".oxd-input:nth-child(1)")
	private WebElement username;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement password;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement ConfirmPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Save;	
	
	public List<WebElement> adminPageUsernames() {
		 AdminSection.click();
		 return UserName;
	}
	
	public void addAccount() {
		AdminSection.click();
		AddAccount.click();	
	}
	
	public void SelectUser() {
		UserRole.click();
		AdminDropDown.click();
	}
	public void SelectEmployee() {
		EmployeeName.sendKeys("peter");
	}	
	
	public List<WebElement> employeeNames(){
		return employeeOptions;
	}
	
	public void SelectStatus() {
		Status.click();
		StatusDropDown.click();
	}
	
	public void usernamePassword(String adminUsername ,String adminPassword) {
		username.sendKeys(adminUsername);
		password.sendKeys(adminPassword);
		ConfirmPassword.sendKeys(adminPassword);
		Save.click();
		
	}
}
