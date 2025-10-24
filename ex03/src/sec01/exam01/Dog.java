package sec01.exam01;

public class Dog extends Animal{
	String bread;
	public Dog(String bread) {
		this.bread = bread;
	}
	public void eat(int energy) {
		System.out.println(bread + ": 개(" + bread +"가 " + energy + " 칼로리만큼 에너지를 보충합니다.");
	}
	@Override
	public void makeSound() {
		System.out.println(bread + "소리: 멍멍!(품종: " + bread + ")");
	}
}
