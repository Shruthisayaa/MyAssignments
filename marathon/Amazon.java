package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("https://www.amazon.in/");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
		//enter bag for boys in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bag for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
	   String search = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[3]")).getText();
	   System.out.println(search);
       String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
       System.out.println(text);
       //Select the first 2 brands in the left menu(American Tourister, Generic)
       String search2 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
	   System.out.println(search2);
	   //Choose New Arrivals (Sort)
	   driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
	   driver.findElement(By.linkText("Newest Arrivals")).click();
	   //Print the first resulting bag info (name)
	   String bagname = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText();
	   System.out.println("Name of the bag: "+bagname);
	   //Print the first resulting bag info (discounted price)
	   String discount = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-price-instructions-style']")).getText();
	   System.out.println("Disounted Rate for the bag: "+discount);
	   
	   
		
		

	}

}
