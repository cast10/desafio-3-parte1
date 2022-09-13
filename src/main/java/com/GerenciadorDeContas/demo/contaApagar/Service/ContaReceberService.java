package com.GerenciadorDeContas.demo.contaApagar.Service;

import com.GerenciadorDeContas.demo.contaApagar.Model.ContaReceberModel;
import com.GerenciadorDeContas.demo.contaApagar.Repository.ContaReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaReceberService {
    @Autowired
    private ContaReceberRepository contaReceberRepository;

    public List<ContaReceberModel> buscaCOntaReceberTodos(){
        return contaReceberRepository.findAll();
    }

    public Optional<ContaReceberModel> buscarPorIdContaReceber(Long id){
        return contaReceberRepository.findById(id);

    }
    public ContaReceberModel registrarContaReceber(ContaReceberModel contaReceberModel) {

        contaReceberModel.getContaReceberId();
        contaReceberModel.getStatus();
        contaReceberModel.getRecebimento();
        contaReceberModel.getDataDeRecebimento();
        contaReceberModel.getValorRecebido();
        contaReceberModel.getTipoRecebido();
        contaReceberModel.getDataDeVencimento();

        return contaReceberRepository.save(contaReceberModel);
    }
    public ContaReceberModel alterarContaReceber(ContaReceberModel contaReceberModel) {

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
