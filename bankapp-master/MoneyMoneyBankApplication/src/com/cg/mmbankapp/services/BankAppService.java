package com.cg.mmbankapp.services;

import com.cg.mmbankapp.dao.BankAppDao;
import com.cg.mmbankapp.dao.BankAppDaoInterface;
import com.cg.mmbankapp.pojo.Account;
import com.cg.mmbankapp.pojo.CurrentAccount;
import com.cg.mmbankapp.pojo.SavingAccount;

import java.util.Collection;
* @author Himanshu Kumar Guliya 
* BankAppService class of Service layer of MoneyMoneyBankApplication
*/
public class BankAppService {
	//Instantiate BankAppDao with reference of BankAppDaoInterface interface 
	BankAppDaoInterface accountDAO = new BankAppDao();
	Account customer = null;
	private Account accountsender;
	private Account accountreceiver;

	//------------------------Calling AddNewAccount of Dao to add object
	public void AddNewAccount(Account account) {
		accountDAO.AddNewAccount(account);
	}

	//-------------------------Search customer by their account number
	public Account searchAccount(int AccountNo) {
		for (Account bankAccount : viewAccount()) {
			if (bankAccount.getAccountNumber() == AccountNo) {
				customer = bankAccount;
				break;
			}
		}
		return customer;
	}
	
	//--------------------------View Account Details
	public Collection<Account> viewAccount() {
		return accountDAO.viewAccount().values();
	}

	//--------------------------View Customer Details
	public Collection<Account> viewCustomer() {
		return accountDAO.viewCustomer().values();
	}

	//--------------------------Fund Transfer from one account to another
	public boolean Fundtransfer(int sender, int reciever, double amount, String remarks) {
		boolean stat = false;
		accountsender = searchAccount(sender);
		accountreceiver = searchAccount(reciever);
		if (accountsender != null && accountreceiver != null && accountsender.withdraw(amount).equals("yes")) {
			stat = true;
			accountreceiver.deposit(amount);
		} else {
			stat = false;
		}
		return stat;
	}
	//----------------------------For Withdraw Money from their accounts	
	public Account withdrawl(double amount, int accNo) {
		customer = searchAccount(accNo);
		System.out.println();
		if (customer != null && customer.withdraw(amount).equals("yes")) {
			return customer;
		} else {
			return null;
		}
	}

	//----------------------------For Deposit Money into their bank accounts	
	public Account deposit(double amount, int accNo) {
		customer = searchAccount(accNo);
		if (customer == null) {
			return customer;
		} else {
			customer.deposit(amount);
			return customer;
		}
	}

	//---------------------------Return Account Number
	public int getAccountNo() {
		return Account.getAccountId();
	}

}
