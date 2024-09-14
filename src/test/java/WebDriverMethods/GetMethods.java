package WebDriverMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods 
{
  @Test
  public void get() 
  {
	  WebDriver dr = new ChromeDriver();
	  
	  //get(url) - Opens url in broswer
	  dr.get("https://demo.automationtesting.in/Register.html");
	  dr.manage().window().maximize();
	  
	  //getTitle() - Get title of the page in STRING Format
	  String Title = dr.getTitle();
	  System.out.println(Title);
	  Assert.assertEquals(Title, "Register");
	  
	  //getCurrentUrl() - Return URL of a webpage
	 System.out.println(dr.getCurrentUrl());
	 
	 //getPageSource() - Return source code of the webpage. VERIFY SOMETHING ON PAGE SOURCE RATHER THAN UI.
	 System.out.println(dr.getPageSource());
	  
	 //getWindowHandle() - Returns ID as STRING (Dynamic. Not a constant value. 
	 //ID will be created at run time and cannot be found in DOM) of the Single/Current Browser 
	 System.out.println(dr.getWindowHandle());
	  
	 //getWindowHandles() - Returns IDs as a set of Strings (Collection) for all windows opened by wenbdriver.
	 dr.findElement(By.xpath("//a[@class = 'link facebook']")).click();
	 System.out.println(dr.getWindowHandles()); //[3EDD934E2219CF3D31D80695C3CA6FA8, 0CCD16AFD36373C5E0563AB576DE6A3D]
	 
	 //or use
	 Set<String> s = dr.getWindowHandles();
	 System.out.println(s);//[3EDD934E2219CF3D31D80695C3CA6FA8, 0CCD16AFD36373C5E0563AB576DE6A3D]
  }
}
