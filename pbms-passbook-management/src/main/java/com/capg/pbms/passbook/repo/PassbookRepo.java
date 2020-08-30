package com.capg.pbms.passbook.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.passbook.model.Transaction;

//The passbookRepo Interface for accessing 
public interface PassbookRepo extends JpaRepository<Transaction, Long>{

}
