package project;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class class1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		// To launch chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		Thread.sleep(3000);
		
		
		//to pass the inputs in firstname
		WebElement firstname = d.findElement(By.id("RESULT_TextField-1"));
		firstname.sendKeys("Thara");
		
		
		//to pass the inputs in lastname
		WebElement lastname = d.findElement(By.id("RESULT_TextField-2"));
		lastname.sendKeys("R");
		
		//to pass the input in phonenumber
		WebElement phonenumber = d.findElement(By.id("RESULT_TextField-3"));
		phonenumber.sendKeys("8989898989");
		
		//to pass the input in country
		WebElement country = d.findElement(By.id("RESULT_TextField-4"));
		country.sendKeys("India");
		
		//to pass the input in city
		WebElement city = d.findElement(By.id("RESULT_TextField-5"));
		city.sendKeys("Coimbatore");
		
		//to pass the input in email
		WebElement email = d.findElement(By.id("RESULT_TextField-6"));
		email.sendKeys("tara@gmail.com");
		
		//to pass the input in gender
		WebElement gender = d.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label"));
		gender.click();
		
		
		//to pass the input in consistency
		WebElement monday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td/label"));
		monday.click();
		
		WebElement tuesday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[3]/td/label"));
		tuesday.click();
		
		WebElement wednesday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[4]/td/label"));
		wednesday.click();
		
		WebElement thursday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[5]/td/label"));
		thursday.click();
		
		WebElement friday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[6]/td/label"));
		friday.click();
		
		WebElement saturday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[7]/td/label"));
		saturday.click();
		
		//to pass inputs in timetocontact
		WebElement time = d.findElement(By.id("RESULT_RadioButton-9"));
		Select s1 = new Select(time);
		s1.selectByIndex(3);
		
		//to choose file
		WebElement file = d.findElement(By.id("RESULT_FileUpload-10"));
		file.sendKeys("C:\\Software Testing\\Notes");
		
		//submit
//		WebElement submit = d.findElement(By.id("FSsubmit"));
//		submit.click();
		
	     //screenshot code
		TakesScreenshot ss = (TakesScreenshot)d;
		
		//Source file - Takenscreenshot calling method
		File source = ss.getScreenshotAs(OutputType.FILE);
		
		//destination file- where the file to save
		File destination = new File ("C:\\Software Testing\\Screenshot\\image.png");
		
		//copy function
		FileHandler.copy(source, destination);
		
		d.quit();
		 
		
		
	}

}
