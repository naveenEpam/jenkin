package com.my.lsp;

public class DriverClass {
	
	public static void main(String[] args) {
		
		Account a = new SchoolAccount();
		a.processInternationalTranfser(new Double(10000));
	
	}
	
	//Account is not fully substitutable by school acccounrtt 
}
