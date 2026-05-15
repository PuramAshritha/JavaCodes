package com.oops1;

public class HomeLoan extends BankLoan {
	void getHomeLoanDocInfo() {
		System.out.println("All docs submitted Successfully !!");
	}

	@Override
	public double getROI() {
		return 8.5;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Home Loan Banking !!");
		HomeLoan hl = new HomeLoan();
		int cibil = hl.getCibilScore();
		double salary = hl.getCustomerSalary();
		int age = hl.getCustomerAge();
		boolean IsEligible = cibil > 700 && salary > 30000.00 && age > 22 && hl.isValidAadhaar() && hl.isValidPAN()
				&& hl.isValidPhone();
		if (IsEligible) {
			System.out.println("Congrtulations !! Your Home Loan got approved ");
			System.out.println("Your Home Loan ROI is : " + hl.getROI());
			System.out.println("As entered Confirming Your Detials are : ");
			System.out.println(hl.getCustomerAddressDetails());
			hl.getHomeLoanDocInfo();
		} else {
			System.out.println("Sorry !! Your Home Loan got Rejected ");
		}
	}
}
