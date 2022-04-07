package br.edu.uniesp.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Filme implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String titulo;
    private String diretor;
    private Integer anoLancamento;
    private Genero genero;

    public Genero getGenero() { return genero; }

    public void setGenero(Genero genero) { this.genero = genero; }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() { return diretor; }

    public void setDiretor(String diretor) { this.diretor = diretor; }

    public Integer getAnoLancamento() { return anoLancamento; }

    public void setAnoLancamento(Integer anoLancamento) { this.anoLancamento = anoLancamento; }
}
