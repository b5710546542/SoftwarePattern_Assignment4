package com.jidapar.spa4.banking;

import com.jidapar.spa4.invoices.Invoice;

public interface PaymentCreator {
    Payment createPayment(Invoice invoice) throws PaymentException;
}
