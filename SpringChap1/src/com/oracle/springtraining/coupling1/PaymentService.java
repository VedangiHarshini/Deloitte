package com.oracle.springtraining.coupling1;

public class PaymentService {
	
	private SavingsAccount savingsAccount;
	
	public PaymentService() {
		savingsAccount = new SavingsAccount("1234");
	}
	public PaymentService(String accountNumber) {
		// TODO Auto-generated constructor stub
		savingsAccount = new SavingsAccount(accountNumber);
	}
	public void pay(int amount){
	
		System.out.println("Payment using tight coupling ->"+ this.savingsAccount.getDetails()+" Amount is" + amount);
	}
}
