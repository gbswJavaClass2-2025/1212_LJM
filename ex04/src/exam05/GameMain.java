package exam05;

public class GameMain {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("이스칸다르");
		AttackSkill attackSkill = new AttackSkill("아이오니언 헤타이로이", 999999999);
		attackSkill.excute();
	}

}
