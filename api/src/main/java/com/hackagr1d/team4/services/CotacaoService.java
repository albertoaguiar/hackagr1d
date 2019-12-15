package com.hackagr1d.team4.services;

import com.hackagr1d.team4.domain.model.Cotacao;

import com.hackagr1d.team4.rest.vo.CotacaoRequest;
import com.hackagr1d.team4.rest.vo.CotacaoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CotacaoService {

    @Autowired
    public CotacaoService(){
    }

    public CotacaoResponse getCotacoes(CotacaoRequest request) {

        CotacaoResponse response =new CotacaoResponse();
        List<Cotacao> cotacoes = new ArrayList<>();
        {
            Cotacao cotacao = new Cotacao();
            cotacao.setDescricao("Seguro de Viagem completo plus" +
                    "Despesas Médicas, Hospitalares e/ou Odontológicas - DMHO - R$ 10.000,00\n" +
                    "Morte acidental - R$ 80.000,00\n" +
                    "Invalidez Permanente Total ou Parcial por Acidente - R$ 80.000,00");
            cotacao.setDataSaida("20-12-2019");
            cotacao.setDataRetorno("31-12-2019");
            cotacao.setOperadora("Travel Ace");
            cotacao.setFormaPagamento("Cartão de Crédito");
            cotacao.setValorCompra("R$ 80,00");
            cotacao.setImgUrl("https://www.multiseguroviagem.com.br/www/img/operadoras/hq/travelace.png");
            cotacoes.add(cotacao);
        }

        {
            Cotacao cotacao = new Cotacao();
            cotacao.setDescricao("Seguro de Viagem completo Supreme" +
                    "Despesas Médicas, Hospitalares e/ou Odontológicas - DMHO - R$ 20.000,00\n" +
                    "Morte acidental - R$ 100.000,00\n" +
                    "Invalidez Permanente Total ou Parcial por Acidente - R$ 100.000,00");
            cotacao.setDataSaida("20-12-2019");
            cotacao.setDataRetorno("31-12-2019");
            cotacao.setOperadora("Porto Seguro");
            cotacao.setFormaPagamento("Cartão de Crédito");
            cotacao.setValorCompra("R$ 120,00");
            cotacao.setImgUrl("https://www.comparaonline.com.br/blog/wp-content/uploads/2015/10/logo-porto-seguro-1280x720.png");
            cotacoes.add(cotacao);
        }


        response.setCotacoes(cotacoes);


        return response;
    }
}
