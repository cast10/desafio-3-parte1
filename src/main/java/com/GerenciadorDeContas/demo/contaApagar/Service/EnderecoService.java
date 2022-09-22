package com.GerenciadorDeContas.demo.contaApagar.Service;

import com.GerenciadorDeContas.demo.contaApagar.Model.EnderecoModel;
import com.GerenciadorDeContas.demo.contaApagar.Repository.EnderecoRepository;
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
    public EnderecoModel registrarEndereco(EnderecoModel enderecoModel) {


        enderecoModel.getId();
        enderecoModel.getLogradouro();
        enderecoModel.getBairro();
        enderecoModel.getCep();
        enderecoModel.getPontoReferencia();

        return enderecoRepository.save(enderecoModel);
    }
    public EnderecoModel alterarEndereco(EnderecoModel enderecoModel) {

        enderecoModel.getLogradouro();
        enderecoModel.getBairro();
        enderecoModel.getCep();
        enderecoModel.getPontoReferencia();

        return enderecoRepository.save(enderecoModel);
    }

    public void deleteId(Long id) {
        enderecoRepository.deleteById(id);
    }

}
