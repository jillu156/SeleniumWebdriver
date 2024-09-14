package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTYPES 
{
	WebDriver dr = new ChromeDriver();
	
  @Test
  public void webtable()
  {
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  dr.get("https://testautomationpractice.blogspot.com/");
	  dr.manage().window().maximize();
	  
	  //Static Table
	  
	  //Find total number of rows in table
	  
	int rsize = dr.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();
	//System.out.println(rsize);
	 //FInd Columns in table. GO to first TR (header) and count column
	
	int csize = dr.findElements(By.xpath("//table[@name = 'BookTable']//th")).size();
	//System.out.println(csize);
	
	//capture the data from nth row and nth column
	
	/*String Tableval = dr.findElement(By.xpath("//table[@name = 'BookTable']//tr[5]//td[1]")).getText();
	System.out.println(Tableval);*/
	
	//Print all data from table
	
	for (int r=2; r<=rsize;r++)
	{
		for (int c=1;c<=csize;c++)
		{
		String value = dr.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		System.out.println(value);
		//System.out.print(value); -- Use print for table column and then the print ln commneted below
		
		}
		
		//System.out.println();
	}
	
	
	
	  
	  
  }
}
