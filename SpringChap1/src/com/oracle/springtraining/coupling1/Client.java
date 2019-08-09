package com.oracle.springtraining.coupling1;

public class Client {

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService("SBI1234");
		paymentService.pay(12000);
	}
}
