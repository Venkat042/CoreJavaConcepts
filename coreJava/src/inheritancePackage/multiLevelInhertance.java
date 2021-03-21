package inheritancePackage;

class grandpaClass{
	
	void land()
	{
		System.out.println("Grandpa Land");
	}
 
}

class fatherClass extends grandpaClass {
	
	void cash()
	{
		System.out.println("Father Cash");
	}
}
public class multiLevelInhertance extends fatherClass {
	
	void childHome()
	{
		System.out.println("Child Home");
	}

	public static void main(String[] args) {

		multiLevelInhertance ml = new multiLevelInhertance();
		
		ml.land();
		ml.cash();
		ml.childHome();
	}

}
