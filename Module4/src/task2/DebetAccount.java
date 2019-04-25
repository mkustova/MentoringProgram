package task2;

public class DebetAccount extends BankAccount {
	@Override
	public void withdrawMoney(double amount) throws Exception {
		if (this.moneyAmount < amount) {
			this.notifyObservers("Attempt to withdraw unavailable amount.");
			throw new Exception("Insufficient funds!");
		}
		
		super.withdrawMoney(amount);
	}

	@Override
	public int calculatePaymentFeeInPercent() {
		return 1;
	}
}

