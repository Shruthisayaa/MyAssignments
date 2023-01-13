package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class redBus {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		//launch the browser
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		//LOAD THE URL
		driver.get("https://www.redbus.in/");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Type "Chennai" in the FROM text box
		driver.findElement(By.id("src")).sendKeys("Chennai");
		 driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		//type bangalore in To text box
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		 //Select tomorrow's date in the Date field
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[text()='13']")).click();
		// Click Search Buses
		driver.findElement(By.id("search_btn")).click();
		//Print the number of buses shown as results (104 Buses found)
		String busfound = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		System.out.println("Number of buses found: "+busfound);
//Choose SLEEPER in the left menu
		driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[2]")).click();
		String busname = driver.findElement(By.xpath("//div[@class='travels lh-24 f-bold d-color']")).getText();
	System.out.println("Name of the second bus: "+busname);
	//Click the VIEW SEATS of that bus
	driver.findElement(By.xpath("//div[text()='View Seats']")).click();
	//
	String available = driver.findElement(By.xpath("(//div[@class='seat-left m-top-30'])")).getText();
	System.out.println("Number of seats available:" +available);
	}

}
