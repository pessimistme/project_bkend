package com.dbs.bank.repo;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;

import com.dbs.bank.modal.transferStatusControl;

public interface transferStatusControlRepo extends JpaRepository<transferStatusControl, Double>{
	
	//List<transferStatusControl> findBytransferStatus(@Param("success") String transferStatus);

}
