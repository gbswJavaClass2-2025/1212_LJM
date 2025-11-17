package test.three;

public abstract class AbstractMonster {
	
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	
	public String GetName() {
		return this.name;
	}
	public int GetHp() {
		return this.hp;
	}
	public int GetAttack() {
		return this.attack;
	}
	public int GetDefense() {
		return this.defense;
	}
	
	protected AbstractMonster(String name, int hp, int attack, int defense){
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	
	public boolean defense(int attack) {
		if(this.defense >= attack) {
			return true;
		}
		else {
			this.hp -= (attack-defense);
			return false;
		}
	}
	public abstract int attack();
	
}
