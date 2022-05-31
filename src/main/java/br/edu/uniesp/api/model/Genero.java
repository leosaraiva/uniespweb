package br.edu.uniesp.api.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_genero")
@Data
public class Genero implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "genero_id")
    private Integer id;

    @Column(name = "genero_nome")
    private String nome;

    @Column(name = "genero_descricao")
    private String descricao;

    @OneToMany(mappedBy = "genero")
    private Set<Filme> listaFilmes;

    @OneToMany(mappedBy = "genero")
    private Set<Serie> listaSerie;

}
