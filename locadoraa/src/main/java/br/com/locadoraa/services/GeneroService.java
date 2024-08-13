package br.com.locadoraa.services;

import br.com.locadoraa.model.Genero;
import br.com.locadoraa.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public Genero save(Genero genero) {
        return generoRepository.save(genero);
    }

    public List<Genero> findAll() {
        return generoRepository.findAll();
    }

    public Optional<Genero> findById(Integer id) {
        return generoRepository.findById(id);
    }

    public void deleteById(Integer id) {
        generoRepository.deleteById(id);
    }
}
