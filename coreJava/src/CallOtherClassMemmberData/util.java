package CallOtherClassMemmberData;

public class util {

	util()
	{
	 System.out.println("Other class normal contructor");	
	}
	
	 static void otherClassStaticMethod()
	{
		System.out.println("Other Class Static Method");
	}
	 
	 void normalMethod()
	 {
		 System.out.println("Other Class Normal Method");
	 }
	 
	 
}



class myTestcase{
	
	myTestcase()
	{
	 System.out.println("Testcase constructor");
	 
	 myTestcase.otherClassStaticMethod();
	 myTestcase.normalMethod();
	 
	}
	
	 static void otherClassStaticMethod()
	{
		System.out.println("Other Class Static Method");
	}
	 
	 static void normalMethod()
	 {
		 
		 System.out.println("Other Class Normal Method");
	 }
	 
	
}
