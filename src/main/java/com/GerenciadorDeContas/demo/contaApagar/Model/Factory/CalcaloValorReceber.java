package com.GerenciadorDeContas.demo.contaApagar.Model.Factory;

import com.GerenciadorDeContas.demo.contaApagar.Model.ContaReceberModel;

import java.math.BigDecimal;

public interface CalcaloValorReceber {
    BigDecimal calcula (ContaReceberModel contaReceberModel);
}
