package coreJavaLevel1Coding;

/*
 Instant/member method can be defined with "static" keyword.
 
 The static keyword is automatically manage the memory.
 
 The static keyword can refer the memory from "object of object class".
 
 static keyword with method not refer any user defined object (static method not required to call with object in main method.
 
 
 */

public class staticMethod {

	static void openApplication()
	{
		System.out.println("openApplication");
	}

	static void openLoginPage()
	{
		System.out.println("Login Page");
	}
	
	static void businessValidation()
	{
		System.out.println("Validation");
	}
	
	static void Logout()
	{
		System.out.println("Log out");
	}
	
	static void closeApplication()
	{
		System.out.println("Close");
	}
	
	static int selenium()
	{
		System.out.println("primitive data type with method");
		return 10;
		
	}
	
	public static void main (String[] g)
	{
		//staticMethod st = new staticMethod();
		
		openApplication();
		openLoginPage();
		businessValidation();
		Logout();
		closeApplication();
		selenium();
	}
}
