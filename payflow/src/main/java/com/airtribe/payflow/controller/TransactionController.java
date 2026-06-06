package com.airtribe.payflow.controller;

import com.airtribe.payflow.Entity.Transaction;
import com.airtribe.payflow.service.TransactionService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @PostMapping("/moneytransfer")
    public ResponseEntity<?> recordTransaction(@RequestBody Transaction transaction)
    {
        try {
            Transaction response = transactionService.records(transaction);
            return ResponseEntity.ok(response);
        }catch(Exception e)
        {
            return ResponseEntity.badRequest().body("Transaction is recorded");
        }
    }
}
