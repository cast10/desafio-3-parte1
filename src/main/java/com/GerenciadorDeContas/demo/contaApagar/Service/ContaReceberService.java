package com.GerenciadorDeContas.demo.contaApagar.Service;

import com.GerenciadorDeContas.demo.contaApagar.Model.ContaReceberModel;
//import com.GerenciadorDeContas.demo.contaApagar.Model.Factory.CalcaloValorReceber;
//import com.GerenciadorDeContas.demo.contaApagar.Model.Factory.PagamentoFactory;
import com.GerenciadorDeContas.demo.contaApagar.Model.enuns.Status;
import com.GerenciadorDeContas.demo.contaApagar.Repository.ContaReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ContaReceberService {
    @Autowired
    private ContaReceberRepository contaReceberRepository;

   // @Autowired
  //  private PagamentoFactory pagamentoFactory;

    public List<ContaReceberModel> buscaCOntaReceberTodos(){
        return contaReceberRepository.findAll();
    }

    public Optional<ContaReceberModel> buscarPorIdContaReceber(Long id){
        return contaReceberRepository.findById(id);

    }
    public ContaReceberModel registrarContaReceber(ContaReceberModel contaReceberModel) {

        LocalDate dataAtual = LocalDate.now();
        if (contaReceberModel.getDataDeVencimento().isBefore(dataAtual)) {
            contaReceberModel.setStatus(Status.VENCIDA);
        } else {
            contaReceberModel.setStatus(Status.AGUARDANDO);
        }
        contaReceberModel.getContaReceberId();
        contaReceberModel.getStatus();
        contaReceberModel.getRecebimento();
        contaReceberModel.getDataDeRecebimento();
        contaReceberModel.getValorRecebido();
        contaReceberModel.getTipoRecebido();
        contaReceberModel.getDataDeVencimento();
       // contaReceberModel.getDescontoJuros();

        return contaReceberRepository.save(contaReceberModel);
    }
    public ContaReceberModel alterarContaReceber(ContaReceberModel contaReceberModel) {

        if (contaReceberModel.getStatus().equals(Status.PAGO)) {
            LocalDateTime dataAtual = LocalDateTime.now();
            contaReceberModel.setDataDeRecebimento(dataAtual);
        }

        contaReceberModel.getStatus();
        contaReceberModel.getRecebimento();
        contaReceberModel.getValorRecebido();
        contaReceberModel.getTipoRecebido();

        return contaReceberRepository.save(contaReceberModel);
    }

    public void deleteIdContaReceber(Long id) {
        contaReceberRepository.deleteById(id);
    }

}
