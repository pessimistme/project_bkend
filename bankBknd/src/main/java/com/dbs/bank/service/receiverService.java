package com.dbs.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.bank.modal.Receiver;
import com.dbs.bank.repo.receiverRepo;

@Service 
public class receiverService {
	@Autowired
	receiverRepo receiverrepo;
	
	public List<Receiver> getAllReceivers()
	{
		List<Receiver> a = receiverrepo.findAll();
		
	return a;
	}
	
	
	public Optional<Receiver> finding(String bic){
		Optional<Receiver> r = receiverrepo.findById(bic);
		
		return r;
	}

}
