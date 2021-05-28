package com.test.adi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.adi.entity.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long>{
	
	
	@Query("select a from Transaction a where type = ?1")
	List<Transaction> findByType(String type);
	
	@Query("SELECT SUM(m.amount) FROM Transaction m where parentId = ?1")
	Double sumTrx(Long parentId);

}
