package test.two;

public class CustomerExample {

	public static void main(String[] args) {
		Customer cust1 = new Customer("Lee", "010-1111-1111");
		Customer cust2 = new Customer("Park", "010-1111-1112", 100);
		
		System.out.println("cust1:"+cust1.updatePoint(50));
		System.out.println("cust2:"+cust2.updatePoint(-50));
		System.out.println("cust2:"+cust2.setPoint(200));
	}

}
