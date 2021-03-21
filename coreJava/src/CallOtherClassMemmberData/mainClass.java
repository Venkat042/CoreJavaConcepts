package CallOtherClassMemmberData;

public class mainClass {

	public static void main(String[] args) {

    util u = new util(); //Object Constructor
    u.normalMethod();
    util.otherClassStaticMethod();
    
     new myTestcase(); //Objectless Constructor
	

	}

}
