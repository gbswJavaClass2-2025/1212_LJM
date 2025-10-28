package sec01.exam02;

public class PizzaShop {

	public static void main(String[] args) {
		System.out.println("----- 피자 가게 시스템 실습 시작 -----");
		Pizza plainPizza = new Pizza("씬 크러스트" , 10);
		ToppingPizza cheesePizza = new ToppingPizza("핸드 토스", 12, "모짜렐라");
		ToppingPizza pepperoniPizza = new ToppingPizza("팬 도우", 14, "페퍼로니");
		System.out.println("\n------------------------------------\n");
		System.out.println("[4. 오버라이딩 (설명)]");
		System.out.println("Plain Pizza: " + plainPizza.describe());
		System.out.println("Cheese Pizza: " + cheesePizza.describe());
		System.out.println("Pepperoni Pizza: " + pepperoniPizza.describe());
		System.out.println("\n------------------------------------\n");
		System.out.println("[3. 오버로딩 (굽기)]");
		System.out.println("Plain Pizza: " + plainPizza.bake());
		System.out.println("Plain Pizza: " + plainPizza.bake(15));
		System.out.println("Pepperoni Pizza (표준): " + pepperoniPizza.bake());
		System.out.println("Pepperoni Pizza (표준): " + pepperoniPizza.bake(20));
		System.out.println("Pepperoni Pizza (표준): " + pepperoniPizza.bake(350, 18));
		System.out.println("\n----- 실습 종료 -----");
	}

}
