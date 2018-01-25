package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import cucumberTest.BaseClass;
import junit.framework.Assert;

public class stepdefinition extends BaseClass 
{
	@Before
	public void open_browser()
	{
		BaseClass.openBrowser();
	}
	
	@Given("^I am on homepage$")
	
	public void givenStatment()
	{
		// Open site
		driver.get("http://automationpractice.com/index.php");

		// Maximize browser
		
		driver.manage().window().maximize();
		
 	    }
	
	@Given("^I am on this url \"([^\"]*)\"$")
	public void I_am_on_this_url(String arg1)
	{
		driver.get("http://automationpractice.com/index.php?"+arg1);
	}
	     
	@When("^I click on the \"([^\"]*)\" link$")
	//@Repeatable("^I follow \"([^\"]*)\" link$")
	public void i_click_on_the_link(String arg1) throws Throwable 
	{
	    driver.findElement(By.linkText(arg1)).click();
	    
	}
	
		   @When("^I enter username and password$")
	       public void whenStatement()
	       {
	           // Enter email-id on the element found
	    
	           driver.findElement(By.id("email")).sendKeys("niki01jain@gmail.com"); 
	           driver.findElement(By.id("passwd")).sendKeys("nikita@123");
	           
	       }  
	           @When("^I enter email-address in \"([^\"]*)\"$")
	           public void i_enter_email_address_in(String arg1) throws Throwable 
	           {
	               driver.findElement(By.id("email_create")).sendKeys("niki01jain@gmail.com");
	           }

	           @When("^I click on the button \"([^\"]*)\"$")
	           public void i_click_on_the_button(String arg1) throws Throwable
	           {
	        	   String value = findLocator(arg1);
	        	   driver.findElement(By.xpath(value)).click();

	           }

	           @Then("^I should see \"([^\"]*)\"$")
	           public void i_should_see(String arg1) throws Throwable 
	           {
	        	   Assert.assertEquals(arg1,driver.getTitle());
	        	   
	           }
	           
	           @Then("^I wait for \"([^\"]*)\" milliseconds$")
	           public void I_wait_for_page_load(String arg1) throws NumberFormatException, InterruptedException 
	           {
	        	   Thread.sleep(Integer.parseInt(arg1));

	           }
	           
	           @When("^I enter random text \"([^\"]*)\" with \"([^\"]*)\"$")
	           public void i_enter_random_text(String locator, String value) throws Throwable 
	           {
	        	   BaseClass.getElementType(locator).clear();
	        	   BaseClass.getElementType(locator).sendKeys(value+BaseClass.randomNo());
	        	   
	           }  
	           
	           @When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	           public void i_fill_in_with(String locator, String value) throws Throwable 
	           {
	        	   BaseClass.getElementType(locator).clear();
	        	   BaseClass.getElementType(locator).sendKeys(value);
	        	   
	           }  
	           
	           @When("^I select \"([^\"]*)\" with \"([^\"]*)\"$")
	           public void i_select_with(String locator, String value) throws Throwable 
	           {
	        	  BaseClass.getElementType(locator).sendKeys(value);
	        	   
	           } 
	           
	           @Then("^the warning message appears as \"([^\"]*)\"$")
	           public void the_warning_message_appears_as(String arg1) throws Throwable 
	           {
	        	   String warningMessage = driver.findElement(By.cssSelector(findLocator("warningMessage"))).getText();
	               Assert.assertEquals(arg1,warningMessage);
	            // Write code here that turns the phrase above into concrete actions
	               throw new PendingException();
	            
	           }
	           
	           @When("^I press \"([^\"]*)\"$")
	           public void i_press(String locator) throws Throwable 
	           {
	        	   BaseClass.getElementType(locator).click();
	        	   
	           }
	           
	           @When("^I follow \"([^\"]*)\"$")
	           public void i_follow(String locator) throws Throwable 
	       		{
	       		driver.findElement(By.linkText(locator)).click();
	       		}
	           
	            @Then("^I hover over the element \"([^\"]*)\"$")
	       		public void i_hover_over_the_element(String locator) throws Throwable 
	       		{
	       			 
	               Actions action = new Actions(driver);
	        
	               action.moveToElement(BaseClass.getElementType(locator)).build().perform();
	       		}
	            
	            @Then("^I should see the tab \"([^\"]*)\"$")
	            public void i_should_see_the_tab(String arg1) throws Throwable 
	            {
	                driver.findElement(By.className(arg1));
	            	// Write code here that turns the phrase above into concrete actions
	                throw new PendingException();
	            }
	            
	            
	            @When("^I wait for Ajax to load$")
	        	public void i_wait_for_Ajax_to_load() throws Throwable 
	        	{
	        		
	        		
	        		 WebDriverWait wait = new WebDriverWait(driver, 30);

	        		    // wait for jQuery to load
	        		    ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
	        		      public Boolean apply(WebDriver driver) {
	        		        try {
	        		          return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
	        		        }
	        		        catch (Exception e) {
	        		          // no jQuery present
	        		          return true;
	        		        }
	        		      }
	        		    };

	        		  

	        		  wait.until(jQueryLoad);
	        	
	        	}
	        	
	           
	           @When("^I create an account with email address \"([^\"]*)\" and password \"([^\"]*)\"$")
	           public void i_create_an_account_with_email_address_and_password(String arg1, String arg2) throws Throwable 
	           {
	               driver.findElement(By.id("customer_firstname")).sendKeys("Nikita");
	               driver.findElement(By.id("customer_lastname")).sendKeys("Jain");
	               driver.findElement(By.id("email")).sendKeys("niki01jain@gmail.com");
	               driver.findElement(By.id("passwd")).sendKeys("nikita@123");
	               driver.findElement(By.id("firstname")).sendKeys("nikita");
	               driver.findElement(By.id("lastname")).sendKeys("jain");
	               driver.findElement(By.id("address1")).sendKeys("Flat no. NL-301");
	               driver.findElement(By.id("city")).sendKeys("Bangalore");
	               driver.findElement(By.id("id_state")).sendKeys("Karnataka");
	               driver.findElement(By.id("postcode")).sendKeys("560062");
	               driver.findElement(By.id("id_country")).sendKeys("India");
	               driver.findElement(By.id("phone_mobile")).sendKeys("7894561237");
	               driver.findElement(By.id("alias")).sendKeys("jain01nikita");
	            		   
	           }

	     @After 
	       public void quit()
	       {
	    	   //driver.quit();
	       }

}
