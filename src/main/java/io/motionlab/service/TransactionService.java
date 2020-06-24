package io.motionlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import io.motionlab.model.Transaction;
import io.motionlab.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	public List<Transaction> getAllTransactions() {
		
		List<Transaction> transactions = new ArrayList<>();
		transactionRepository
				    .findAll().forEach(transactions::add);
		return transactions;
	}
	
	public Transaction getTransaction(long id) {
		return transactionRepository.findById(id)
				 .orElse(null);
	}
	
	public void addTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
	}
	
	public void updateTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
	}
	
	public void deleteTransaction(long id) {
		transactionRepository.deleteById(id);
	}
}
