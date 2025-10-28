package sec01.exam02;

public class ToppingPizza extends Pizza{
	String Topping;
	public ToppingPizza(String dough, int sizeInInch, String Topping) {
		super(dough,sizeInInch);
		this.Topping = Topping;
	}
	@Override
	public String describe() {
		return(sizeInInch + " 인치, " + dough + " 도우를 사용한 기본 피자입니다. 주요 토핑은 **" + Topping + "** 입니다.");
	}
	public String bake(int degree, int time) {
		return(degree + " 도에서 " + time + "분 동안 **" + Topping + "** 피자를 완벽하게 굽습니다.");
	}
}
