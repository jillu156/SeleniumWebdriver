package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox
{
	WebDriver dr = new ChromeDriver();
  @Test
  public void check()
  {
	  dr.get("https://testautomationpractice.blogspot.com/");
	  dr.manage().window().maximize();
	  
	//Select Single Checkbox
	  //dr.findElement(By.xpath("//input[@id = 'wednesday']")).click();
	  
	//Select all Checkboxes
	  
	  List<WebElement> check = dr.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));
	  
	  System.out.println(check.size());//Ensure to match the actual counted checkbose
	  
	 /* for (WebElement i:check)
	  {
		 i.click();
	  }
	  dr.close();
	  
	//Select last 3 checkboxes (Total size (7); Starts from 4 to check 5,6,7)
	  
	  for (int i = 4;i<check.size();i++)
	  {
		  check.get(i).click();
	  }*/
	  
	//Selet 1st 3 Checkboxes
	  
	//Select last 3 checkboxes (Total size (7); Starts from 1 to check 3)
	  
	  for (int i = 0;i<3;i++)
	  {
		  check.get(i).click();
	  }
	  
	//Unselect the selected Checkboxes from Above
	  
	   for (int i = 0;i<3;i++)
	  {
		if(check.get(i).isSelected())
		{
			check.get(i).click();
		}
	  }
	  
  }
}
