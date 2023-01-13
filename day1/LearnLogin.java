package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch the browser
				ChromeDriver driver=new ChromeDriver();
			//load the url
				driver.get("http://leaftaps.com/opentaps/control/login");
			//maximize the browser
				driver.manage().window().maximize();
			//find the username by using locator
			//enter the username as demosalesmanager
			 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}

}
