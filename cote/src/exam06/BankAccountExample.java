package exam06;

public class BankAccountExample {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("", "", 0);
		account.deposit(10000);
		account.withdrawal(5000);
		account.withdrawal(6000);
	}

}
