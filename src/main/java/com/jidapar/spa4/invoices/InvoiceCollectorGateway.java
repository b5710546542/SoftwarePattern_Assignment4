package com.jidapar.spa4.invoices;

import java.util.Collection;

public interface InvoiceCollectorGateway {
    void collectInvoices(Collection<Invoice> invoices);
}
