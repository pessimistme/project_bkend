package com.dbs.bank.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class transferStatusControl {
	@Id
	Double id;
	int mnytransfer;
	String transferStatus;
	Double toId;
	String msgCode;
	
	public transferStatusControl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public transferStatusControl(Double id, int mnytransfer, String transferStatus, Double toId, String msgCode) {
		super();
		this.id = id;
		this.mnytransfer = mnytransfer;
		this.transferStatus = transferStatus;
		this.toId = toId;
		this.msgCode = msgCode;
	}
	public Double getToId() {
		return toId;
	}
	public void setToId(Double toId) {
		this.toId = toId;
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
	public int getMnytransfer() {
		return mnytransfer;
	}
	public void setMnytransfer(int mnytransfer) {
		this.mnytransfer = mnytransfer;
	}
	public String getTransferStatus() {
		return transferStatus;
	}
	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}
	
	
	
	
	

}
