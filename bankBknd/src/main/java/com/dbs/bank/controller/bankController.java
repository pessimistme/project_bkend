package com.dbs.bank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.bank.modal.Receiver;
import com.dbs.bank.modal.Sender;
import com.dbs.bank.modal.transaction;
import com.dbs.bank.modal.transferStatusControl;
import com.dbs.bank.service.receiverService;
import com.dbs.bank.service.senderService;
import com.dbs.bank.service.transactionService;




@RestController
@CrossOrigin("*")
public class bankController {
	
	@Autowired
	senderService senderservice;
	
	@Autowired
	receiverService receiverservice;
	
	@Autowired
	transactionService transactionservice;
	
	//@RequestMapping("/all/senders")
	 //public List<Sender> showAllSenders()
	 //{
	//	 return senderservice.getAllSenders();
	 //}
	
	@RequestMapping("/findS")
	public Optional<Sender> findSender(@RequestParam double id){
		Optional<Sender> s = senderservice.finding(id);
		return s;
	}
	
	//@RequestMapping("/all/receivers")
	//public List<Receiver> showAllReceivers() 
	//{
	//	return receiverservice.getAllReceivers();
	//}
	
	@RequestMapping("/findR")
	public Optional<Receiver> findReceiver(@RequestParam String bic){
		
		Optional<Receiver> r = receiverservice.finding(bic);
		return r;
		
	}
	
	@PostMapping("/updatemny")
	public transferStatusControl deductmny(@RequestBody transaction t ) {
		transferStatusControl tcs = transactionservice.transfermny(t);
		
		return tcs;
		
	}
	
	@RequestMapping("/paymenthist")
	public List<transferStatusControl> getallPayments(){
		return transactionservice.getallT();
	}
	
	//@RequestMapping("/transactionhist")
	//public List<>
	
}
