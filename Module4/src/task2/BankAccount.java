package task2;

public abstract class BankAccount extends Observable {
	protected double moneyAmount = 0;

	public void addMoney(double amount) {
		this.moneyAmount += amount;
		this.notifyObservers("New balance: " + this.moneyAmount);
	}

	public double getBalance() {
		return this.moneyAmount;
	}

	public void withdrawMoney(double amount) throws Exception {
		this.moneyAmount -= amount * (1 + (double) calculatePaymentFeeInPercent() / 100);
		this.notifyObservers("New balance: " + this.moneyAmount);
	}

	public abstract int calculatePaymentFeeInPercent();
}
