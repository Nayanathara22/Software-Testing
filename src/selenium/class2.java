package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class2 {

	public static void main(String[] args) throws InterruptedException {
		// to launch Chrome browser 
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demoqa.com/automation-practice-form");
		System.out.println("Browserlaunched");
		
		
		Thread.sleep(3000);
		
		//To pass the input in firstname command
		
		WebElement firstname = d.findElement(By.id("firstName"));
		firstname.sendKeys("Thara");
		System.out.println("First name entered");
		
		//to pass lastname command
		
		WebElement lastname = d.findElement(By.id("lastName"));
		lastname.sendKeys("R");
		System.out.println("Last name entered");
		
		//to pass 

		
		//to pass email command
		
		WebElement email = d.findElement(By.id("userEmail"));
		email.sendKeys("thara@gmail.com");
		System.out.println("email entered");

		
		//to pass gender command
		
		WebElement gender = d.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]"));
		gender.click();
		System.out.println("Gender clicked");

		
		//to pass mobilenumber command
		
		WebElement mobilenumber = d.findElement(By.id("userNumber"));
		mobilenumber.sendKeys("9894678900");
		System.out.println("mobile number entered");
		
		//to scrolldown
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,1000)");

		
		//to pass hobbies command(sports)
		
		WebElement hobbies = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		hobbies.click();
		System.out.println("SPorts entered");

		
		//to pass hobbies command(reading)
		
		WebElement hobbies2 = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));
		hobbies2.click();
		System.out.println("reading entered");

		
		//to pass hobbies command(music)
		
		WebElement hobbies3 = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
		hobbies3.click();
		System.out.println("music entered");

		
		//to pass address command
		WebElement address = d.findElement(By.id("currentAddress"));
		address.sendKeys("jhfcfzudyfivukshfusdhguvh");
		System.out.println("Address entered");
		
		
		//to click the box
		WebElement box = d.findElement(By.id("dateOfBirthInput"));
		box.click();
		
		//to click month
		WebElement box1 = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		box1.click();
		
		//to select month
		
		Select s= new Select(box1);
		s.selectByIndex(4);
		
		// to click year
		WebElement box2 = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		box2.click();
		
		//to select year
		Select s1= new Select(box2);
		s1.selectByIndex(102);
		
		//to click date
		WebElement date = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]"));
		date.click();
		
		//file chosen
		WebElement file = d.findElement(By.id("uploadPicture"));
		file.sendKeys("C:\\Software Testing\\Notes");
		
		
		
		
		

		
	}

}
