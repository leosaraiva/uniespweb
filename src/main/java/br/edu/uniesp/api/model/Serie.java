package br.edu.uniesp.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;

import javax.persistence.*;
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

    private String titulo;

    private Integer anoLancamento;

    private Integer temporadas;

    private String sinopse;

    private Integer relevancia;

    private String urlTrailler;

    @OneToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

}
