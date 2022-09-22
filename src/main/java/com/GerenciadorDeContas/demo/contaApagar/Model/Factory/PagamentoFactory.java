package com.GerenciadorDeContas.demo.contaApagar.Model.Factory;

import com.GerenciadorDeContas.demo.contaApagar.Model.ContaReceberModel;
import com.GerenciadorDeContas.demo.contaApagar.Model.enuns.RecebimentoAlugueis;

public class PagamentoFactory {

    public CalcaloValorReceber calcularValorReceber(ContaReceberModel contaReceberModel) {
        if (contaReceberModel.getRecebimentoAlugueis().equals(RecebimentoAlugueis.ADIANTADO)) {
            return new PagamentoAdiantado();
        } else if (contaReceberModel.getRecebimentoAlugueis().equals(RecebimentoAlugueis.EM_DIA)) {
            return new PagamentoEmDua();}
        else if (contaReceberModel.getRecebimentoAlugueis().equals(RecebimentoAlugueis.EM_ATRASO)) {
            return new PagamentoComAtraso();}
        else {
            return null;}
    }
}

