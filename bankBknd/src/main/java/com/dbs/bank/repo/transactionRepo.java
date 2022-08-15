package com.dbs.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.bank.modal.transaction;

public interface transactionRepo extends JpaRepository<transaction, Double> {

}
