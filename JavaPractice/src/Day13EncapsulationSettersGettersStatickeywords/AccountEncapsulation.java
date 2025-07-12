package Day13EncapsulationSettersGettersStatickeywords;

public class AccountEncapsulation {
      private int account_number;
      private String name;
      private int balance;
      
    public void setaccount_number(int account_number) {
    	  this.account_number=account_number;
      }
      
    public int getaccount_number() {
    	  return account_number;
      }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
