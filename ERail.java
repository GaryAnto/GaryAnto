package Codingii;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://erail.in/");
	    Actions act=new Actions(driver);   
	    driver.findElement(By.id("txtStationFrom")).clear();
	    driver.findElement(By.id("txtStationFrom")).sendKeys("Kerala");
	    act.sendKeys(Keys.ENTER).build().perform();
	    driver.findElement(By.id("txtStationTo")).clear();
	    driver.findElement(By.id("txtStationTo")).sendKeys("Delhi");
	    act.sendKeys(Keys.ENTER).build().perform();
	    driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	    
//	    List<WebElement> name = driver.findElements(By.tagName("td"));     //finding the size of column
//		String a = name.ge
//		System.out.println("Column Count: "+a);

//	    List<WebElement> train = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr//td[2]"));
//        int a=train.size();
//        System.out.println(a);
//	    for (int i = 0; i < tr.size(); i++) {
//        	  
		    List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr//td[2]/a"));
		    for (int i = 0; i < trainName.size(); i++) {
		    //	String text = trainName.get(i).getText();
		    	//System.out.println(text);
		 //  List<WebElement> trainnum = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr//td[1]/a"));
		   
	    	if(trainName.get(i).getText().contains("EXP")) {
	    		List<WebElement> trainId = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr//td[1]/a"));
		    	for (int j = 0; j < trainId.size(); j++) {
		    		String text = trainId.get(i).getText();
		    		System.out.println(text);
		    		break;
				}
	    	}
			}
	}
	    
	    
	    
	    
	}

