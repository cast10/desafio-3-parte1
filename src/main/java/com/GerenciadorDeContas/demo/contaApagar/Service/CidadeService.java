package com.GerenciadorDeContas.demo.contaApagar.Service;

import com.GerenciadorDeContas.demo.contaApagar.Model.CidadeModel;
import com.GerenciadorDeContas.demo.contaApagar.Repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<CidadeModel> buscaCidadeTodos(){
        return cidadeRepository.findAll();
    }

    public Optional<CidadeModel> buscarCidadeId(Long id){
        return cidadeRepository.findById(id);

    }
    public CidadeModel registrarCidade(CidadeModel cidadeModel) {


        cidadeModel.getCidadeId();
        cidadeModel.getCidadeNome();
        return cidadeRepository.save(cidadeModel);
    }
    public CidadeModel alterarCidade(CidadeModel cidadeModel) {

        cidadeModel.getCidadeNome();

        return cidadeRepository.save(cidadeModel);
    }

    public void deleteId(Long id) {
        cidadeRepository.deleteById(id);
    }

}
