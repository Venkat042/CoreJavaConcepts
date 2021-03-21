package inheritancePackage;

/*
 Inheritance can support avoid the duplicate method and duplicate object creation. 
 And also reuse the exisiting method behaviour in driver class.

 Java can directly support single inheritance, multilevel inheritance and hirearchy inheritance.
 
 Java can support to inherit the multiple and hybrid inheritance by using Interface.
 */

public class driverClass extends baseClass {

	void driverland()
	{
		System.out.println("Driver Class land");
	}

	void drivercash()
	{
		System.out.println("Driver Class cash");
	}
	
	public static void main (String[] a)
	{
		
		
		driverClass bv = new driverClass();
		bv.driverland();
		bv.drivercash();
		
		bv.baseland();
		bv.basecash();

		
	}
}
