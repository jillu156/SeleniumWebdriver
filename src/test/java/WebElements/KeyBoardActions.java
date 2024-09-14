package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyBoardActions 
{
	WebDriver dr = new ChromeDriver();
  @Test
  public void keyboard() 
  {
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get("https://text-compare.com");
		dr.manage().window().maximize();
		
		//Write in one text area and copy to other by keyboard actin like Ctrl+A;ctrl+c;tab;Ctrl+V
		
		WebElement left = dr.findElement(By.xpath("//textarea[@id = 'inputText1']"));
		left.sendKeys("I love Selenium java");
		
		//Create Keyboard Action class Object
		Actions keyb = new Actions(dr);
		
	 	//Ctrl+A
		//press the cntl key down+type A +release ctrl key up
		keyb.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		
		//Ctrl+C
		keyb.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		
		//Tab Key
		keyb.keyDown(Keys.TAB).build().perform();
		
		//Ctrl+V
		keyb.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		//Compare if corrcet
		String right = dr.findElement(By.xpath("//textarea[@id = 'inputText2']")).getAttribute("value");
	
		Assert.assertEquals(right, "I love Selenium java");
			
		
		
  }
}
