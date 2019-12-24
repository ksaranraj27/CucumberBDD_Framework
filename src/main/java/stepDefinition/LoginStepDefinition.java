/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	
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

	@Then("^user enters \"([^\"]*)\" and  \"([^\"]*)\"$")
	public void user_enters_username_and_user_enter_password(String username, String password) {
		
	    driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
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
	
	@Then("^user move to contact$")
	public void user_move_to_contact()  {
		
		driver.switchTo().frame("mainpanel");
		
		WebElement element= driver.findElement(By.linkText("CONTACTS"));
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		
		driver.findElement(By.linkText("New Contact")).click();

	}

	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and(String fname, String lname, String position)  {
		
		driver.findElement(By.id("first_name")).sendKeys(fname);
		driver.findElement(By.id("surname")).sendKeys(lname);
		driver.findElement(By.id("company_position")).sendKeys(position);
		driver.findElement(By.cssSelector("input[type=submit][value=Save]")).click();


	}

	@Then("^user close the browser$")
	public void user_close_the_browser()  {
      
	driver.quit();
    }
	
}
*/