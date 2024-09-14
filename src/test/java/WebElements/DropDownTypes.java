package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTypes
{
	WebDriver dr = new ChromeDriver();
  @Test
  public void dropdown() 
  {
	  /*dr.get("https://testautomationpractice.blogspot.com/");
	  dr.manage().window().maximize();
	  
//1. Select Dropdown - WILL HAVE SELECT TAG.  
	  
	  WebElement drop = dr.findElement(By.xpath("//select[@id = 'country']"));
	  //Use Select Class
	  Select drpdown = new Select(drop);
	  //selectByVisibleText()
	  drpdown.selectByVisibleText("Germany");
	  //selectByValue() - Use Attribute value
	  drpdown.selectByValue("uk");
	  //Use Index - Position from 0,1,2,3,4
	  drpdown.selectByIndex(4);
	  //How many are there
	  List<WebElement> opt = drpdown.getOptions();
	 System.out.println(opt.size());
	 
	 //Print each option
	 for(int i =0;i<opt.size();i++)
	 {
		 System.out.println(opt.get(i).getText());
	  
	 }
	//Using Enhaced for loop
	 for(WebElement op:opt)
	 {
		 System.out.println(op.getText());
		 
		 }
		 
//2. BootStrap Dropdown
	  dr.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
	  dr.manage().window().maximize();
	  dr.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
	  List<WebElement> boot = dr.findElements(By.xpath("//ul//a[@role ='menuitem']"));
	  System.out.println(boot.size());
	  for(WebElement li : boot)
	  {
		  System.out.println(li.getText());	 
		  
	   }*/
 
//3. Hidden Dropdown
	  //https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList
	  //Go top Event Listeners and remove Blur
	  //OR go to Selectors hub -> Turn Om Debugger and click on dropdown.
	  
//4. AutoSuggest Dropdown:
	  
	  dr.get("https://google.com");
	  dr.manage().window().maximize();  
	  dr.findElement(By.xpath("//textarea[@class = 'gLFyf']")).sendKeys("Selenium");
	  //Below not working
	  dr.findElement(By.xpath("//ul[@class = 'G43f7e']//div[@class=\"wM6W7d\"]//span[normalize-space(text()='selenium webdriver')]")).click();
  }
  
  
}
