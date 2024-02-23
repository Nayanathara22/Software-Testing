package project;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class class3 {

	public static void main(String[] args) throws IOException {
		// To launch the chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		//screenshot code
	    TakesScreenshot ss = (TakesScreenshot)d;
	    
	  //Source file - Takenscreenshot calling method
	  	File source = ss.getScreenshotAs(OutputType.FILE);
	  	
	  //destination file- where the file to save
	   File destination = new File ("C:\\Software Testing\\Screenshot\\img.png");
	   
	 //copy function
	   FileHandler.copy(source, destination);
	 		
	   d.quit();
	 		 

	}

}
