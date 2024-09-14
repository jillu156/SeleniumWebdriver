package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitMethods
{
  @Test
  public void wai() 
  {
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://demo.automationtesting.in/Register.html");
	  dr.manage().window().maximize();
	  
//Implicit Wait (One Single statement can solve synch issue in all places.)
	  //dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //dr.findElement(By.xpath("//*[@class='link facebook']")).click();
	  
//Explicit Wait (Declaration ; Condition ; Usage)
	  
	  //1. Declaration : Use WebDriverWait Class with 2 Params (dr, Time)
	  
	  WebDriverWait wai = new WebDriverWait(dr, Duration.ofSeconds(5)); //5 seconds max to wait for condition to be met
	  
	  //2. Condition: Use until Method and ExpecetedCondition Class
	  
	  wai.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='link facebook']"))).click();
	  
	  
	  
	  
	  
	  
  }
}
