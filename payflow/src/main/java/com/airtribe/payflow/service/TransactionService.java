package com.airtribe.payflow.service;

import com.airtribe.payflow.Entity.Transaction;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {
    Transaction records(Transaction transaction);
}
