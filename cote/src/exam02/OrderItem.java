package exam02;

public class OrderItem {
	public Menu[] menu;
	public int quantity;
	
	public OrderItem(Menu[] Menu,int quantity) {
		this.menu = Menu;
		this.quantity = quantity;
	}
	public int GetPrice(String menu) {
		for(int i = 0; i < this.menu.length; i++) {
			if(menu == this.menu[i].name) {
				return quantity * this.menu[i].price;
			}
		}
		return 2147483647;
	}
}