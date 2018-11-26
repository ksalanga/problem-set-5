import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * This class will serve as the intermediary between our ATM program and
 * the database of BankAccounts. It'll be responsible for fetching accounts
 * when users try to login, as well as updating those accounts after any
 * changes are made.
 */

public class Database {
	
	private File file;
	
	public Database(File file) {
		this.file = file;
	}
	
	public BankAccount AccountCreation(File file) throws IOException{
		try(BufferedReader br = new BufferedReader(new FileReader("accounts-db.txt"))) {
			String line;
			
			while((line = br.readLine()) != null) {
				String acount = line.substring(0,10);
			}
		}
		
		return BankAccount;
	}
	
}