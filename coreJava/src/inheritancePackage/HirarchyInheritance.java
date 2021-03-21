package inheritancePackage;


class parent
{
	void land()
	{
		System.out.println("Father Land");
	}
	
	void cash()
	{
		System.out.println("Father Cash");

	}
}



public class HirarchyInheritance extends parent {

	public static void main(String[] args) {

		HirarchyInheritance hl = new HirarchyInheritance();
		hl.land();
		hl.cash();
		
	}

}
