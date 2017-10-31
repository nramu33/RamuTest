package cucumberTest;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SeleniumTest {
		private static WebDriver driver = null;
		public static String driverPath = System.getProperty("user.dir");
        
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		System.out.println("Current dir using System:" +driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath+"\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();  
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
 
        driver.get("http://www.adactin.com/HotelAppBuild2/");
 
       // Find the element that's ID attribute is 'log' (Username)
 
        // Enter Username on the element found by above desc.
 
        driver.findElement(By.id("username")).sendKeys("Test"); 
 
        // Find the element that's ID attribute is 'pwd' (Password)
 
        // Enter Password on the element found by the above desc.
 
        driver.findElement(By.id("password")).sendKeys("password");
 
        // Now submit the form. WebDriver will find the form for us from the element 
 
        driver.findElement(By.id("login")).click();
 
 
        // Find the element that's ID attribute is 'account_logout' (Log Out)
        String welcome_Text=driver.findElement (By.id("username_show")).getAttribute("value");
        if(welcome_Text.equals("Hello ramunimmana!")){
            // Print a Log In message to the screen
        	System.out.println(welcome_Text); 
            System.out.println("Login Successfully");
        	}
        driver.findElement(By.linkText("Logout"));
 
        // Print a Log In message to the screen
 
        System.out.println("LogOut Successfully");
 
        // Close the driver
 
        driver.quit();
 
	}
 
}