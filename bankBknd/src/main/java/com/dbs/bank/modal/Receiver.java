package com.dbs.bank.modal;




import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Receiver {
	@Id
	String bic;
	String bankName;
public Receiver() {
	super();
	// TODO Auto-generated constructor stub
}
public Receiver(String bic, String bankName) {
	super();
	this.bic = bic;
	this.bankName = bankName;
}
public String getBic() {
	return bic;
}
public void setBic(String bic) {
	this.bic = bic;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
 
}