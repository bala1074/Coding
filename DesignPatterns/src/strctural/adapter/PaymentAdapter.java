package strctural.adapter;

import java.util.ArrayList;

public class PaymentAdapter implements HREmployees {
	
	ArrayList<Employee> employees;

	@Override
	public void doPayment(String[][] employeesStrings) {

		employees=new ArrayList<>();
		
		for(int i=0;i<employeesStrings.length;i++){
			Employee employee=new  Employee();
			employee.setEid(employeesStrings[i][0]);
			employee.setName(employeesStrings[i][1]);
			employee.setDesignation(employeesStrings[i][2]);
			
			employees.add(employee);
		}
		
		//Composition..object adapter
		ThirdPartyPayment  thirdParty = new ThirdPartyPaymentImplementation();
		thirdParty.processPayment(employees);
		
		
	}

	
	
}
