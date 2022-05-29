package br.edu.uniesp.api.model;

import com.sun.istack.NotNull;
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

    @Column(name = "serie_titulo", length = 100)
    @NotNull
    private String titulo;

    @Column(name ="serie_ano", length = 4)
    private Integer anoLancamento;
    @Column(name = "serie_temporadas", length = 2)
    private Integer temporadas;
    @Column(name = "serie_sinopse", length = 200)
    private String sinopse;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

}
