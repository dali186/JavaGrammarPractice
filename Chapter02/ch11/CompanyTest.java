package ch11;

import java.util.Calendar;

public class CompanyTest {
	
	public static void main(String[] args) {
	
		Company company = Company.getInstance();
		Company companies = Company.getInstance();
		
		System.out.println(company);
		System.out.println(companies);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
}
}
