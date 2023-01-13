import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click crm/sfa link
		driver.findElement(By.xpath("//a[contains(text(),'  CRM/SFA')]")).click();
		//Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Click on Phone
        driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
        //Enter phone number
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123000");
        //Click find leads button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        //Capture lead ID of First Resulting lead
        driver.findElement(By.xpath("//a[text()='12373']")).click();
        //Click Delete
        driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
        //Enter captured lead ID
    	//click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys("12373");
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	    WebElement findElement = driver.findElement(By.xpath("//div[text()='No records to display']"));
	    String string = findElement.getText();
	    if(string.equals("No records to display"))
	    {
	     System.out.println("Successful deletion");
	    }
	    else {
	    	System.out.println("Unseccessfull deletion");
	    }
	    driver.close();
	    
	    }
				}


