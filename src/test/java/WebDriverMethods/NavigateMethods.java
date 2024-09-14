package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateMethods 
{
	WebDriver dr = new ChromeDriver();
	
  @Test
  public void nav() throws MalformedURLException, InterruptedException 
  {
//navigate().to()
	 

	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  dr.get("https://google.com"); //Use get to open URL
	  dr.manage().window().maximize();
	  dr.navigate().to("https://demo.automationtesting.in/Register.html"); // Use navigate.to to Open URL
	  //Launch Another window
	  dr.findElement(By.xpath("//a[@class = 'link facebook']")).click();
	  dr.findElement(By.xpath("//a[@class = 'link twitter']")).click();
	  dr.findElement(By.xpath("//a[@class = 'link linkedin']")).click();
	  
	  
	  
	  

	
	  
	 /* URL myurl = new URL("https://demo.automationtesting.in/Register.html"); //Create an Object and then use
	  dr.navigate().to(myurl);*/
	  
//navigate.back()	  
	 // dr.navigate().back();//goes from demo to google
	 	  
//navigate.forward()
	 // dr.navigate().forward();
	  
//navigate.refresh()	  

	 // dr.navigate().refresh();

//Switchto()
	  
	  //Only 2 or 3 Browser Window
	  Set<String> setids = dr.getWindowHandles();// Set collection dont have get method to get inidivdual id. and do not have index 
	/*  List<String> listids = new ArrayList(setids);// Use List Collection to work on pages.
	  String Parent = listids.get(0);
	  String Child = listids.get(1);
	  //Get Id of Parent Window
	  System.out.println(dr.getTitle());

	  //Switch to second window
	  dr.switchTo().window(Child);
	  //Get Title of next window.
	  System.out.println(dr.getTitle());*/
	  
	  // Multiple Browser Window 
	  Thread.sleep(5000);
	  for (String win:setids)
	  {
		  String titl = dr.switchTo().window(win).getTitle();
		  
		 if(titl.equals("LinkedIn: Log In or Sign Up") || titl.contains("Automation Testing | Hyderabad | Facebook"));
		  {
			  System.out.println(dr.getTitle());
	  }}
	
	  //dr.switchTo().parentFrame();
	 // System.out.println(dr.getTitle());
	 
	 /* Set<String> st = dr.getWindowHandles();
	  List<String> list = new ArrayList(st);
	  String Par = list.get(0);
	  String Chi = list.get(1);
	  dr.switchTo().window(Chi);
	  System.out.println(dr.getTitle());
	  dr.findElement(By.xpath("//*[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1fq8qgq']")).click();
	*/
	  
	
  }
}
