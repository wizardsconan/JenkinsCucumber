package stepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Step {
	private static WebDriver driver;
	
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String exePath = "D:\\Cucumeber_Excersie\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
        
	   // throw new PendingException();
	}

	@When("^User Navigate to Login Page$")
	public void user_Navigate_to_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		
		 // throw new PendingException();
	}

	/*@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// Enter Username on the element found by above desc.
		driver.findElement(By.id("log")).sendKeys("tuan");
		// Enter Password on the element found by the above desc.
		driver.findElement(By.id("pwd")).sendKeys("VVlzJNLBtp5keqh(");
		//Click on Login button
		driver.findElement(By.id("login")).click();
		 //  throw new PendingException();
		*/
	
/*	@When("^User enters \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		
		driver.findElement(By.id("log")).sendKeys(username);
		// Enter Password on the element found by the above desc.
		driver.findElement(By.id("pwd")).sendKeys(password);
		//Click on Login button
		driver.findElement(By.id("login")).click();
	}
*/		   
	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(List<Credentials> usercredentials) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		for (Credentials credentials : usercredentials)
		{
			driver.findElement(By.id("log")).sendKeys(credentials.getUsername());
			// Enter Password on the element found by the above desc.
			driver.findElement(By.id("pwd")).sendKeys(credentials.getPassword());
			//Click on Login button
			driver.findElement(By.id("login")).click();
		}
	    
	    
	}	    

	@Then("^Message displayed Login successfully$")
	public void message_displayed_Login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// Print a Log In message to the screen
		 
        System.out.println("Login Successfully");
        // throw new PendingException();
	}

	@When("^User Log Out from the application$")
	public void user_Log_Out_from_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 // Find the element that's ID attribute is 'account_logout' (Log Out)
		 
        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
        // throw new PendingException();
	}

	@Then("^Message displayed Log Out successfully$")
	public void message_displayed_Log_Out_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 // Print a Log In message to the screen
		 
        System.out.println("LogOut Successfully");
        driver.quit();
        // throw new PendingException();
	}
}
