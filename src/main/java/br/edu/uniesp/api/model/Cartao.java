package br.edu.uniesp.api.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Getter
@Setter
@Entity
@Table(name = "cartoes")
@Data

public class Cartao {

    @Id
    @GeneratedValue
    private Long id;

    private String numeroCartao;

    private LocalDate validade;

    private String codigoSeguranca;

    private String nomeTitular;

    private String cpf;

}