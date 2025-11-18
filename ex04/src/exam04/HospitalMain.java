package exam04;

public class HospitalMain {

	public static void main(String[] args) {
		Doctor doctor = new Doctor("Lee");
		Person person = doctor;	
		person.work();
	}

}
