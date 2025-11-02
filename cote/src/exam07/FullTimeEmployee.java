package exam07;

public class FullTimeEmployee extends Employee{
	int annualSalary;
	FullTimeEmployee(String name, String employeeId, int annualSalary){
		this.name = name;
		this.employeeId = employeeId;
		this.annualSalary = annualSalary;
	}
	int calculatePay() {
		return annualSalary/12;
	}
}
