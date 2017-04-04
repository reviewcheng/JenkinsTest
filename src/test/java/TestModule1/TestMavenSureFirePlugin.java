package test.java.TestModule1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import main.java.utils.Browsers;
import main.java.utils.BrowsersType;




public class TestMavenSureFirePlugin {

	private WebDriver driver;

	
	@BeforeClass
	public void beforeClass(){
		Browsers browser = new Browsers(BrowsersType.chrome);
		driver = browser.driver;
	}

	@Test
	public void testLinkCase(){
		
		
		driver.get("http://www.126.com");
		driver.findElement(By.xpath("//input[@id='idInput']")).clear();
		driver.findElement(By.xpath("//input[@id='idInput']")).sendKeys("FireflyAutomation");
		
		driver.findElement(By.xpath("//input[@id='pwdInput']")).sendKeys("Firefly");
		driver.findElement(By.xpath("//input[@id='pwdInput']")).submit();		
		Assert.assertEquals(true, true);
	}
	
	@AfterClass
	public void quit(){
		driver.quit();
	}
}