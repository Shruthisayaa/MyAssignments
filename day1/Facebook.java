package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shruthi");
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sekar");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		//// Step 10: Enterthe password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("12345678");
		// Step 11: Handle all the three drop downs
////Dropdown for date of birth
		WebElement dateofbirth = driver.findElement(By.id("day"));
		//creatw an object for select class
		Select date=new Select(dateofbirth);
		date.selectByVisibleText("16");
		WebElement monthofbirth = driver.findElement(By.id("month"));
		Select month=new Select(monthofbirth);
		month.selectByIndex(5);
		WebElement yearofbirth = driver.findElement(By.id("year"));
		Select year=new Select(yearofbirth);
		year.selectByValue("1992");
		//// Select the radio button  Female" 
	     driver.findElement(By.xpath("//input[@value='1']")).click();
		
	}

}
