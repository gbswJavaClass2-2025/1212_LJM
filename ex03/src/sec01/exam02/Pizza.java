package sec01.exam02;

public class Pizza {
	String dough;
	int sizeInInch;
	public Pizza(String dough, int sizeInInch) {
		this.dough = dough;
		this.sizeInInch = sizeInInch;
		System.out.println(">> Pizza 객체 생성: "+dough+" " + sizeInInch+" 인치 피자");
	}
	public String describe() {
		return(sizeInInch + " 인치, " + dough + " 도우를 사용한 기본 피자입니다.");
	}
	public String bake() {
		return("오븐에서 표준 시간동안 피자를 굽습니다.");
	}
	public String bake(int time){
		return(time + "분 동안 특별히 피자를 굽습니다.");
	}
}
