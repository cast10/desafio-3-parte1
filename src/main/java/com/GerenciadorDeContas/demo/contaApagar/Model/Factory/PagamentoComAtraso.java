package com.GerenciadorDeContas.demo.contaApagar.Model.Factory;

import com.GerenciadorDeContas.demo.contaApagar.Model.ContaReceberModel;

import java.math.BigDecimal;

public class PagamentoComAtraso implements CalcaloValorReceber {
    @Override
    public BigDecimal calcula(ContaReceberModel contaReceberModel) {
        BigDecimal juros = contaReceberModel.getDescontoJuros().multiply(new BigDecimal("0.035"));
        return contaReceberModel.getValorRecebido().add(juros);
    }
}
