    package br.com.locadoraa.repositories;


    import br.com.locadoraa.model.FilmeGenero;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;


    @Repository
    public interface FilmeGeneroRepository extends JpaRepository<FilmeGenero, FilmeGenero> {
    }
