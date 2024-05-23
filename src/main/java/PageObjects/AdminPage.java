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


	public List<WebElement> adminPageUsernames() {
		 AdminSection.click();
		 return UserName;
		
	}
}
