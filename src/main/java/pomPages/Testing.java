package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {
	@FindBy(id="Selenium Training")
	private WebElement seltraining;

	public WebElement getSeltraining() {
		return seltraining;
	}
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fb;
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	
	public WebElement getCartarea() {
		return cartarea;
	}

	public Testing(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getFb() {
		return fb;
	}
	
	public void faceBook()
	{
		fb.click();
	}

}
