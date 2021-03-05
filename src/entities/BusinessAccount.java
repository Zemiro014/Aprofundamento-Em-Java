package entities;

public class BusinessAccount extends Account 
{
	private double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
		super(number, holder, balance);
		setLoanLimit(loanLimit);
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit)
		balance += amount - 10.0;
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount); // Usando "super" para reutizar o c�digo do m�todo "withdraw" da "SuperClass" "Account"
		balance -= 2.0;
	}
}
