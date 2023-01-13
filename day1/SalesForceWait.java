package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//browser notification
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        //will open chrome browser
        ChromeDriver driver=new ChromeDriver(option);
        //maximize the window
        driver.manage().window().maximize();
        //load the url
        driver.get("https://login.salesforce.com/");
         //wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Enter username
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
        //Enter the password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testleaf$321");
        //click login
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        //click app launcher
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
         //close the browser
        //driver.close();

	}

}
