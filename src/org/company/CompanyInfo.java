package org.company;
// class
public class CompanyInfo {
	// method 1
	private void companyName() {
		
		System.out.println("Company Name :  Greens Technology");
	}
	// method 2
	private void companyId() {
	
		System.out.println("Company Id : 001");
	}// method 3
	private void companyAddress() {
	
		System.out.println("Company Address : Omr,Tamabaram,AnnaNagar etc");
	}// main method
	public static void main(String[] args) {
		
		CompanyInfo c = new CompanyInfo();
		//method call
		c.companyName();
		c.companyId();
		c.companyAddress();
		
	}
}
