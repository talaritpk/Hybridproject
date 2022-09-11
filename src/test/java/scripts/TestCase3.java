package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CoreJavaForSeleniumPage;
import pomPages.FramePageWishlist;
import pomPages.SkillraryLoginPage;

public class TestCase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage slp=new SkillraryLoginPage(driver);
		slp.textBox(pdata.getPropertyData("textbox"));
		slp.acceptc();
		slp.searchclick();
		CoreJavaForSeleniumPage cj=new CoreJavaForSeleniumPage(driver);
		cj.coreJava();
		FramePageWishlist fpw=new FramePageWishlist(driver);
		utilities.swithFrame(driver);
		fpw.playBtn();
		Thread.sleep(10000);
		fpw.pauuseBtn();
		utilities.swithBackFrame(driver);
		fpw.addWishlist();
	}

}
