package entity;

public class Qs2_Account {
	private String id;
	private String name;
	private int balance;

	public Qs2_Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		return this.balance += amount;
	}

	public int debit(int amount) {
		return this.balance -= amount;
	}

	public void tranfer(Qs2_Account acc, int amount) {
		this.balance -= amount;
		acc.balance += amount;
	}

}
