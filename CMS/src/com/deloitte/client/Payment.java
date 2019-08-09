package com.deloitte.client;

public class Payment {
	static Payment payment = new Payment();
	private Payment()
	{
		System.out.println("object is created");
	}
	public static Payment getPaymentObj(){
		return payment;
	}
	public void pay(int amount)
	{
		System.out.println("Payment is done " + amount);
	}

}
