package com.test.adi.dto;

import java.util.ArrayList;
import java.util.List;

import com.test.adi.entity.Transaction;

public class TransactionDto {
	
	String Message = "SUKSES";
	List<Transaction> trx = new ArrayList<>();
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public List<Transaction> getTrx() {
		return trx;
	}
	public void setTrx(List<Transaction> trx) {
		this.trx = trx;
	}
	@Override
	public String toString() {
		return "TransactionDto [Message=" + Message + ", trx=" + trx + "]";
	}
	
	
	

}
