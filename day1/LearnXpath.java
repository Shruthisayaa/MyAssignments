package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	
		public static void main(String[] args) {
			//launch the browser
				ChromeDriver driver=new ChromeDriver();
			//load the url
				driver.get("http://leaftaps.com/opentaps/control/login");
			//maximize the browser
				driver.manage().window().maximize();
				//enter username using Xpath
				driver.findElement(null)
	}

}
