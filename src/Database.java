import java.io.*;
/**
 * This class will serve as the intermediary between our ATM program and
 * the database of BankAccounts. It'll be responsible for fetching accounts
 * when users try to login, as well as updating those accounts after any
 * changes are made.
 */

public class Database {
	
	public BankAccount getAccount(long accountNumber) throws Exception {
		BankAccount account = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader("accounts-db.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				long acctNum = Long.parseLong(line.substring(0,9));
				
				if (acctNum == accountNumber && line.charAt(148) == 'Y') {
					int pin = Integer.parseInt(line.substring(9, 13));
					double balance = Double.parseDouble(line.substring(13, 28));
					String lname = line.substring(28, 48).trim();
					String fname = line.substring(48, 63).trim();
					String dob = line.substring(63, 71);
					long phone = Long.parseLong(line.substring(71, 81));
					String address = line.substring(81, 111).trim();
					String city = line.substring(111, 141).trim();
					String state = line.substring(141, 143);
					String postalcode = line.substring(143, 148);
					
					account = new BankAccount(acctNum, balance, new User(pin, fname, lname, dob, phone, address, city, state, postalcode));
					break;
				}
			}
		}
				
		return account;
	}
	
	
	
	
	/** public BankAccount AccountCreation(File file) throws IOException{
		try(BufferedReader br = new BufferedReader("accounts-db.txt") {
			String line;
			
			while((line = br.readLine()) != null) {
				String account = line.substring(0,8);
			}
		}
		
		return bankAccount;
	} **/

	
}