package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	@FindBy (xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy (xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy (name="q")
	private WebElement textbox;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement search;
	
	@FindBy(xpath="//button[text()='Accept']")
	private WebElement accept;
	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	
	public void skillraryDemo()
	{
		skillrarydemoapp.click();
	}
	
	public void textBox(String key)
	{
		textbox.sendKeys(key);
	}
	
	public void searchclick()
	{
		search.click();
	}
	
	public void acceptc()
	{
		accept.click();
		
	}

}
