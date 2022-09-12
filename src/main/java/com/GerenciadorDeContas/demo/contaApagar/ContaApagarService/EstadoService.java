package com.GerenciadorDeContas.demo.contaApagar.ContaApagarService;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.EnderecoModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.EstadoModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarRepository.EnderecoRepository;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarRepository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    public List<EstadoModel> buscaEstadoTodos(){
        return estadoRepository.findAll();
    }

    public Optional<EstadoModel> buscarPorIdEstado(Long id){
        return estadoRepository.findById(id);

    }
    public EstadoModel registrarEstado(EstadoModel estadoModel) {

        estadoModel.getEstadoId();
        estadoModel.getEstadoNome();
        estadoModel.getUf();

        return estadoRepository.save(estadoModel);
    }
    public EstadoModel alterarEstado(EstadoModel estadoModel) {

        estadoModel.getEstadoNome();
        estadoModel.getUf();

        return estadoRepository.save(estadoModel);
    }

    public void deleteId(Long id) {
        estadoRepository.deleteById(id);
    }
}
