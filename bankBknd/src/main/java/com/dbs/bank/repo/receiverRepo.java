package com.dbs.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.bank.modal.Receiver;

public interface receiverRepo extends JpaRepository<Receiver,String>{

}
