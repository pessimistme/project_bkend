package com.dbs.bank.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Sender {

 @Id
 Double customerId;
 String customerName;
 int accountBalance;
 String overDraft;
 //String BIC;
 //String bankName;
	public Sender() {
		super();
		// TODO Auto-generated constructor stub
	}
 
 public Sender(Double customerId, String customerName, int accountBalance, String overDraft) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
		this.overDraft = overDraft;
		//BIC = bIC;
		//this.bankName = bankName;
	}

	 
public Double getCustomerId() {
	return customerId;
}
public void setCustomerId(Double customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(int accountBalance) {
	this.accountBalance = accountBalance;
}
public String isOverDraft() {
	return overDraft;
}
public void setOverDraft(String overDraft) {
	this.overDraft = overDraft;
}
//public String getBIC() {
	//return BIC;
	//}
//public void setBIC(String bIC) {
//	BIC = bIC;
//}
//public String getBankName() {
	//return bankName;
//}
//}
//public void setBankName(String bankName) {
//	this.bankName = bankName;
//}

}
