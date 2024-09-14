package FirstTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC2 
{
	//1. Launch ChromeBrowser
	 //Classname var = new classname();
	 // ChromeDriver dr1 = new ChromeDriver(); as Child
	  WebDriver dr = new ChromeDriver(); // as Parent
  @Test(priority = 1) 
  void openapp() 
  {
	
  
  	//2. Launch URL -- use GET method - take URL as Param
  dr.get("https://demo.opencart.com/");
  
  	//3. Validate Title should eb "Your Store
  
 String ActualTitle = dr.getTitle();
 
 if(ActualTitle.equals("Your Store"))
 {
	 System.out.println("Title Matched");
 }
 else
 {
	 System.out.println("Title mismatch");
 } 

  	//4. Close Browser
  
//dr.close();

}
}
