package Day13EncapsulationSettersGettersStatickeywords;

public class AccountEncapsulationMain {

	public static void main(String[] args) {
		AccountEncapsulation e=new AccountEncapsulation();
		e.setaccount_number(102398764);
		e.setName("jhansi");
		e.setBalance(1000);
		
		System.out.println("Account Number : "+e.getaccount_number());
		System.out.println("Name : "+e.getName());
		System.out.println("Balance : "+e.getBalance());

	}

}
