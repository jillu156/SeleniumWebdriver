package FirstTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class RelativeXPATH {
	
	WebDriver dr = new EdgeDriver();

  @Test
   void RelXpath() throws InterruptedException 
  {
	  dr.get("https://demo.opencart.com/");
	  dr.manage().window().maximize();
	  //REL XPATH WITH SINGLE ATTRIBUTE
	  //dr.findElement(By.xpath("//*[@type='text']")).sendKeys("Sri");
	  
	  //REL XPATH WITH MULTIPLE ATTRIBUTE
	 // dr.findElement(By.xpath("//*[@type='text'][@placeholder='Search']")).sendKeys("Sri");
	  
	  //Rel XPATH with AND operator (BOTH should be True)	  
	 // dr.findElement(By.xpath("//*[@type ='tet' and @placeholder = 'Search']")).sendKeys("Sri");
	  
	  //Rel XPATH with AND operator (ATLEAST one should be True)	  
	  //dr.findElement(By.xpath("//*[@type ='text' or @placeholder = 'Sarch']")).sendKeys("Sri");
	  
	  //BY USING INNER TEXT (ONLY IF AVAILABLE) Text Method
	  //Thread.sleep(5000);
	  //dr.findElement(By.xpath("//*[text()='MacBook']")).click();
	  
	  //BY USING CONTAINS Method (ONLY IF AVAILABLE)
	//  dr.findElement(By.xpath("//*[contains(@placeholder,'ear')]")).sendKeys("Sri");

	  //BY USING starts-with Method (ONLY IF AVAILABLE)
	//  dr.findElement(By.xpath("//*[starts-with(@placeholder,'ear')]")).sendKeys("Sri");
	  
	  //BY USING CHINED XPATH
	  boolean val = dr.findElement(By.xpath("//*[@id='logo']/a/img")).isDisplayed();
	  System.out.println(val);
	  dr.findElement(By.xpath("//*[@id='logo']/a/img")).click();
	  
	  
	  
	  
		  
	  
	  
	  
  }
}
