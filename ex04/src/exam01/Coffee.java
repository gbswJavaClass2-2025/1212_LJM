package exam01;

public class Coffee {
	String name;
	String size;
	int basePrice;
	Coffee(String name, String size, int basePrice){
		this.name = name;
		this.size = size;
		this.basePrice = basePrice;
		System.out.println(">> Coffee 객체 생성: "+size+" "+name);
	}
	void ccalculatePrice() {
		System.out.println(name + " 최종 가격 (기본):" + basePrice + "원");
	}
	void ccalculatePrice(double disCount) {
		System.out.println("아메리카노 최종 가격 (할인): (할인율 " + disCount + "% 적용)"+basePrice*((int)100-disCount)/100+"원");
	}
	void getBeverageInfo() {
		System.out.println(name + " 정보: 종류: "+name+" | 사이즈: "+size+" | 기본 가격: "+basePrice+" 원");
	}
}
