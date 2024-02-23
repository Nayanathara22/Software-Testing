package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class5 {

	public static void main(String[] args) {
		// To launch the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
        d.get("https://demoqa.com/browser-windows");
        
        WebElement tab = d.findElement(By.id("tabButton"));
        tab.click();
        
        WebElement newwindow = d.findElement(By.id("windowButton"));
        newwindow.click();
        
//        WebElement newwindowmessage = d.findElement(By.id("messageWindowButton"));
//        newwindowmessage.click();
        
        java.util.Set<String> childwindows = d.getWindowHandles();
        
        for (String allTabs : childwindows) {
        	d.switchTo().window(allTabs);
        	d.navigate().to("https://www.google.co.in/");
        }
        
	}

}
