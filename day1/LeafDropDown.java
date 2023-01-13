package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//get the url
		driver.get("https://www.leafground.com/select.xhtml");
		//maximize the browser
		driver.manage().window().maximize();
		//Dropdown for Favourite UI Automation Tool
		WebElement Ui=driver.findElement(By.className("ui-selectonemenu"));
		//create an obj for select class
		Select drop=new Select(Ui);
		drop.selectByVisibleText("Selenium");
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		

	}

}
