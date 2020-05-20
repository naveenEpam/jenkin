package com.my.ocp;

public class MoneyTransferProcessorFactory {
	
	public static MoneyTransfer build(String transferType) {
		if (transferType.equalsIgnoreCase("Local")) {
			return new DomesticMoneyTransfer();
		}else if (transferType.equalsIgnoreCase("International")) {
			return new InternationalMoneyTransfer();
		}
		return null;
	}

}
