package com.dbs.bank.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class transaction {
	@Id
	Double id;
	String odStatus;
	int money;
	String transferType;
	String msgCode;
	Double toid;
	
	public transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public transaction(Double id, String odStatus, int money,String transferType,String msgCode,Double toid) {
		super();
		this.id = id;
		this.odStatus = odStatus;
		this.money = money;
		this.transferType=transferType;
		this.msgCode = msgCode;
		this.toid=toid;
	}
	public Double getToid() {
		return toid;
	}
	public void setToid(Double toid) {
		this.toid = toid;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public Double getId() {
		return id;
	}
	public void setId(Double id) {
		this.id = id;
	}
	public String getOdStatus() {
		return odStatus;
	}
	public void setOdStatus(String odStatus) {
		this.odStatus = odStatus;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
	
	
	

}
