package br.com.locadoraa.repositories;

import br.com.locadoraa.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {
    // Métodos de consulta personalizados podem ser adicionados aqui, se necessário
}
