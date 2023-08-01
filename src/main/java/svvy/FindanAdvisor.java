package svvy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FindanAdvisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://svvy.customerdevsites.com/");
	    driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	  
	    driver.findElement(By.xpath("//a[text()='Find an advisor']")).click();
	     driver.findElement(By.xpath("//input[@id='advisor_name']")).sendKeys("advisor");
	     driver.findElement(By.xpath("//input[@id='advisor_name_validation']")).click(); 
	     
	     // what type of
	     driver.findElement(By.xpath(" //label[normalize-space()='Financial Advisor/Planner']")).click();
	     
	     WebElement next1 = driver.findElement(By.xpath("//input[@id='expert_type_validation']"));
	     js.executeScript("arguments[0].click();", next1);
	     
	     // zipcode
	     driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("85920");
	     WebElement next2 = driver.findElement(By.xpath("  //input[@class='btn action-button step-3']"));
	     js.executeScript("arguments[0].click();", next2);
	     
	     driver.findElement(By.xpath("//label[@for='flexCheckDefault-aa']")).click();  
	     WebElement next3 = driver.findElement(By.xpath(" //input[@id='qualities_btn']"));
	     js.executeScript("arguments[0].click();", next3);
	     
	     // what brings you to svvy today
	     driver.findElement(By.xpath("//label[@for='flexCheckDefault-ab']")).click();  
	     WebElement next4 = driver.findElement(By.xpath("//input[@id='what_brings_btn']"));
	     js.executeScript("arguments[0].click();", next4);
	 
	    
	     try {
	     WebElement move1 = driver.findElement(By.xpath("//input[@id='range']")); 
	     Actions act = new Actions(driver);
	     
	   //  Actions moveSlider = new Actions(driver);
	     Action ac = act.dragAndDropBy(move1, 0, 30).build();
	     ac.perform();
	     }catch(Exception e) {
	    	 System.out.println(e);}
	     
	WebElement next5 = driver.findElement(By.xpath("//input[@class='next action-button']"));
    js.executeScript("arguments[0].click();", next5);
    
    driver.findElement(By.xpath("//label[@for='Instagram']")).click();  
    WebElement next6 = driver.findElement(By.xpath("//input[@id='social_btn']"));
    js.executeScript("arguments[0].click();", next6);
  //label[@for='Instagram']
	     
	   


	}

}
