package br.com.locadoraa.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FilmeGeneroId implements Serializable {

    @Column(name = "filme_id")
    private Integer filmeId;

    @Column(name = "genero_id")
    private Integer generoId;

    public FilmeGeneroId() {}

    public FilmeGeneroId(Integer filmeId, Integer generoId) {
        this.filmeId = filmeId;
        this.generoId = generoId;
    }

    // Getters and setters
    public Integer getFilmeId() {
        return filmeId;
    }

    public void setFilmeId(Integer filmeId) {
        this.filmeId = filmeId;
    }

    public Integer getGeneroId() {
        return generoId;
    }

    public void setGeneroId(Integer generoId) {
        this.generoId = generoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmeGeneroId that = (FilmeGeneroId) o;
        return Objects.equals(filmeId, that.filmeId) &&
                Objects.equals(generoId, that.generoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmeId, generoId);
    }
}
