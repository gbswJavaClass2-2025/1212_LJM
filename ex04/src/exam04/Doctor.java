package exam04;

public class Doctor extends Employee{
	Doctor(String name, int id){
		this.name = name;
		this.id = id;
	}
	Doctor(String name){
		this.name = name;
	}
	@Override
	void work() {
		System.out.println("진료를 시작합니다.");
	}
	double calculateSalary() {
		return baseSalary*13/10;
	}
}
