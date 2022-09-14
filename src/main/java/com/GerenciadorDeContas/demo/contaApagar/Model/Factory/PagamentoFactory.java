package com.GerenciadorDeContas.demo.contaApagar.Model.Factory;

import org.springframework.stereotype.Component;

public class PagamentoFactory {

    @Component
    public class ContaFactory {

        public CalcaloValorReceber calcularValorReceber(String tipoRecebimento) {
            if (tipoRecebimento.equalsIgnoreCase("Valor com Juros")) {
                return new PagamentoComAtraso();
            } else if (tipoRecebimento.equalsIgnoreCase("Valor Com desconto")) {
                return new PagamentoAdiantado();
            } else {
                return null;
            }
        }
    }
}
