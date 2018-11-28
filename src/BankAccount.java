/**
 * Just like last time, the BankAccount class is primarily responsible
 * for depositing and withdrawing money. In the enhanced version, there
 * will be the added requirement of transfering funds between accounts.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

public class BankAccount {
	
	private long accountNumber;
	private double balance;
	private User user;
	
	/**
	 * Constructor for BankAccount class.
	 * 
	 * @param balance
	 * @param user
	 */
	
	public BankAccount(long accountNumber, double balance, User user) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.user = user;
	}
	
	/////////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////
	
	/**
	 * Retrieves the account number.
	 * 
	 * @return accountNumber
	 */
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * Retrieves the balance.
	 * 
	 * @return balance
	 */
	
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Retrieves the user.
	 * 
	 * @return user
	 */
	
	public User getUser() {
		return user;
	}
	
	/**
	 * Sets the value of accountNumber.
	 * 
	 * @param accountNumber the new account number
	 */
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Sets the value of balance.
	 * 
	 * @param balance the new balance
	 */
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Sets the value of user.
	 * 
	 * @param user the new user
	 */
	
	public void setUser(User user) {
		this.user = user;
	}
	
	/////////////////////////////////// INSTANCE METHODS ///////////////////////////////////
	
	/**
	 * Deposits money into this account.
	 * 
	 * @param amount the money to deposit
	 * @return a status code (0: invalid amount, 1: success)
	 */
	
	public int deposit(double amount) {
		if (amount <= 0) {
			return 0;
		} else {
			balance = balance + amount;
			
			return 1;
		}
	}
	
	/**
	 * Withdraws money from this account.
	 * 
	 * @param amount the money to withdraw
	 * @return a status code (0: insufficient funds, 1: invalid amount, 2: success)
	 */
	
	public int withdraw(double amount) {
		if (amount > balance) {
			return 0;
		} else if (amount <= 0) {
			return 1;
		} else {
			balance = balance - amount;
			return 2;
		}
	}
}