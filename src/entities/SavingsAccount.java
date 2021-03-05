package entities;

// Uma class "final" significa dizer que essa class não poderá ser herdada de jeito nenhum
public final class SavingsAccount extends Account {

	private Double interesRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interesRate) {
		super(number, holder, balance);
		this.interesRate = interesRate;
	}

	public Double getInteresRate() {
		return interesRate;
	}

	public void setInteresRate(Double interesRate) {
		this.interesRate = interesRate;
	}
	
	public void updateBalance() 
	{
		balance += balance * interesRate;
	}
	
	
	// Um método "final" significa que este método não deve ser sobreposto (@Override)
	@Override
	public final void withdraw(double amount) {
		this.balance -= amount;
	}
}
