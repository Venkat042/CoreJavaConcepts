package coreJavaLevel1Coding;

/*
 Rules:
 
 1. Constructor can declared with name of as class name.(Constructor name should be same as of class name)
 2. Constructor can declare without any data type.
 3. Constructor can be declared with access specifier of public.
 4. Constructor is not allowed to any return type.
 Note: Constructor can execute during the object creation.
 5. Constructor is used to write the business logic of the application those logic are execute during the object creation.
 6. Constructor mainly support to initialize the instant variable values.
 */

public class constructorDemo {
	
	constructorDemo()
	{
		System.out.println("Normal constructor");
	}
	
	void normalMethod()
	{
		System.out.println("normalMethod");
	}

	static void staticMethod()
	{
		System.out.println("staticMethod");
	}
	
	public static void main(String[] d)
	{
		constructorDemo cd = new constructorDemo();
		cd.normalMethod();
		staticMethod();
		
		
	}
}
