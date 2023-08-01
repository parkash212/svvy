package svvy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IAM_Advisor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://svvy.customerdevsites.com/");
	    driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	   driver.findElement(By.xpath("//a[@class='btn nav-link']")).click();
	     driver.findElement(By.xpath("//input[@id='advisor_name']")).sendKeys("demo");
	     
	  driver.findElement(By.xpath("//input[@id='advisor_name_validation']")).click();
	  driver.findElement(By.xpath("//label[@for='flexCheckDefault-a']")).click();
	  
	    WebElement next2 = driver.findElement(By.xpath("//input[@id='services_next_btn']"));
	    js.executeScript("arguments[0].click();", next2);
	    driver.findElement(By.xpath("//input[@placeholder='53066']")).sendKeys("85920");  //input[@placeholder='53066']
	    Thread.sleep(2000);
	  
	    WebElement next3 =  driver.findElement(By.xpath("//input[@class='next action-button step-3']"));
	    js.executeScript("arguments[0].click();", next3);
	    
	    driver.findElement(By.xpath("//label[@for='flexCheckDefault-aa']")).click(); 
	    WebElement next4 =  driver.findElement(By.xpath("//input[@id='unique_qualities_next_btn']"));
	    js.executeScript("arguments[0].click();", next4);
	  
	    driver.findElement(By.xpath("//label[@for='flexCheckDefault-ab']")).click(); 
	 
	    WebElement next5 =  driver.findElement(By.xpath("//input[@id='service_two_next_btn']"));
	    js.executeScript("arguments[0].click();", next5);
	    
	    driver.findElement(By.xpath("//label[@for='flexCheckDefault-abc']")).click(); 
	 
	    WebElement next6 =  driver.findElement(By.xpath(" //input[@id='client_type_next_btn']"));
	    js.executeScript("arguments[0].click();", next6);
	    
	    driver.findElement(By.xpath("//label[@for='flexCheckDefault-abcd']")).click();  
	    WebElement next7 =  driver.findElement(By.xpath("//input[@id='active_licenses_next_btn']"));
	    js.executeScript("arguments[0].click();", next7);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath(" //input[@placeholder='289-9999']")).sendKeys("4505062");
	    WebElement next8 =  driver.findElement(By.xpath("//input[@class='next action-button step-8']"));
	    js.executeScript("arguments[0].click();", next8); //input[@placeholder='289-9999']
	  //input[@class='next action-button step-8']
	    Thread.sleep(4000);
	    // crd
	    WebElement nexts =  driver.findElement(By.xpath("//input[@class='next action-button step-9']"));
	    js.executeScript("arguments[0].click();", nexts); 
	  
	  //input[@class='next action-button step-9']
	    
	    WebElement next9 =  driver.findElement(By.xpath(" //input[@id='complaints_next_btn']"));
	    js.executeScript("arguments[0].click();", next9); 
	    
	    driver.findElement(By.xpath("//label[@for='flexCheckDefault-aae']")).click();  
	    WebElement next10 =  driver.findElement(By.xpath("//input[@id='fee_structure_next_btn']"));
	    js.executeScript("arguments[0].click();", next10); 
	    
	    // how you hear 
	  //label[@for='Instagram']
	    driver.findElement(By.xpath("  //label[@for='Instagram']")).click();  
	    WebElement next11 =  driver.findElement(By.xpath("//input[@id='about_svvy_next_btn']"));
	    js.executeScript("arguments[0].click();", next11); 
	    
	    // yes no 
	    driver.findElement(By.xpath("//label[@for='flexRadioDefault11']")).click();  
	    WebElement next12 =  driver.findElement(By.xpath("//input[@id='committed_next_btn']"));
	    js.executeScript("arguments[0].click();", next12); 
	 
	    
	  

	}

}
