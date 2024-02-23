package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class4 {

	public static void main(String[] args) {
		// To launch the chromedriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
        d.get("https://demoqa.com/browser-windows");
        
        //click tab
        
        WebElement tab = d.findElement(By.id("tabButton"));
        tab.click();
        
//        d.quit();
        
         d.close();
        
        //to get parentwindow id
        
        String parentwindow = d.getWindowHandle();
        System.out.println(parentwindow);
       
       
       Set<String> childwindows = d.getWindowHandles();
       
       for (String allTabs : childwindows) {
    	   d.switchTo().window(allTabs);
   	   
//    	   //d.close();(//close inside the loop will close all the tabs)
      }
       
      d.close(); //close the last tab
      d.switchTo().window(parentwindow);
      WebElement newwindow = d.findElement(By.id("windowButton"));
      newwindow.click();
      
      
      
    		   
	}
	

	

}
