package com.GerenciadorDeContas.demo.contaApagar.Service;

import com.GerenciadorDeContas.demo.contaApagar.Model.EstadoModel;
import com.GerenciadorDeContas.demo.contaApagar.Repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
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

    public void deleteEstadoId(Long id) {
        estadoRepository.deleteById(id);
    }
}
