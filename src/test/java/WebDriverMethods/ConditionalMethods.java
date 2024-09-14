package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConditionalMethods
{
  @Test
  public void cond() 
  {
	//isDisplayed() - if an element is displayed.
	WebDriver dr = new ChromeDriver();
	dr.get("https://demo.automationtesting.in/Register.html");
	dr.manage().window().maximize();
	boolean dis = dr.findElement(By.xpath("//h2[text()='Register']")).isDisplayed();//'Register is found using text() method
	System.out.println(dis);
	
	//isEnabled() - If any element is dithered.
	boolean ena = dr.findElement(By.xpath("//input[@id='checkbox1']")).isEnabled();
	System.out.println(ena);
	
	//isSelected() - Radiobutton and Checkeboxes to ensure if option is selected or not. 
	dr.findElement(By.xpath("//input[@id='checkbox1']")).click();
	boolean sel = dr.findElement(By.xpath("//input[@id='checkbox1']")).isSelected();
	System.out.println(sel);
	
  }
}
