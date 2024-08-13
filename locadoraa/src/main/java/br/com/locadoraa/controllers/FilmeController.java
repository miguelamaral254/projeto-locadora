package br.com.locadoraa.controllers;

import br.com.locadoraa.model.Filme;
import br.com.locadoraa.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    // Salva um novo filme ou atualiza um existente
    @PostMapping
    public ResponseEntity<Filme> createOrUpdateFilme(@RequestBody Filme filme) {
        Filme savedFilme = filmeService.save(filme);
        return new ResponseEntity<>(savedFilme, HttpStatus.CREATED);
    }

    // Recupera todos os filmes com paginação
    @GetMapping
    public ResponseEntity<Page<Filme>> getAllFilmes(Pageable pageable) {
        Page<Filme> filmes = filmeService.findAll(pageable);
        return new ResponseEntity<>(filmes, HttpStatus.OK);
    }

    // Encontra um filme pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Filme> getFilmeById(@PathVariable Integer id) {
        Optional<Filme> filme = filmeService.findById(id);
        return filme.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Deleta um filme pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFilmeById(@PathVariable Integer id) {
        if (filmeService.findById(id).isPresent()) {
            filmeService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
