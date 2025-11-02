package exam06;

public class BankAccount {
	private String name;
	private String accountNumber;
	private int balance;
	public BankAccount(String name,String accounNumber){
		this.name = name;
		this.accountNumber = accountNumber;
		System.out.println("BankAccount 객체 생성");
	}
	public BankAccount(String name,String accounNumber,int balance){
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		System.out.println("BankAccount 객체 생성");
	}
	public void withdrawal(int amount) {
		if(balance > amount) {
			System.out.println(amount + " 출금하고 출금액 출력");
			balance -= amount;
		}
		else {
			System.out.println("잔고보다 큰 금액(" + amount +") 출금 시도해서 출금액 출력");
		}
	}
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + " 입금하고 잔고 출력");
	}
}
