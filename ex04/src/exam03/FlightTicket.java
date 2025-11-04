package exam03;

public class FlightTicket {
	String name;
	String passenger;
	String seat;
	int price;
	FlightTicket(String name, String passenger, int price){
		this.name = name;
		this.passenger = passenger;
		this.price = price;
		System.out.println(">> FlightTicket 객체 생성: "+name+", 탑승객: "+passenger);
	}
	void getReservationDetails() {
		System.out.println("일반 항공권: 항공편: "+name+" | 탑승객: "+passenger+" | 좌석: "+seat+" | 기본 운임: "+price+" 원");
	}
	void reserveSeat(String seat) {
		this.seat = seat;
		System.out.println(" [예약] 일반 좌석 "+seat+" 이/가 배정되었습니다.");
	}
	void reserveSeat(String seat, String state) {
		this.seat = seat;
		System.out.println(" [예약] 일반 좌석 "+seat+" 이/가 배정되었습니다. (탑승 수속 "+state+")");
	}
}
