package FirstTestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class iFrame {
  @Test
  public void iframes() {
	  
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://kitchen.applitools.com/ingredients/iframe");
	  dr.switchTo().frame("the-kitchen-table");
	  dr.switchTo().defaultContent();
	  
  }
}
