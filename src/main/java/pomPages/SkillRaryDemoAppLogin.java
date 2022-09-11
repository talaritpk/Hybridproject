package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryDemoAppLogin {
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement course;

	public WebElement getCourse() {
		return course;
	}
	@FindBy(name="addresstype")
	private WebElement dropdown;

	public WebElement getDropdown() {
		return dropdown;
	}
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seltraining;
	
	public SkillRaryDemoAppLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selTraining()
	{
		seltraining.click();
	}
	
	
	
	

}
