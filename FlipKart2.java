package Codingii;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart2 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("https://www.flipkart.com/");
		    Actions act=new Actions(driver);   
		    act.sendKeys(Keys.ESCAPE).build().perform();
		    WebElement findElement = driver.findElement(By.xpath("(//div[@class='CXW8mj'])[5]"));
		    act.moveToElement(findElement).perform();
		    WebElement hair = driver.findElement(By.linkText("Health & Personal Care"));
            act.moveToElement(hair).perform();
            driver.findElement(By.linkText("Hair Dryers")).click();
            WebElement c = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
      	  act.dragAndDropBy(c, 90, 0).build().perform();
        Thread.sleep(3000);
      	  WebElement d = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
      	    act.dragAndDropBy(d, -60, 0).build().perform();
      	  Thread.sleep(5000);
      	List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3']"));	    
      	Thread.sleep(5000);
      	List<Integer> number=new ArrayList<Integer>();
      	for (WebElement Element : price) {
      		
      		String text = Element.getText();
      		//System.out.println(text);
	    	String replaceAll = text.replaceAll("\\D", "");
	    	System.out.println(replaceAll);
	    	int parseInt = Integer.parseInt(replaceAll);
	    	number.add(parseInt);
			}	
      	
			Collections.sort(number);
			System.out.println("---------sorting-----");
			System.out.println(number);
		}
    	    
	}


