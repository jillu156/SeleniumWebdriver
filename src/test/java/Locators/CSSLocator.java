package Locators;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSLocator {
	WebDriver dr = new ChromeDriver();
  @Test
  void CSS() throws InterruptedException 
  {
	  Thread.sleep(5000);
  dr.get("https://demo.nopcommerce.com/login");
  dr.manage().window().maximize();
    
  //CSS 1 - tag#id
  //TO CHECK if CSS SELCTOR IS WORKING, Search in Inspect code using ctrl+F
  
// dr.findElement(By.cssSelector("input#wp-block-search__input-1")).sendKeys("Sri");
  
  //CSS 2 - Tag+Class
  //dr.findElement(By.cssSelector("input.search-box-text")).sendKeys("Sri");
  
  //CSS 3 - TAg+Attribute
  //dr.findElement(By.cssSelector("input[name='q']")).sendKeys("Sri");
  
  //CSS 4 Tag_Class+Attribute tag.classname[attr = "Value"]
  dr.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Sri");
  }
}
