package coreJavaLevel1Coding;

public class WelcomeToJava {
	
	void add()
	{
		int a = 10;
		int b=20;
		int c = a+b;
		System.out.println(c);
	}
	
	void sub()
	{
		int a = 10;
		int b=20;
		int c = a-b;
		System.out.println(c);
	}
	
	void mul()
	{
		int a = 10;
		int b=20;
		int c = a*b;
		System.out.println(c);
	}

	public static void main(String[] t)
	{
		WelcomeToJava wj = new WelcomeToJava();
		wj.add();
		wj.sub();
		wj.mul();
	}

}
