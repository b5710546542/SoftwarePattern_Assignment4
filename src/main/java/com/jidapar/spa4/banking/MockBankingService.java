package com.jidapar.spa4.banking;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MockBankingService implements BankingService {

    private final Random rand = new Random();

    @Override
    public void pay(Payment payment) throws PaymentException {
        if (rand.nextDouble() > 0.9) {
            throw new PaymentException("Banking services are offline, try again later!");
        }
        System.out.println(String.format("Processing payment %s", payment));
    }
}
