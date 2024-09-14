package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider
{
	WebDriver dr = new ChromeDriver();
  @Test
  public void slide() 
  {
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		dr.manage().window().maximize();
		
		WebElement sli = dr.findElement(By.xpath("//div[@class = 'price-range-block']//span[1]"));
		sli.getLocation();//Location of the above webelement. Not mouse action yet.
		System.out.println(sli.getLocation());//gives x and y position
		
		Actions mouse = new Actions(dr);
		mouse.dragAndDropBy(sli, 100, 249).build().perform();//Move the slider with dragdropby with x and y 
		//If we have to move the last slider to front, give the - value
		//mouse.dragAndDropBy(sli, -100, 249).build().perform() //END SLIDER FROM TO A BIT BEFORE
		WebElement afterslide = dr.findElement(By.xpath("//div[@class = 'price-range-block']//span[1]"));
		System.out.println(afterslide.getLocation());
			
		
		
  }
}
