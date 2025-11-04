package exam04;

public class Nurse extends Employee{
	void work() {
		System.out.println("환자를 돌봅니다.");
	}
	double calculateSalary() {
		return baseSalary;
	}
}
