package org.bank;

public class BankInfo extends AxisBank {
	//Child class
	public void saving() {
		System.out.println("I dont have saving bank account");
	}
	public void fixed() {
		System.out.println("Bala dont have fixed");
	}
	public static void main (String[] args) {
		BankInfo b = new BankInfo();
		b.deposit();
		b.fixed();
		b.saving();
	}

}
