package io.motionlab.repository;

import org.springframework.data.repository.CrudRepository;

import io.motionlab.model.Transaction;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

	// public List<Transaction> findAll();
}
