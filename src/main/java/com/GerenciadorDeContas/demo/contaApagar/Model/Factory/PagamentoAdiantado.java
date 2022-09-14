package com.GerenciadorDeContas.demo.contaApagar.Model.Factory;

import com.GerenciadorDeContas.demo.contaApagar.Model.ContaReceberModel;

import java.math.BigDecimal;

public class PagamentoAdiantado implements CalcaloValorReceber {

    @Override
    public BigDecimal calcula (ContaReceberModel contaReceberModel){
        BigDecimal desconto = contaReceberModel.getDescontoJuros().multiply(new BigDecimal("0.05"));
        return contaReceberModel.getValorRecebido().subtract(desconto);
    }


}
