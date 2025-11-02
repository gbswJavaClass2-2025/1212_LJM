package exam08;

public class Tire {
	String name;
	float roll;
	float curRoll = 0;
	Tire(String name, float roll){
		this.name = name;
		this.roll = roll;
	}
	boolean roll() {
		if(curRoll >= roll) {
			return false;
		}
		else {
			return true;
		}
	}
}
