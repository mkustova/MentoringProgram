package task2;

public class CreditAccount extends BankAccount {

	private double creditLine = 50000;

	@Override
	public void withdrawMoney(double amount) throws Exception {
		if (this.moneyAmount + creditLine < amount) {
			this.notifyObservers("Attempt to exceed credit line limit.");
			throw new Exception("Insufficient funds!");
		}

		super.withdrawMoney(amount);
	}

	@Override
	public int calculatePaymentFeeInPercent() {
		return this.moneyAmount > 0 ? 1 : 5;
	}

}
