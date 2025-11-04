package exam05;

public class Warrior extends Character{
	Warrior(String name){
		this.name = name;
	}
	Warrior(String name, int level){
		this.name = name;
		this.level = level;
	}
	void useSpecialAbility(){
		System.out.println("Charge!");
	}
}
