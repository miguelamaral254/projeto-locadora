package br.com.locadoraa.services;

import br.com.locadoraa.model.Filme;
import br.com.locadoraa.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public Filme save(Filme filme) {
        return filmeRepository.save(filme);
    }

    public Page<Filme> findAll(Pageable pageable) {
        return filmeRepository.findAll(pageable);
    }

    public Optional<Filme> findById(Integer id) {
        return filmeRepository.findById(id);
    }

    public void deleteById(Integer id) {
        filmeRepository.deleteById(id);
    }
}
