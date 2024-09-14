package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver dr = new ChromeDriver();
	
  @Test
  public void upload() 
  {
	  
	 dr.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	 dr.manage().window().maximize();
	 
	 //Upload Single  file using SendKeys method
	// dr.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:/Users/jillu/OneDrive/Desktop/1.png");
	 
	 
	 //Upload Multiple Files without REPLACING
	 dr.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:/Users/jillu/OneDrive/Desktop/1.png"+"\n"+"C:/Users/jillu/OneDrive/Desktop/2.png");
	 
	 //Capture the name of uploaded file from list .
	 
	 List <WebElement> li = dr.findElements(By.tagName("li"));
	 
	 for (WebElement i:li)
	 {
		 System.out.println(i.getText());
			
	 }
	
  }
}
