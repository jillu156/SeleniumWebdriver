package WebElements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertsOrPopups 
{
	WebDriver dr = new ChromeDriver();
@Test
  public void alert() throws InterruptedException 
  {
	  WebDriverWait wait = new WebDriverWait(dr,Duration.ofSeconds(5));
	  
	 /* dr.get("https://testautomationpractice.blogspot.com/");
	  dr.manage().window().maximize();
	  
	  dr.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
	  Thread.sleep(3000);
	  dr.switchTo().alert().accept(); //Accept Alert
	  
	  //Confirm Alert
	  dr.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
	  Thread.sleep(3000);
	  System.out.println(dr.switchTo().alert().getText());//Get Text from Alert
	  dr.switchTo().alert().dismiss();//Cancels Popup
	  
	  //Prompt Alert
	  dr.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
	  Thread.sleep(3000);
	  dr.switchTo().alert().sendKeys("Test");//We cannot see this in automation.
	  dr.switchTo().alert().accept();
	  
	  
	 //GHandle Alert withoput using switch(). We can use Explicit Wait
	  
	  Alert alwait = wait.until(ExpectedConditions.alertIsPresent());
	  alwait.accept();*/
	  
	  
	 //Authentication Popup
	 // dr.get("https://the-internet.herokuapp.com/basic_auth");
	  dr.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  dr.manage().window().maximize();
	  
	  
	  
  }



}
