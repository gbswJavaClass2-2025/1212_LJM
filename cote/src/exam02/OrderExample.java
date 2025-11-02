package exam02;

public class OrderExample {

	public static void main(String[] args) {
		Menu chicken = new Menu("chicken",21000);
		Menu pizza = new Menu("pizza",17000);
		Menu hamburger = new Menu("hamburger",5000);
		Menu[] menu = {chicken,pizza,hamburger};
		OrderItem order = new OrderItem(menu,5);
		System.out.println(order.GetPrice("pizza"));
	}

}
