package com.dbs.bank.service;

import java.util.List;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.bank.modal.Sender;
import com.dbs.bank.modal.transaction;
import com.dbs.bank.modal.transferStatusControl;
import com.dbs.bank.repo.senderRepo;
import com.dbs.bank.repo.transactionRepo;
import com.dbs.bank.repo.transferStatusControlRepo;

@Service
public class transactionService {
	
	
	@Autowired
	transactionRepo transactionrepo;
	
	@Autowired 
	senderRepo senderrepo;
	
	@Autowired
	transferStatusControlRepo tscr;
	
	//String yes="yes";
	
	
	public transferStatusControl transfermny(transaction t)
	{
		transferStatusControl tsc = new transferStatusControl(t.getId(), t.getMoney(),t.getMsgCode(),t.getToid(),t.getMsgCode());
		double hdfc1=69652133523248d;
		double hdfc2=45002608912874d;

		double hdfc3=42895235807723d;

		double hdfc4=27216037942722d;


		
		
		try {
			
			Sender x = senderrepo.findById(t.getId()).get();
			String s=x.isOverDraft();
			//System.out.println((s).equals("yes"));
			//System.out.println(t.getTransferType());
			//System.out.println(t.getTransferType().equals("bankTransfer"));
			//System.out.println(!((t.getToid()).toString()).equals("69652133523248"));
			
			if(t.getTransferType().equals("customerTransfer"))
			{
				if((t.getToid())!=hdfc1 && (t.getToid())!=hdfc2
						&&(t.getToid())!=hdfc3 && (t.getToid())!=hdfc4)
				{
					int charge = (t.getMoney())/400;
					if(s.equals("yes") || (t.getMoney()+charge<=x.getAccountBalance()))
					{
						tsc.setTransferStatus("success");
				
						x.setAccountBalance(x.getAccountBalance()-t.getMoney()-charge);
						senderrepo.save(x);
					}
					else
					{
						tsc.setTransferStatus("Failure");
						tsc.setMsgCode(t.getMsgCode());
					}
				}
				else
				{
					tsc.setTransferStatus("Failure");
				}
			}
			
			else if(t.getTransferType().equals("bankTransfer"))
			{
				//42895235807723
				
				//System.out.print(((t.getToid()).toString()).equals("69652133523248") || ((t.getToid()).toString()).equals("45002608912874")
					//	|| ((t.getToid()).toString()).equals("42895235807723")||((t.getToid()).toString()).equals("27216037942722"));
				System.out.println(t.getToid().toString());
				System.out.println(hdfc1);
				System.out.println((t.getToid())==hdfc1);
				if((t.getToid())==hdfc1|| (t.getToid())==hdfc2
						||(t.getToid())==hdfc3 || (t.getToid())==hdfc4)
				{
					int charge = (t.getMoney())/400;

					if(s.equals("yes") || (t.getMoney()+charge<=x.getAccountBalance()))
					{
						tsc.setTransferStatus("success");
				
						x.setAccountBalance(x.getAccountBalance()-t.getMoney()-charge);
						senderrepo.save(x);
					}
					else
					{
						tsc.setTransferStatus("Failure");
						tsc.setMsgCode(t.getMsgCode());
					}
				}
				else
				{
					tsc.setTransferStatus("Failure");
				}
			}
				tscr.save(tsc);
				return tsc;
			
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public List<transferStatusControl> getallT()
	{
		List<transferStatusControl> tsc = tscr.findAll();
		return tsc;
	}

}
