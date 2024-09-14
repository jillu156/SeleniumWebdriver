package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrames
{
	WebDriver dr = new ChromeDriver();
  @Test
  public void fram() throws InterruptedException 
  {
	  dr.get("https://ui.vision/demo/webtest/frames/");
	  dr.manage().window().maximize();
	  
	  WebElement fr = dr.findElement(By.xpath("//frame[@src='frame_1.html']"));//identify frame as webelement
	  dr.switchTo().frame(fr);//switch to frame
	  dr.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("1234");//input text in frame 1
	  dr.switchTo().defaultContent();//Come back to Main Page
	  
	 WebElement fr2 = dr.findElement(By.xpath("//frame[@src='frame_2.html']"));//Identify Frame2 as webelement
	 dr.switchTo().frame(fr2);//Switch to frame 2.
	 dr.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame2");
	 dr.switchTo().defaultContent();
	 
	 //Interact with inner iFrame
	 WebElement fr3 = dr.findElement(By.xpath("//frame[@src='frame_3.html']"));//Identify Frame3 as webelement
	 dr.switchTo().frame(fr3);//Switch to frame 3.
	 dr.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Frame3"); 
	 dr.switchTo().frame(0);
	 Thread.sleep(2000);
	 dr.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
	 dr.switchTo().defaultContent();
	 
	 
  }
}
