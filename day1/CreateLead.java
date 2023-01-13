package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateLead {

	public static void main(String[] args) {
	//launch the browser
		ChromeDriver driver=new ChromeDriver();
	//load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
	//maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//find the username by using locator
	//enter the username as demosalesmanager
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");  
	//find the password 
	//enter the password as crmsfa
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	//Click login
	    driver.findElement(By.className("decorativeSubmit")).click();
	  //verification
	    String title = driver.getTitle();//ctrl+2+L
	    System.out.println(title);
	  //Click CRMSFA
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    //click on the lead
	    driver.findElement(By.linkText("Leads")).click();
	    //Click the create lead  
	    driver.findElement(By.linkText("Create Lead")).click();
	    //Enter the company name
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
       //Enter FirstName using id Locator
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shruthi");
	    //Enter LastName using id Locator
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
	    //Select value as Employee in Source Using SelectbyVisible text
	    //find the element 
	    WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    //create obj for select class  	
	    Select src=new Select(source);
	    src.selectByVisibleText("Employee");
	    //Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
	    //find the element
	    WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select mark=new Select(market);
	    mark.selectByValue("9001");
	    market.click();
	    //Select value as Corporation in OwnerShip field Using SelectbyIndex
	    //find the element and create a webelement which will return
	    
	    WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    //create an obj for select class
	    Select own=new Select(owner);
	    own.selectByIndex(5);
	    //Select value as India in Country Field Using SelectbyVisibletext
	    //find the element and create a webelement which will return
	    WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    //create an obj for select class
	    Select india=new Select(country);
	    india.selectByVisibleText("India");
	    //Click on create Lead Button Using name Locator
	    driver.findElement(By.className("smallSubmit")).click();
	    //Get the Title of the resulting Page
	    String title1= driver.getTitle();
	    System.out.println(title1);
	    
	    
	}

	
	
	
}
