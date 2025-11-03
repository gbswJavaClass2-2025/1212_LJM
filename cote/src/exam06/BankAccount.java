package exam06;

public class BankAccount {
	private String name;
	private String accountNumber;
	private int balance;
	public BankAccount(String name,String accountNumber){
		this.name = name;
		this.accountNumber = accountNumber;
		System.out.println("BankAccount 객체 생성");
	}
	public BankAccount(String name,String accountNumber,int balance){
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
	public void SetName(String name) {
		this.name = name;
	}
	public String GetName() {
		return this.name;
	}
	public void SetccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String GetaccountNumber() {
		return this.accountNumber;
	}
	public void SetBalance(int balance) {
		this.balance = balance;
	}
	public int GetBalance() {
		return balance;
	}
}
