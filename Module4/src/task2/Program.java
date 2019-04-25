package task2;

public class Program {

	public static void main(String[] args) {

		BankAccountObserver observer = new BankAccountObserver();

		DebetAccount debetAcc = new DebetAccount();
		debetAcc.addObserver(observer);
		CreditAccount creditAcc = new CreditAccount();
		creditAcc.addObserver(observer);

		debetAcc.addMoney(15000);
		try {
			debetAcc.withdrawMoney(10000);

			debetAcc.withdrawMoney(10000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			creditAcc.withdrawMoney(15000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

