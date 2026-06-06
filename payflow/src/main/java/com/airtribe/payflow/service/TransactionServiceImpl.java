package com.airtribe.payflow.service;

import com.airtribe.payflow.Entity.Transaction;
import com.airtribe.payflow.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    @Override
   public Transaction records(Transaction transaction){
        return transactionRepository.save(transaction);
    }
}
