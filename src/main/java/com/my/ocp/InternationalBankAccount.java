package com.my.ocp;

public class InternationalBankAccount extends BankAccount {

	@Override
	void transferMoney(Double account) {
		//do a custom money transfer for international account. 
	}
}

//Problem here is extending BankCcount introduces strong coupling. 

//Better extract this functionality of money transfer to an interface. 