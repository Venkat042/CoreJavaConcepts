package MethodOverloading;

/*
 Method name same but behaviour is different. This process is called as Overloading.
 It is also called Polymorphism.
 
 Rules:
 1. Method name should be same.
 2. Method type should be same (Return type method or No return type method).
 3. Method can defined as different types of parameters.
 4. Method can be defined as different types of parameters and different types of signature.
 5. Overloading can support constructor, instant/normal/user defined method and static method.
 */

public class Util {

	
	void dr()
	{
		System.out.println("Deposit by direct cash");
	}
	
	void dr(int a)
	{
		System.out.println("Deposit by online");

	}
	
	void dr(int a, int b)
	{
		System.out.println("Deposit by cheque");
	}
	
	void dr(int a,String b)
	{
		System.out.println("Deposit by DD");
	}
	
	void dr(String a,String b)
	{
		System.out.println("Deposit by UPI/Wallet");
	}
}
