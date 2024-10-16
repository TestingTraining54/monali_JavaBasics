package day7;

public class HDFCBank implements IRBIBank {

	@Override
	public void withdrawMoney() {
		System.out.println("HDFC withdraw money of 90K");
		
	}

	@Override
	public void depositMoney() {
		
		System.out.println("HDFC deposit money of 70K");
	}

}
