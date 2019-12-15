package com.hackagr1d.team4.services;

import com.hackagr1d.team4.rest.vo.PaymentRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentService.class);

    private PurchaseService purchaseService;

    @Autowired
    public PaymentService(final PurchaseService purchaseService)
    {
        this.purchaseService = purchaseService;
    }

    public void pagar(PaymentRequest request) {
        LOGGER.info("[Matera - Meios de Pagamento - Server] Efetuando Pagamento - Request["+request +"]");
        LOGGER.info("[Matera - Meios de Pagamento - Server] Pagamento efetuado com sucesso");

        purchaseService.comprar(request.getCompra());

    }
}
