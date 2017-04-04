package test.java.TestModule3;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import main.java.utils.Browsers;
import main.java.utils.BrowsersType;



public class TestMutipleThreads {
	
	private WebDriver driver;
	

	@Test 
	public void visitJD(){		
		Browsers browser = new Browsers(BrowsersType.firefox);
		driver = browser.driver;
		driver.get("http://www.jd.com");

		driver.quit();
	}
	
	
	@Test 
	public void visit51buy(){		
		Browsers browser = new Browsers(BrowsersType.firefox);
		driver = browser.driver;
		driver.get("http://www.51buy.com");
		driver.quit();
		
	}
	

}
