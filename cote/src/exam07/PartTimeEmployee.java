package exam07;

public class PartTimeEmployee extends Employee{
	int hourlyRate;
	int workHours;
	PartTimeEmployee(String name, String employeeId, int hourlyRate, int workHours){
		this.name = name;
		this.employeeId = employeeId;
		this.hourlyRate = hourlyRate;
		this.workHours = workHours;
	}
	int calculatePay(){
		return hourlyRate * workHours;
	}
}
