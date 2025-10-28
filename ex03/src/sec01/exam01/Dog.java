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
	@Override
	public void eat() {
		System.out.println(bread + ": 개이/가 일반적인 방식으로 먹이를 먹습니다.");
	}
	@Override
	public void eat(String prey) {
		System.out.println(bread + ": 개이/가 " + prey + "을/를 맛있게 먹습니다.");
	}
}
