package com.dbs.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.bank.repo.senderRepo;
import com.dbs.bank.modal.Sender;

@Service
public class senderService {
	@Autowired
	senderRepo senderrepo;
	
	public List<Sender> getAllSenders()
	{
		List<Sender> a = senderrepo.findAll();
		return a;
	}
	
	
	public Optional<Sender> finding(double id)
	{
		Optional<Sender> fin=senderrepo.findById(id);
		return fin;
	}

}
