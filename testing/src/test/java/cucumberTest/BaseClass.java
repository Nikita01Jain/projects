/**
 * 
 */
/**
 * @author Nikita
 *
 */
package cucumberTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	public static WebDriver driver;
	public static void openBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static String findLocator(String key) throws IOException
	{
		FileReader reader=new FileReader("C:\\Users\\Nikita\\eclipse-workspace\\testing\\src\\test\\java\\cucumberTest\\locator.properties");  
	    Properties p=new Properties();  
	    p.load(reader); 
	    return p.getProperty(key.replaceAll("\\s", ""));  
	}
	
	public static WebElement getElementType(String locator)
	{
		WebElement element;
		
		String pageSource = driver.getPageSource();
		
		if(pageSource.contains("id=\""+locator +"\""))
            element = driver.findElement(By.id(locator));
        else if(pageSource.contains("name=\""+locator +"\""))
            element = driver.findElement(By.name(locator));
        else if(locator.contains("@"))
            element = driver.findElement(By.xpath(locator));
        else
            element = driver.findElement(By.cssSelector(locator));

		return element;
		
	}
	
	public static String randomNo() 
    {
        String s = null;
        Random rdm = new Random();
        int iRand = rdm.nextInt(100000000);
        s = Integer.toString(iRand);
        return s;
    }
}
	
