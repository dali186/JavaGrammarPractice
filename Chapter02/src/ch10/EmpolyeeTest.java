package ch10;

public class EmpolyeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");

		System.out.println(employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeId());
		
	}

}
