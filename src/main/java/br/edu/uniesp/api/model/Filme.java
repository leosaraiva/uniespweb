package br.edu.uniesp.api.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Getter
@Setter
@Entity
@Table(name = "tb_filme")
@Data
public class Filme implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "filme_id")
    private Integer id;

    @Column(name = "titulo", length = 100)
    @NotNull
    private String titulo;

    @Column(name = "diretor", length = 100)
    private String diretor;

    @Column(name = "ano_lancamento", length = 4)
    private Integer anoLancamento;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

}
