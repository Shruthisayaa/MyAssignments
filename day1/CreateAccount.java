package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//Enter UserName and Password Using Id Locator
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 //Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();
		//Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		//Enter AccountName Field Using id Locator value as Debit Limited Account
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		//Enter DEscriptiion as "Selenium Automation Tester"
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Enter LocalName Field Using Xpath Locator 
		//tagname[@attributeName='attributevalue']
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Shruthi");
		//Enter SiteName Field Using Xpath Locator
		//tagname[@attributeName='attributevalue']
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
		//Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		//tagname[@attributeName='attributevalue']
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("1cr");
		//Select Industry as ComputerSoftware
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		//create an obj 
	    Select industryobj=new Select(industry);
	    industryobj.selectByIndex(3);
	    //Select OwnerShip as S-Corporation using SelectByVisibletext
	    WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
	    //Create obj 
	    Select owner=new Select(ownership);
	    owner.selectByVisibleText("S-Corporation");
	    //Select Source as Employee using SelectByValue
	    WebElement Source=driver.findElement(By.id("dataSourceId"));
	    //create obj
	    Select src=new Select(Source);
	    src.selectByValue("LEAD_EMPLOYEE");
	    //Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
	    WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
	    Select market=new Select(marketing);
	    market.selectByIndex(6);
	    //Select State/Province as Texas using SelectByValue 
	    WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select province= new Select(state);
	    province.selectByValue("TX");
	    //Click on Create Account using Xpath Locator
	    ////tagname[@attributeName='attributevalue']
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    
	}

	
}
