package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String monkeyScript=" javascript: (function() {\r\n"
				+ "    function callback() {\r\n"
				+ "        gremlins.createHorde({\r\n"
				+ "            species: [gremlins.species.clicker(),gremlins.species.toucher(),gremlins.species.formFiller(),gremlins.species.scroller(),gremlins.species.typer()],\r\n"
				+ "            mogwais: [gremlins.mogwais.alert(),gremlins.mogwais.fps(),gremlins.mogwais.gizmo()],\r\n"
				+ "            strategies: [gremlins.strategies.distribution()]\r\n"
				+ "        }).unleash();\r\n"
				+ "    }\r\n"
				+ "    var s = document.createElement(\"script\");\r\n"
				+ "    s.src = \"https://unpkg.com/gremlins.js\";\r\n"
				+ "    if (s.addEventListener) {\r\n"
				+ "        s.addEventListener(\"load\", callback, false);\r\n"
				+ "    } else if (s.readyState) {\r\n"
				+ "        s.onreadystatechange = callback;\r\n"
				+ "    }\r\n"
				+ "    document.body.appendChild(s);\r\n"
				+ "    })()";
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		//driver.executeAsyncScript(monkeyScript);
		driver.executeScript(monkeyScript);

	}

}
