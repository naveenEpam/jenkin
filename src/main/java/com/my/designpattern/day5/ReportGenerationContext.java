package com.my.designpattern.day5;

public class ReportGenerationContext {

	private ReportGenerator reportGenerator;
	
	public void setReportGenerator(ReportGenerator rGenerator) {
		this.reportGenerator = rGenerator;
	}
	
	public void generateRequiredReport() {
		reportGenerator.GenerateReport();
	}
	
}

