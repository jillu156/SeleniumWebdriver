package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseActions 
{
	
	WebDriver dr = new ChromeDriver();
	/*
  @Test
  public void mouse() 
  {
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  dr.get("https://demo.automationtesting.in/Register.html");
	  dr.manage().window().maximize();
	  
	WebElement par = dr.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
	 WebElement ch = dr.findElement(By.xpath("//a[text()='Alerts']"));
	 
	 //Create an object for ACTION Class
	 Actions mouse = new Actions(dr);
	 
	 //Use moveto Element method and navigate to parent then to child, Then click.
	 mouse.moveToElement(par).moveToElement(ch).click().build().perform();
	   
  }
  
  @Test
  
  public void rightclick() throws InterruptedException
  {
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	 
	  dr.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	  dr.manage().window().maximize();
	  
	  WebElement right = dr.findElement(By.xpath("//span[text()='right click me']"));
	  WebElement edit = dr.findElement(By.xpath("//span[text()='Edit']"));
	  
	  
	  //Create an object for ACTION Class
	  Actions mouse = new Actions(dr);
		 
	  mouse.contextClick(right).click(edit).build().perform();
	  Thread.sleep(3000);
	  dr.switchTo().alert().accept();
	  
	  }
  @Test
	public void dbclick() throws InterruptedException
  {
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	 
	  dr.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	  dr.manage().window().maximize();
	  
	  dr.switchTo().frame("iframeResult");
	  WebElement doub = dr.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	  Actions mouse = new Actions(dr);
	  mouse.doubleClick(doub).build().perform();
	 
	//gettext() will not work if innertext is not displayed in HTML. If you inspect the text, it will not be in HTML.
	//  String verify = dr.findElement(By.xpath("//input[@id = 'field2']")).getText();//So ABOVE WILL NOT WORK
	  //Hence use getattribute()
	  String verify = dr.findElement(By.xpath("//input[@id = 'field2']")).getAttribute("value");
	 
	  Assert.assertEquals(verify, "Hello World!");
	  
  }*/
	@Test
	public void drag()
	{
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		dr.manage().window().maximize();
		
		WebElement from = dr.findElement(By.xpath("//div[@id='box3']"));
		WebElement to = dr.findElement(By.xpath("//div[@id='box103']"));
		
		Actions mouse = new Actions(dr);
		mouse.dragAndDrop(from, to).build().perform();
		
	}
	
}
