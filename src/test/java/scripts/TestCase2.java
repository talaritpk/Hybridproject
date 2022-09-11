package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import pomPages.SkillRaryDemoAppLogin;
import pomPages.SkillraryLoginPage;
import pomPages.Testing;

public class TestCase2 extends BaseClass {
	
	@Test
	public void tc2() throws IOException, InterruptedException
	{
		
		SkillraryLoginPage srl=new SkillraryLoginPage(driver);
		srl.gearsbutton();
		srl.skillraryDemo();
		SkillRaryDemoAppLogin srd=new SkillRaryDemoAppLogin(driver);
		utilities.switchingTabs(driver);
		utilities.dropDown(srd.getDropdown(),pdata.getPropertyData("coursedd"));
		Testing t=new Testing(driver);
		utilities.dragDrop(driver, t.getSeltraining(), t.getCartarea());
		Point loc = t.getFb().getLocation();
		Thread.sleep(4000);
		int x=loc.getX();
		int y=loc.getY();
		utilities.scrollBar(driver,x,y);
		Thread.sleep(3000);
		t.faceBook();	
	
		/*Demoapp_tc2 da=new Demoapp_tc2(driver);
		utilities.dropDown(da.getDropdown(),pdata.getPropertyData("coursedd"));
		Demoapp2_tc2 da2=new Demoapp2_tc2(driver);
		Thread.sleep(3000);
		utilities.dragDrop(driver, da2.getSeltraining(), da2.getCartarea());
		utilities.scrollbarjs(driver,da2.fb1());
		da2.faceBook();*/
		
		
	}

}
