package br.com.locadoraa.controllers;

import br.com.locadoraa.model.Funcionario;
import br.com.locadoraa.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<Funcionario> create(@RequestBody Funcionario funcionario) {
        Funcionario savedFuncionario = funcionarioService.save(funcionario);
        return ResponseEntity.ok(savedFuncionario);
    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll() {
        List<Funcionario> funcionarios = funcionarioService.findAll();
        return ResponseEntity.ok(funcionarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable String id) {
        Optional<Funcionario> funcionario = funcionarioService.findById(id);
        return funcionario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        funcionarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

