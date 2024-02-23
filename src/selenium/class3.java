package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3 {

	public static void main(String[] args) throws InterruptedException {
		
		// To launch chrome driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		//simple alert code
		//to click the button
		WebElement box = d.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		box.click();
		
		
		Thread.sleep(5000);
		
		//alert handling main code
		Alert a =d.switchTo().alert();
		
		//accept the alert
		a.accept();
		
		//close the browser
		//d.close();
		
		
		//confirmation alert code
		// to click the button
		
		WebElement box1 = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		box1.click();
		
		//to click the button2
		WebElement box2 = d.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		box2.click();
		
		Thread.sleep(5000);
		
		//alert handling main code
		Alert b =d.switchTo().alert();
		
		//cancel
		b.dismiss();
		
		//prompt code
		//to click the button
		WebElement box3 = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		box3.click();
		
		//to click the second button
		WebElement box4 = d.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		box4.click();
		
		
        Thread.sleep(5000);
		
		//alert handling main code
		Alert c =d.switchTo().alert();
		
		
		
		
		//to enter the data in text field
		c.sendKeys("Tara");
		
		//accept the alert
		 c.accept();
		
		
		
		
		

		
		
		
		
		
		
		
		

	}

}
