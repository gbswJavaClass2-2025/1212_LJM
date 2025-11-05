package exam02;

public class BankPractice {

	public static void main(String[] args) {
		System.out.println("----- 은행 계좌 시스템 실습 시작 -----");
		System.out.println("\n------------------------------------\n");
		System.out.println("[정보 출력]");
		BankAccount stand = new BankAccount("100-01-123456", "김철수");
		SavingsAccount save = new SavingsAccount("200-02-789012", "이영희", 2.5);
		System.out.println("\n------------------------------------\n");
		System.out.println("[입금 기능]\n");
		System.out.println("--- 김철수님 일반 계좌 ---");
		stand.deposit(100000);
		stand.deposit(50000, "월급");
		System.out.println("\n--- 이영희님 저축 계좌 ---");
		save.deposit();
		save.deposit(20000);
		save.deposit(15000, "용돈");
		System.out.println("\n----- 실습 종료 -----");
	}

}
