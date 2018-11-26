import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
	
	public static void main(String[] args) throws Exception{
		
		try(BufferedReader br = new BufferedReader(new FileReader("accounts-db.txt"))) {
			String line;
			
			while((line = br.readLine()) != null) {
				System.out.print(line.charAt(0));
			}
	}
		
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
}