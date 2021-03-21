package MethodOverloading;

public class MainClass {

	public static void main(String[] args) {

		Util ui = new Util();
		ui.dr();
		ui.dr(0);
		ui.dr(0, 0);
		ui.dr(0, "");
		ui.dr("", "");
	}

}
