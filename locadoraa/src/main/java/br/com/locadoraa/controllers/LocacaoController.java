package br.com.locadoraa.controllers;

import br.com.locadoraa.model.Locacao;
import br.com.locadoraa.services.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locacoes")
public class LocacaoController {

    @Autowired
    private LocacaoService locacaoService;

    @PostMapping
    public ResponseEntity<Locacao> create(@RequestBody Locacao locacao) {
        Locacao savedLocacao = locacaoService.save(locacao);
        return ResponseEntity.ok(savedLocacao);
    }

    @GetMapping
    public ResponseEntity<List<Locacao>> findAll() {
        List<Locacao> locacoes = locacaoService.findAll();
        return ResponseEntity.ok(locacoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Locacao> findById(@PathVariable Integer id) {
        Optional<Locacao> locacao = locacaoService.findById(id);
        return locacao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        locacaoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
