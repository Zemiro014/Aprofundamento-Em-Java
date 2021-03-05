package entities;


// Class "abstract" são "classes" que não permitem serem instanciadas, mas permite instanciar as "subclasses" desta mesma "class"
public abstract class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {}

	public Account(Integer number, String holder, Double balance) {
		setNumber(number);
		setHolder(holder);
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
}
