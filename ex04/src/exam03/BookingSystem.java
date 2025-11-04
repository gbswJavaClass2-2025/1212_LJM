package exam03;

public class BookingSystem {

	public static void main(String[] args) {
		System.out.println("----- 비행기 예매 시스템 실습 시작 -----");
		FlightTicket stand = new FlightTicket("KE001", "박민준", 300000);
		PremiumTicket prem = new PremiumTicket("OZ202", "최서연", 1500000, "비즈니스", 50000);
		System.out.println("\n------------------------------------\n");
		System.out.println("[좌석 예약]");
		System.out.print("KE001 (일반):");
		stand.reserveSeat("45A");
		System.out.print("KE001 (일반):");
		stand.reserveSeat("45B", "완료");
		System.out.println();
		System.out.print("OZ202 (프리미엄):");
		prem.reserveSeat("01C");
		System.out.print("OZ202 (프리미엄):");
		prem.reserveSeat("01D", "미완료");
		System.out.print("OZ202 (프리미엄):");
		prem.reserveSeat("비지니스", "02A", "채식");
		System.out.println("\n------------------------------------\n");
		System.out.println("[예약 상세 정보]");
		stand.getReservationDetails();
		prem.getReservationDetails();
		System.out.println("\n----- 실습 종료 -----");
	}

}
