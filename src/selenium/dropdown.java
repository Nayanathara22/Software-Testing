package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// to launch the chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		System.out.println("Browserlaunched");
		
		Thread.sleep(5000);
		
		
		//how to handle dropdown code
		//select code for dropdown2 - select is a class
		WebElement drop = d.findElement(By.id("animals"));
		Select s2 = new Select(drop);
		s2.selectByIndex(2);
		
		
		

	}

}
