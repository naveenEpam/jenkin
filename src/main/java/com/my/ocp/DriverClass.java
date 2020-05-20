package com.my.ocp;

public class DriverClass {
	
	
	void transferMoney(Double amount, String transferType//local) {
		
		MoneyTransfer tm = MoneyTransferProcessorFactory.build(transferType);
		tm.transferMoney(amount);
	}

//other functionality
}
