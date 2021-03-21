package CallOtherClassMemberMethod;

import util.callableClass;

public class mainnClass {

	public static void main(String[] args) {

		callableClass cc = new callableClass();
		
		cc.normalMethod();
		callableClass.staticMethod();
	}

}
