package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecuto {
  WebDriver dr = new ChromeDriver();
	@Test
  public void JavScriptExec() throws InterruptedException 
  {
	  // Alternate of.Click() and .sendkeys() methods
	  
	dr.get("https://testautomationpractice.blogspot.com");
	
	  dr.manage().window().maximize();
	 
	/* WebElement el = dr.findElement(By.id("name"));
	 WebElement el1 = dr.findElement(By.id("male"));
	 //el.sendKeys("abcd"); //Done through action()*/
	 
	 //Create JavaScript Executor variable	 
	 JavascriptExecutor js = (JavascriptExecutor)dr;
	 
	//sendkeys done through JavaScript Executor
	 //js.executeScript("arguments[0].setAttribute('value','abcd')",el);//SendKeys
	 
	 
	 //Click() done through JavaScript Executor
	// js.executeScript("arguments[0].click()",el1); //Click
	 
	 //Scroll Bar . (NOT A WEBELEMNT)
	 // 1. Till it reaches Pixel number
	 // js.executeScript("window.scrollBy(0,1500)",""); // from 0 till reaches 3000 pixel. 
	// System.out.println(js.executeScript("return window.pageYOffset;")); // To print how much pixel it moved to
	 
	 // 2. Till some element is visible
	 
	// WebElement el2 = dr.findElement(By.xpath("//h2[text()='Web Table']"));
	// js.executeScript("arguments[0].scrollIntoView();",el2); // from 0 till 'Web Table' is displayed. 
	// System.out.println(js.executeScript("return window.pageYOffset;")); // To print how much pixel it moved to
	 
	 
	 // 3. Till end of page
	 
	 js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //GO to End of Page
	 System.out.println(js.executeScript("return window.pageYOffset;")); // To print how much pixel it moved to
	 Thread.sleep(3000);
	 
	 //GO back to initial point
	 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	 
	 //Zoom in/out Webpage
	 js.executeScript("document.body.style.zoom='200%'");
	 Thread.sleep(3000);
	 
  }
}
