package com.oops1;


public class PersonalLoan extends BankLoan {

	public void getPersonalLoanDocInfo() {
		System.out.println("Submitted all the documents Successfully !!");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Personal Loan Banking !!");
		PersonalLoan pl = new PersonalLoan();

		int cibil = pl.getCibilScore();
		double salary = pl.getCustomerSalary();
		int age = pl.getCustomerAge();
         boolean IsEligible=cibil > 760 && salary > 25000.00 && age > 25 && pl.isValidAadhaar() && pl.isValidPAN()
 				&& pl.isValidPhone();
		if (IsEligible) {
			System.out.println("Congrtulations !! Your  Personal Loan got approved ");
			System.out.println("Your Personal Loan ROI is : " + pl.getROI());
			System.out.println("As entered Confirming Your Detials are : ");
			System.out.println(pl.getCustomerAddressDetails());
			pl.getPersonalLoanDocInfo();

		} else {
			System.out.println("Sorry !! Your  Personal Loan got Rejected ");
		}

	}

}
