package task2;

public class BankAccountObserver implements IObserver {
	@Override
	public void update(String message) {
		System.out.println(message);
	}
}