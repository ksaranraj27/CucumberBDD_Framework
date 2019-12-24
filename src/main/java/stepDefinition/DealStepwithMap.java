package stepDefinition;

	import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

// datatable with map is used for parametrization of testcases
	public class DealStepwithMap {	
		WebDriver driver;
		
		@Given("^user is on login page$")
		public void user_on_login_page() {
			
		    System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver = new ChromeDriver();	
			driver.get("https://www.freecrm.com/");
			
		}
		
		@When("^title of the login page$")
		public void title_of_the_login_page() {
			
		    String title=driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);

		}
		
		
		@Then("^user enters  username and  password$")
		public void user_enters_username_and_user_enter_password(DataTable credentials) {
			
		 for(Map<String , String> data : credentials.asMaps(String.class, String.class)) {;
			
		    driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));
		 }
		}
		
		@Then("^user clicks on login button$")
		public void user_clicks_on_login_button(){
		
		    WebElement ele=	driver.findElement(By.cssSelector("input.btn.btn-small"));
			JavascriptExecutor js=( JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", ele);
					
		}

		@Then("^user is on HomePage$")
		public void user_is_on_HomePage(){
		
	     	String title=driver.getTitle();
			Assert.assertEquals("CRMPRO", title);
		}
		
		
		@Then("^user move to deal page$")
		public void user_move_to_deal_page()  {
			driver.switchTo().frame("mainpanel");
			
			WebElement element= driver.findElement(By.linkText("DEALS"));
			Actions action = new Actions(driver);
			
			action.moveToElement(element).perform();
			
			driver.findElement(By.linkText("New Deal")).click();
		}
		
		
		@Then("^user enter deal details$")
		public void user_enter_deal_details(DataTable dealdata)  {
		   
			 for(Map<String , String> data : dealdata.asMaps(String.class , String.class)) {
				 
			  driver.findElement(By.id("title")).sendKeys(data.get("title"));
				driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
				driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
				driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
				 
				driver.findElement(By.cssSelector("input[type=submit][value=Save]")).click();
				
				WebElement element= driver.findElement(By.linkText("DEALS"));
				Actions action = new Actions(driver);			
				action.moveToElement(element).perform();
				driver.findElement(By.linkText("New Deal")).click();
		    
		}
		}
		@Then("^user close the browser$")
		public void user_close_the_browser()  {
	      
		driver.quit();
	    }
		

	}

