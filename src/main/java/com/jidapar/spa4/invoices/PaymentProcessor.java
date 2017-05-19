package com.jidapar.spa4.invoices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.jidapar.spa4.banking.BankingService;
import com.jidapar.spa4.banking.Payment;
import com.jidapar.spa4.banking.PaymentException;

@Component
public class PaymentProcessor {

    @Autowired
    BankingService bankingService;

    @ServiceActivator
    public void processPayment(Payment payment) throws PaymentException {
        bankingService.pay(payment);
    }
}
