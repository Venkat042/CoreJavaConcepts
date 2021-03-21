package coreJavaLevel1Coding;

/*
 member method/instant method can contain member method name,member method name with data type or no return data type
 
 member method contain identification () and body of {} with statements
 **
 member method can defined with primitive or non primitive data type.
 In this method should be contain return statement.
   
 */
public class memberMethodDemo {
	
	void openApplication()
	{
		System.out.println("openApplication");
	}

	void openLoginPage()
	{
		System.out.println("Login Page");
	}
	
	void businessValidation()
	{
		System.out.println("Validation");
	}
	
	void Logout()
	{
		System.out.println("Log out");
	}
	
	void closeApplication()
	{
		System.out.println("Close");
	}
	
	int selenium()
	{
		System.out.println("primitive data type with method");
		return 10;
		
	}
	public static void main(String[] v)
	{
		memberMethodDemo md = new memberMethodDemo();
		md.openApplication();
		md.openLoginPage();
		md.businessValidation();
		md.Logout();
		md.closeApplication();
		md.selenium();
	}
}
