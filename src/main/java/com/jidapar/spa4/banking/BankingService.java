package com.jidapar.spa4.banking;

public interface BankingService {
    void pay(Payment payment) throws PaymentException;
}
