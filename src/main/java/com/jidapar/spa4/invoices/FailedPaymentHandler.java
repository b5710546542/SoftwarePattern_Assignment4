package com.jidapar.spa4.invoices;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class FailedPaymentHandler {

    @ServiceActivator
    public void handleFailedPayment(Exception e) {
        System.out.print(String.format("Payment failed: %s", e));
    }
}
