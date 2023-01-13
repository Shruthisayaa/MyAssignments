package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the browser
		driver.manage().window().maximize();
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//Enter FirstName & Last name Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shruthi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shruthi");
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Engineer");
		//Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I have 5 years of experience in Automation");
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shruthisa16@gmail.com");
		//Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
		//Get the Title of Resulting Page using driver.getTitle()
	     String title = driver.getTitle();	
	     System.out.println(title);
	     //Click on Duplicate button
	     driver.findElement(By.linkText("Duplicate Lead")).click();
	    // Clear the CompanyName Field using .clear() And Enter new CompanyName
	     driver.findElement(By.id("createLeadForm_companyName")).clear();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTest");
	     //Clear the FirstName Field using .clear() And Enter new FirstName
	     driver.findElement(By.id("createLeadForm_firstName")).clear();
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiruba");
	     //click on Create Lead Button
	     driver.findElement(By.className("smallSubmit")).click();
	     //Get the Title of Resulting Page using driver.getTitle()
	     String title1 = driver.getTitle();
	     System.out.println(title1);
	     }

}
