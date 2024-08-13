package br.com.locadoraa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Table;

@Entity
@Table(name = "FilmeGenero")
public class FilmeGenero {

    @EmbeddedId
    private FilmeGeneroId id;

    public FilmeGenero() {}

    public FilmeGenero(FilmeGeneroId id) {
        this.id = id;
    }

    // Getters and setters
    public FilmeGeneroId getId() {
        return id;
    }

    public void setId(FilmeGeneroId id) {
        this.id = id;
    }
}
