package exam03;

public class PremiumTicket extends FlightTicket{
	String className;
	int rounge;
	PremiumTicket(String name, String passenger, int price, String className, int rounge){
		super(name, passenger, price);
		this.className = className;
		this.rounge = rounge;
	}
	@Override
	void getReservationDetails() {
		System.out.println("프리미엄 항공권: 항공편: "+name+" | 탑승객: "+passenger+" | 좌석: "+seat+"+ | 기본 운임: "+price+" 원 | 클래스: **"+className+"** | 라운지 이용료: "+rounge	+" 원");
	}
	void reserveSeat(String className, String seat, String meal){
		this.className = className;
		this.seat = seat;
		System.out.println(" [예약] "+className+" 좌석 "+seat+" 이/가 배정되었습니다. (요청: "+meal+" 기내식요청)");
	}
}
