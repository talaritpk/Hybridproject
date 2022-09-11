package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillRaryDemoAppLogin;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1()
	{
		
		SkillraryLoginPage srl=new SkillraryLoginPage(driver);
		srl.gearsbutton();
		srl.skillraryDemo();
		
		utilities.switchingTabs(driver);
		
		SkillRaryDemoAppLogin srdl=new SkillRaryDemoAppLogin(driver);
		utilities.mouseHover(driver, srdl.getCourse());
		srdl.selTraining();
		
		AddToCartPage acp=new AddToCartPage(driver);
		utilities.doubleClick(driver, acp.getAdd());
		acp.addCart();
		utilities.alertPopup(driver);
		
		
		
	}
	
	

}
