package com.payment.paymentservice.service;

import com.payment.paymentservice.entity.Payment;
import com.payment.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    public Payment savePayment(Payment payment){
        payment.setTransactionId(UUID.randomUUID().toString());
        return repository.save(payment);
    }
}
