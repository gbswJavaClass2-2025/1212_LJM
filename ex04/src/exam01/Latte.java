package exam01;

public class Latte extends Coffee{
	String foamType;
	int milkCharge = 500;
	Latte(String name, String size, int basePrice, String foamType){
		super(name,size, basePrice);
		this.foamType = foamType;
	}
	@Override
	void getBeverageInfo() {
		System.out.println(name + " 정보: 종류: "+name+" | 사이즈: "+size+" | 기본 가격: "+basePrice+" 원 | 거품 종류:**"+foamType+"**\n");
	}
	void ccalculatePrice(int shot) {
		System.out.println(name+" 최종 가격 (샷 추가): (우유 비용 500 원 포함 (+샷 추가 "+1000*shot+" 원)) "+((int)basePrice+(int)1500)+" 원");
	}
}
