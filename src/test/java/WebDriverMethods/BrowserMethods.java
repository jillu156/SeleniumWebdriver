package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserMethods 
{
  @Test
  public void browser() throws InterruptedException 
  {
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://demo.automationtesting.in/Register.html");
	  dr.manage().window().maximize();
	  System.out.println(dr.getWindowHandle());
	  Thread.sleep(4000);
	  dr.findElement(By.xpath("//a[@class = 'link facebook']")).click();
	  dr.findElement(By.xpath("//a[@class = 'link twitter']")).click();
	  //3 browser opened
	  Thread.sleep(4000);
	  dr.close(); // Closes Parent window
	  Thread.sleep(4000);
	  dr.quit();// Closes All windows
	  
  }
}
