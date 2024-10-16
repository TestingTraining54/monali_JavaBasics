package day7;

public class MainClass {

	public static void main(String[] args) {
		IRBIBank icici = new ICICIBank();
		icici.depositMoney();
		
		IRBIBank hdfc = new HDFCBank();
		hdfc.depositMoney();
		
		AbstractClassDemo a=new ChildClassAbstractClassDemo();
		a.m1();
		a.m2();
		
		ICICIBank ic = new ICICIBank();

	}

}
