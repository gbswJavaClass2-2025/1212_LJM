package exam04;

public class PepperoniPizza extends Pizza{
	public PepperoniPizza(String size) {
		super(size);
	}
	String name = "페퍼로니피자";
	int prices = 17000;
	String toppings = "pepperoni";
	@Override
	public void cook() {
		System.out.println(toppings + "을 추가합니다.");
		System.out.println(name + size + "을 조리합니다.");
		System.out.println(name + size + "이 완료되었습니다.");
	}
}
