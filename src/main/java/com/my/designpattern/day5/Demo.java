package com.my.designpattern.day5;

public class Demo {
	
	public static void main(String[] args) {
	
	ReportGenerationContext context = new ReportGenerationContext();
	
	
	context.setReportGenerator(new XMLReportGenerator());
	
	context.generateRequiredReport();

}
}
