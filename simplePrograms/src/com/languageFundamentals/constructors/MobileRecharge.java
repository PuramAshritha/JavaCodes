package com.languageFundamentals.constructors;

public class MobileRecharge {
	long mobileNo;
	int rechargeAmount;

	MobileRecharge(long mobileNo, int rechargeAmount) {
		this.mobileNo = mobileNo;
		this.rechargeAmount = rechargeAmount;
	}

	double addGST() {
		return rechargeAmount * 18 / 100;
	}

	double calculateFinalBill() {
		return rechargeAmount + addGST();
	}

	public static void main(String[] args) {
		MobileRecharge mr1 = new MobileRecharge(9876784563l, 299);
		mr1.display();

		MobileRecharge mr2 = new MobileRecharge(8974563219l, 345);
		mr2.display();
	}

	void display() {
		System.out.println("Mobile Number : " + mobileNo);
		System.out.println("Recharge Amount : " + rechargeAmount);
		System.out.println("GST Amount (18%) : " + addGST());
		System.out.println("Final Billing Amount is : " + calculateFinalBill());
		System.out.println("*****************");
	}
}
