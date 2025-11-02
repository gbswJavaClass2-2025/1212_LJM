package exam03;

public class CheesePizza {
	public String name = "Cheese Pizza";
	public int[] prices = {100,200,300};
	public String size;
	
	public CheesePizza(String size){
		this.size = size;
	}
	public void cook() {
		System.out.println(name + size + "을 조리합니다.");
		System.out.println(name + size + "이 완료되었습니다.");
	}
	public void serve() {
		if(size == "S") {
			System.out.println(name + size + "를 드립니다." + prices[0] + "입니다.");
		}
		else if(size == "M") {
			System.out.println(name + size + "를 드립니다." + prices[1] + "입니다.");
		}
		else {
			System.out.println(name + size + "를 드립니다." + prices[2] + "입니다.");
		}
	}
}
