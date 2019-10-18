package org.company;

public class CompanyInfo {
	public void companyName(int companyid,String name,long companyno ) {
System.out.println("The company id is "+companyid);		
System.out.println("The company name is "+name);
System.out.println("The company number is"+companyno);
	}

	public static void main(String[] args) {
		CompanyInfo comp = new CompanyInfo();
		comp.companyName(28, "Greens", 78889427);
	}
}
