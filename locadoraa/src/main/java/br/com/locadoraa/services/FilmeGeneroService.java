package br.com.locadoraa.services;

import br.com.locadoraa.model.FilmeGenero;
import br.com.locadoraa.repositories.FilmeGeneroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeGeneroService {

    @Autowired
    private FilmeGeneroRepository filmeGeneroRepository;

    public void save(FilmeGenero filmeGenero) {
        filmeGeneroRepository.save(filmeGenero);
    }

    public List<FilmeGenero> findAll() {
        return filmeGeneroRepository.findAll();
    }

    public Optional<FilmeGenero> findById(FilmeGenero id) {
        return filmeGeneroRepository.findById(id);
    }

    public void deleteById(FilmeGenero id) {
        filmeGeneroRepository.deleteById(id);
    }
}
