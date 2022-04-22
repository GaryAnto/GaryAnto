package Codingii;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.flipkart.com/");
	    Actions act=new Actions(driver);   
	    act.sendKeys(Keys.ESCAPE).build().perform();
	    //driver.findElement(By.xpath("//button[text()='✕']")).click(); 
	    WebElement findElement = driver.findElement(By.xpath("//img[@alt='Fashion']"));
	    act.moveToElement(findElement).perform();
	    driver.findElement(By.linkText("Men's T-Shirts")).click();
	   WebElement c = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
	  act.dragAndDropBy(c, 90, 0).build().perform();
  Thread.sleep(3000);
	  WebElement d = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
	    act.dragAndDropBy(d, -60, 0).build().perform();
	    java.util.List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3']"));	    
	    for (WebElement Element : price) {
	    	System.out.println(Element.getText());
			}	   
	  driver.findElement(By.xpath("//div[@class='_10UF8M']")).click();
	  Thread.sleep(2000);
	  String f = driver.findElement(By.xpath("(//div[@class='_30jeq3'])[1]")).getText();
	  System.out.println(f);
	  driver.findElement(By.xpath("(//div[@class='_30jeq3'])[1]")).click();
	  Thread.sleep(3000);
	  Set<String> type=driver.getWindowHandles();
	  driver.findElement(By.xpath("//input[@class='cfnctZ']")).sendKeys("123456");
	  driver.findElement(By.xpath("//a[text()='L']")).click();  
	  driver.findElement(By.linkText("ADD TO CART")).click();
	 
	}
}
