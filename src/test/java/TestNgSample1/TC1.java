package TestNgSample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//JUST CHECK PRIORITY
public class TC1 
{
	WebDriver dr ;
	//Open Application
	@Test(priority=1)
	void Openapp()
	{
		dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		dr.get("https://demo.automationtesting.in");
		dr.manage().window().maximize();
	}
	
	//Login
	@Test(priority=2)
	void Login()
	{
		boolean logo = dr.findElement(By.id("logo")).isDisplayed();
		if (logo == true)
		{
		dr.findElement(By.id("btn2")).click();
		}
		
	}
	
	//Close App
	@Test(priority=3)
	void Closeapp()
	{
		dr.close();
	}
	
}
