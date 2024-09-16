package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicLocators
{
	//1. Launch ChromeBrowser
	  WebDriver dr = new ChromeDriver(); // WebDriver as Parent; ChromeDriver Child
	 
  @Test
   void Locate() 
  {
	  dr.get("https://demo.opencart.com/");
	  dr.manage().window().maximize();
	  
	  //Locate by name
	  dr.findElement(By.name("search")).sendKeys("sri");
	  
	  //Locate by ID
	  boolean LogoDisplay = dr.findElement(By.id("logo")).isDisplayed();//isdisplayed returns  boolean value
	  System.out.println(LogoDisplay);
	  
	  
	  //Link Text and click
	  //dr.findElement(By.linkText("Tablets")).click();
	  
	//Link Text and click
	 // dr.findElement(By.partialLinkText("Tab")).click();
	  
	  //Group of Webelemnts inside a class
	// Capture Header links and find number of links on header 
	  // Use FindElements - Return Type is List <WebElements>
	  List<WebElement> navBAR = dr.findElements(By.className("list-inline-item"));
	  System.out.println(navBAR.size());
	  
	//Group of Webelemnts inside a tag
	  //a is the tag of all LINKS
	  List<WebElement> tg = dr.findElements(By.tagName("a"));
	 System.out.println(tg.size());
		
	  //img is the tag of all images
	  List<WebElement> im = dr.findElements(By.tagName("img"));
	 System.out.println(im.size());

	  
	  
	  
	  
	  
	  
	  
	  
  }
}
