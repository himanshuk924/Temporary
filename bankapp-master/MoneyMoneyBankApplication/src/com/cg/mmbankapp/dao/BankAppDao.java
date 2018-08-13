package com.cg.mmbankapp.dao;
import java.util.HashMap;
import java.util.Map;
import com.cg.mmbankapp.pojo.Account;
import com.cg.mmbankapp.pojo.CurrentAccount;
import com.cg.mmbankapp.pojo.SavingAccount;
/**
 * @author Himanshu Kumar Guliya 
 * BankAppDao class of dao layer of MoneyMoneyBankApplication
 */
public class BankAppDao implements BankAppDaoInterface {
	
	static Map<Integer,Account>bankAcc=new HashMap<Integer,Account>();
	
	@Override
	//--------------------------------------Add new account into bankAcc Map
	public void AddNewAccount(Account account) {
		bankAcc.put(account.getAccountNumber(), account);
	}
	
	@Override
	//--------------------------------------Return hash map bankAcc
	public  Map<Integer,Account> searchAccount() {
		return bankAcc;
	}
	
	@Override
	//--------------------------------------Return hash map bankAcc
	public  Map<Integer,Account> viewAccount() {
		return bankAcc;
	}
	
	@Override
	//--------------------------------------Return hash map bankAcc
	public Map<Integer,Account> viewCustomer() {
		return bankAcc;
	}
}
