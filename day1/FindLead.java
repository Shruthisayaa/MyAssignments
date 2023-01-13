package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Enter the username as demosalesmanager
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		//Enter the password as crmsfa
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//click login 
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//click crmsfa
		driver.findElement(By.xpath("//a[contains(text(),'  CRM/SFA')]")).click();
		//Click Leads link
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Shruthi");
		//Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Click on first resulting lead
		driver.findElement(By.xpath("//a[text()='11947']")).click();
		//Verify title of the page11 Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		//Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//Change the company name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("LeafTest");
		//Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		 //Confirm the changed name appears
    	 String value = driver.findElement(By.id("viewLead_companyName_sp")).getText();
    	 System.out.println("Confirm the changed name appears:" +value);
    	 driver.close();
    	 
    	 
    	 
    	 
		
		
		
	}

}
