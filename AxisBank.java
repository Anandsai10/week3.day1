package week3.day1.assignments;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("This is Axis deposit");
		
	}
	
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		
		axis.saving();
		axis.fixed();
		axis.deposit();
		axis.newDeposit();
		
	}
	public void newDeposit() {
		this.deposit();
	}


}
