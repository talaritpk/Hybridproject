package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	@FindBy(id="add")
	private WebElement add;
	
	public WebElement getAdd() {
		return add;
	}
	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	private WebElement addtocart;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void addCart()
	{
		addtocart.click();
	}

	
	
	

}
