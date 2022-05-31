package br.edu.uniesp.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Getter
@Setter
@Entity
@Table(name = "series")
@Data
public class Serie implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "serie_id")
    private Long id;

    @Column(name = "titulo", length = 100)
    @NotNull
    private String titulo;

    @Column(name= "ano_lancamento", length = 4)
    private Integer anoLancamento;

    @Column(name = "temporadas", length = 50)
    private Integer temporadas;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

}
