package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) {
		// To launch the chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		
		//to get link
		d.get("https://www.google.co.in/");
		
		//interact with searchbox
		WebElement searchbox=d.findElement(By.id("APjFqb"));
		
		//isEnabled
		boolean enablecheck = searchbox.isEnabled();
		System.out.println("Is textbox is enabled?"+enablecheck);
		
		
		//is Displayed
		boolean displaycheck = searchbox.isDisplayed();
		System.out.println("Is textbox displayed?"+displaycheck);
		
		//getSize
		org.openqa.selenium.Dimension size = searchbox.getSize();
		System.out.println("Box size is?"+size);
		
		
		
		
		

	}

}
