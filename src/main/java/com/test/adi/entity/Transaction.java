package com.test.adi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	private Long transactionId;
	private double amount;
	private String type;
	private Long parentId;
	
	public Transaction() {
		super();
	}

	public Transaction(Long transactionId, double amount, String type, Long parentId) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.type = type;
		this.parentId = parentId;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	
	

	
}
