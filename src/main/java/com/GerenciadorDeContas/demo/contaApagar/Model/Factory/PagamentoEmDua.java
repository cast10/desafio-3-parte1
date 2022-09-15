package com.GerenciadorDeContas.demo.contaApagar.Model.Factory;

import com.GerenciadorDeContas.demo.contaApagar.Model.ContaReceberModel;

import java.math.BigDecimal;

public class PagamentoEmDua implements CalcaloValorReceber {

    @Override
    public BigDecimal calcula(ContaReceberModel contaReceberModel) {
        return contaReceberModel.getValorRecebido();
    }
}
