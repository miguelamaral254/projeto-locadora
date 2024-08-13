package br.com.locadoraa.services;

import br.com.locadoraa.model.Locacao;
import br.com.locadoraa.repositories.LocacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    public Locacao save(Locacao locacao) {
        return locacaoRepository.save(locacao);
    }

    public List<Locacao> findAll() {
        return locacaoRepository.findAll();
    }

    public Optional<Locacao> findById(int id) {
        return locacaoRepository.findById(id);
    }

    public void deleteById(int id) {
        locacaoRepository.deleteById(id);
    }
}
