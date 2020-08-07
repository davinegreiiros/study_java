package model.service;

public class PaypalService implements ServicePayment{
	
	@Override
	public double paymentFee(double amount) {
		return amount * 0.02;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * months * 0.01;
	}
	
}
