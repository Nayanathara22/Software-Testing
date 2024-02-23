package selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {

	public static void main(String[] args) {
		// to launch Chrome browser 
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.google.co.in/");
		d.get("https://www.facebook.com/");
		d.navigate().back();
		
		//to get the current page url

		String currenturl = d.getCurrentUrl();
        System.out.println("current page url is:"+currenturl);
		
      //to get the current page title

       String pagetitle = d.getTitle();
       System.out.println("current page Title is:"+pagetitle);
       
       d.navigate().forward();

	   d.quit();
       
		
		

	}

}
