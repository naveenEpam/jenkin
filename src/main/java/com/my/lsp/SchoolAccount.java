package com.my.lsp;

public class SchoolAccount implements Account {

	public void processLocalTransfer(Double amount) {
		System.out.println("Doing some business logic here");

	}

	public void processInternationalTranfser(Double amount) {
		//this is a local school and no international transfers are there. 
		throw new RuntimeException("Not Implemented");

	}

}
