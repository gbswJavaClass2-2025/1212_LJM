package exam02;

public class SavingsAccount extends BankAccount{
	double rate;
	SavingsAccount(String id, String name, double rate){
		super(id, name);
		this.rate = rate;
	}
	@Override
	void getAccountInfo() {
		System.out.println("저축 계좌 정보: 계좌 번호: "+id+" | 예금주: "+name+" | 잔액: 0 원 | 이율: "+rate+"% (저축계좌)");
	}
	void deposit() {
		balance += 50000;
		System.out.println("[입금] 금액: 50,000 원 (초기 납입금) | 현재 잔액: "+balance+" 원");
	}
}
