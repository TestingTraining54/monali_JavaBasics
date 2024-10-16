package day7;

public class ICICIBank implements IRBIBank {

	public void depositMoney() {
		System.out.println("ICICI deposit money of 50K");
	}

	@Override
	public void withdrawMoney() {
		System.out.println("ICICI withdraw money of 1lakh");
		
	}

	
}
