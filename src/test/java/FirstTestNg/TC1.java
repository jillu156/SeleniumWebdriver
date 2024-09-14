package FirstTestNg;

import org.testng.annotations.Test;
//JUST CHECK PRIORITY
public class TC1 
{

	//Open Application
	@Test
	void Openapp()
	{
		System.out.println("OpenApp");
	}
	
	//Login
	@Test
	void Login()
	{
		System.out.println("Login");
	}
	
	//Close App
	@Test
	void Closeapp()
	{
		System.out.println("CloseApp");
	}
	
}
