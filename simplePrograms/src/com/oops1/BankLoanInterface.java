package com.oops1;

public interface BankLoanInterface {
	public abstract String getCustomerAddressDetails();

	public abstract boolean isValidPAN();

	public boolean isValidPhone();

	public boolean isValidAadhaar();

	public abstract double getROI();

	public abstract int getCibilScore();

	public abstract int getCustomerAge();

	public abstract double getCustomerSalary();

}
