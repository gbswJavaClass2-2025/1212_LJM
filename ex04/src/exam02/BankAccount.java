package exam02;

public class BankAccount {
	String id;
	String name;
	int balance = 0;
	BankAccount(String id, String name){
		this.id = id;
		this.name = name;
		System.out.println(">> BankAccount 객체 생성: "+name+"님 계좌("+id+") 개설.");
	}
	void getAccountInfo() {
		System.out.println("일반 계좌 정보: 계좌 번호: "+id+" | 예금주: "+name+" | 잔액: "+balance+" 원");
	}
	void deposit(int money) {
		balance += money;
		System.out.println("[입금] 금액: "+money+" 원 | 현재 잔액: "+balance+" 원");
	}
	void deposit(int money, String from) {
		balance += money;
		System.out.println("[입금] 금액: "+money+" 원 ("+from+"으로부터) | 현재 잔액: "+balance+" 원");
	}
}
