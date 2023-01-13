package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		// option.addArguments("--start-maximized");
		//option.addArguments("incognito");
		//launch the browser
		ChromeDriver driver=new ChromeDriver(option);
		//Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the user name
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		//login 
		driver.findElement(By.id("Login")).click();
		//click the app launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		//click the sales button
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		//Click on Opportunity tab 
		//driver.findElement(By.xpath("//a[@title='Opportunities']")).click();
		WebElement opp = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		//driver.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@title='Opportunities']")) );
		driver.executeScript("arguments[0].click();",opp);

		//Click on New button
		driver.findElement(By.xpath("//div[@title='New']")).click();
		//Enter Opportunity name as 'Salesforce Automation by Your Name
        driver.findElement(By.xpath("//label[text()='Opportunity Name']//following::input")).sendKeys("Salesforce Automation by Shruthi Sekar");
        //Enter the close date
        driver.findElement(By.xpath("//label[text()='Close Date']//following::input")).click();
        //select the current date 
        //Thread.sleep(10000);
        driver.findElement(By.xpath("//*[contains(@class,'is-today')]")).click();
        // Click Stage
        driver.findElement(By.xpath("//label[text()='Stage']//following::button")).click();
        // select Need Analysis
       // Thread.sleep(10000);
        driver.findElement(By.xpath("//label[text()='Stage']//following::span[text()='Needs Analysis']")).click();
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
        String successMsg = driver.findElement(By.xpath("//a[contains(@title,'Salesforce')]")).getText();
        System.out.println(successMsg);
        if (successMsg.contains("Salesforce Automation by Shruthi Sekar"))
        {
        	System.out.println("Test case --Pass--"+successMsg );
        }
        else
        {
        	System.out.println("Test case --Failed--"+successMsg );
        }

	
		
	
	}
}
