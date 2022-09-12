package com.GerenciadorDeContas.demo.contaApagar.ContaApagarService;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.EnderecoModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarRepository.EnderecoRepository;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<EnderecoModel> buscaEnderecoTodos(){
        return enderecoRepository.findAll();
    }

    public Optional<EnderecoModel> buscarPorId(Long id){
        return enderecoRepository.findById(id);

    }
    public EnderecoModel registrarConta(EnderecoModel enderecoModel) {


        enderecoModel.getId();
        enderecoModel.getLogradouro();
        enderecoModel.getBairro();
        enderecoModel.getCEP();
        enderecoModel.getPontoReferencia();

        return enderecoRepository.save(enderecoModel);
    }
    public EnderecoModel alterarEndereco(EnderecoModel enderecoModel) {

        enderecoModel.getLogradouro();
        enderecoModel.getBairro();
        enderecoModel.getCEP();
        enderecoModel.getPontoReferencia();

        return enderecoRepository.save(enderecoModel);
    }

    public void deleteId(Long id) {
        enderecoRepository.deleteById(id);
    }




}
