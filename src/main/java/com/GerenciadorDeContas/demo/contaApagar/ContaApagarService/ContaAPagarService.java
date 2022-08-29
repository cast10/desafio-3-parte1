package com.GerenciadorDeContas.demo.contaApagar.ContaApagarService;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.enuns.Status;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.ContaAPagarModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarRepository.ContaAPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class ContaAPagarService {

    @Autowired
    private ContaAPagarRepository contaAPagarRepository;

    public List<ContaAPagarModel> buscaTodos() {
        return contaAPagarRepository.findAll();
    }

    public Optional<ContaAPagarModel> buscarId(Long id) {
        return contaAPagarRepository.findById(id);
    }

    public ContaAPagarModel registrarConta(ContaAPagarModel contaAPagarModel) {

        LocalDate dataAtual = LocalDate.now();
        if (contaAPagarModel.getDataDeVencimento().isBefore(dataAtual)) {
            contaAPagarModel.setStatus(Status.VENCIDA);
        } else {
            contaAPagarModel.setStatus(Status.AGUARDANDO);
        }

        contaAPagarModel.getId();
        contaAPagarModel.getNome();
        contaAPagarModel.getValor();
        contaAPagarModel.getTipo();
        contaAPagarModel.getDataDeVencimento();

        return contaAPagarRepository.save(contaAPagarModel);
    }
    public ContaAPagarModel alterarStatusConta(ContaAPagarModel contaAPagarModel) {

      if (contaAPagarModel.getStatus().equals(Status.PAGO)) {
          LocalDateTime dataAtual = LocalDateTime.now();
        contaAPagarModel.setDataDePagamento(dataAtual);
     }

        contaAPagarModel.getStatus();
        contaAPagarModel.getValor();
        contaAPagarModel.getDataDePagamento();
        contaAPagarModel.getTipo();

        return contaAPagarRepository.save(contaAPagarModel);
    }

    public void deleteId(Long id) {
        contaAPagarRepository.deleteById(id);
    }
}