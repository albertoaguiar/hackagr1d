package com.hackagr1d.team4.services;

import com.hackagr1d.team4.domain.model.Cotacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {


    private static final Logger LOGGER = LoggerFactory.getLogger(PurchaseService.class);

    public void comprar(Cotacao compra) {
        LOGGER.info("[Travelace - Seguro Viagens] Confirmando compra - Request["+compra +"]");
        LOGGER.info("[Travelace - Seguro Viagens] Compra confirmada com sucesso.");
    }
}
