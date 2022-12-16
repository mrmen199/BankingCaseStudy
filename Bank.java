//Arturo Tejeda atejeda18@toromail.csudh.edu
import java.util.ArrayList;
import java.util.Optional;

public class Bank {
	private ArrayList accounts;
	public Bank() {
		accounts = new ArrayList<>();
	}
	public void addAccount(Account account) {

		accounts.add(account);
		System.out.println("Thank you, the account number is " + account.getAccountNumber());

	}
	public void listAccounts() {

		accounts.forEach(System.out::println);
	}
	public void depositAccount(int accountNumber, double amount) {

		Optional account = accounts.stream().filter(a -> ((Account) a).getAccountNumber() == accountNumber).findFirst();

		if (account.isPresent()) {

			((Account) account.get()).deposit(amount);

		}
		else {

			System.out.println("Account not found");

		}

	}


	public void withdrawAccount(int accountNumber, double amount) {

		Optional account = accounts.stream().filter(a -> ((Account) a).getAccountNumber() == accountNumber).findFirst();

		if (account.isPresent()) {

			((Account) account.get()).withdraw(amount);

		}

		else {

			System.out.println("Account not found");

		}

	}


	public void closeAccount(int accountNumber) {

		Optional account = accounts.stream().filter(a -> ((Account) a).getAccountNumber() == accountNumber).findFirst();

		if (account.isPresent()) {

			((Account) account.get()).setClosed(true);

			System.out.println("Account closed, current balance is " + ((Account) account.get()).getBalance()
					+ ", deposits are no longer possible");

		}

		else {

			System.out.println("Account not found");

		}

	}
	

}