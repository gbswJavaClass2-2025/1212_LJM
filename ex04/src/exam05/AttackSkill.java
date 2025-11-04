package exam05;

public class AttackSkill extends Skill{
	int damage;
	AttackSkill(String skillName, int damage){
		this.skillName = skillName;
		this.damage = damage;
	}
	void excute() {
		System.out.println("Dealt "+damage+" damage using "+skillName+".");
	}
}
