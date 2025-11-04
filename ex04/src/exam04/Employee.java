package exam04;

public class Employee extends Person{
	int baseSalary;
	void work() {
		System.out.println("일합니다.");
	}
	double calculateSalary() {
		return baseSalary;
	}
}
