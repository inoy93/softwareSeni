package com.test.adi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.adi.dto.TransactionDto;
import com.test.adi.entity.Transaction;
import com.test.adi.repositories.TransactionRepo;

@RestController
@RequestMapping("/transactionservice/transaction")
public class TransactionController {
	
	
	@Autowired
	private TransactionRepo transactionRepo;

	@GetMapping("/byId/{trxId}")
	public TransactionDto getTrx(@PathVariable long trxId) {
		TransactionDto result = new TransactionDto();
		Optional<Transaction> transaction = transactionRepo.findById(trxId);
		if (transaction.isPresent()) {
			List<Transaction> listTrx = new ArrayList<>();
			listTrx.add(transaction.get());
			result.setTrx(listTrx);
		}else {
			result.setMessage("Transaction id "+trxId+" not found..");
		}
		return result;
	}
	
	@GetMapping("/{type}")
	public TransactionDto getListTrxByType(@PathVariable String type) {
		TransactionDto result = new TransactionDto();
		List<Transaction> transaction = transactionRepo.findByType(type);
		if (!transaction.isEmpty()) {
			result.setTrx(transaction);
		}else {
			result.setMessage("Transaction type "+type+" not found..");
		}
		return result;
	}
	
	@GetMapping("/sum/{parentId}")
	public Double sumTrx(@PathVariable long parentId) {
		Double sum = transactionRepo.sumTrx(parentId);
		return sum;
	}
	
	
	@PutMapping("/save")
	public Transaction save(@RequestBody Transaction transaction) throws Exception {
		Transaction trx = transactionRepo.save(transaction);
		return trx;
	}
	

}
