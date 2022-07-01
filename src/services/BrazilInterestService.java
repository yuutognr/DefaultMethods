package services;

import java.security.InvalidParameterException;

public class BrazilInterestService {
	public double interestRate;

	public double getInterestRate() {
		return interestRate;
	}
	
	public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months be greater than zero");
		}
		return amount * Math.pow(1.0 + interestRate / 100.0, months);
	}
	
}
