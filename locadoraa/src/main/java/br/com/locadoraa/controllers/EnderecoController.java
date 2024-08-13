package br.com.locadoraa.controllers;

import br.com.locadoraa.model.Endereco;
import br.com.locadoraa.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<Endereco> create(@RequestBody Endereco endereco) {
        Endereco savedEndereco = enderecoService.save(endereco);
        return ResponseEntity.ok(savedEndereco);
    }

    @GetMapping
    public ResponseEntity<List<Endereco>> findAll() {
        List<Endereco> enderecos = enderecoService.findAll();
        return ResponseEntity.ok(enderecos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> findById(@PathVariable Integer id) {
        Optional<Endereco> endereco = enderecoService.findById(id);
        return endereco.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        enderecoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
