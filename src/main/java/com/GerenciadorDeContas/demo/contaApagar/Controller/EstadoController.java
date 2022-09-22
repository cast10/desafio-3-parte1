package com.GerenciadorDeContas.demo.contaApagar.Controller;

import com.GerenciadorDeContas.demo.contaApagar.Model.EstadoModel;
import com.GerenciadorDeContas.demo.contaApagar.Service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping(path = "/estado")
    public ResponseEntity<List<EstadoModel>> buscarEstado(){
        return ResponseEntity.ok(estadoService.buscaEstadoTodos());
    }

    @GetMapping(path = "/estado/{id}")
    public ResponseEntity<Optional<EstadoModel>> buscarEstadoID(@PathVariable long id){
        return ResponseEntity.ok(estadoService.buscarPorIdEstado(id));
    }

    @PostMapping(path = "/estado")
    public ResponseEntity <EstadoModel> cadastrarEstado(@RequestBody EstadoModel cadastreEstado){
        EstadoModel novoEstado = estadoService.registrarEstado(cadastreEstado);
        return new ResponseEntity<>(novoEstado, HttpStatus.CREATED);
    }

    @PutMapping(path = "/estado/{id}")
    public ResponseEntity<EstadoModel> altereEstado (@RequestBody EstadoModel altereEstado,@PathVariable Long id){
        altereEstado.setId(id);
        return ResponseEntity.ok(estadoService.alterarEstado(altereEstado));

    }
    @DeleteMapping(path = "/estado/{id}")
    public ResponseEntity <Void>deletarEndereco(@PathVariable long id) {
        estadoService.deleteEstadoId(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
