package br.edu.uniesp.api.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "tb_usuario")
public class Usuario implements Serializable {

    @Id
    @Column(name = "cpf", length = 11)
    private String cpf;

    @Column(name = "usuario_nome", length = 200)
    @NotEmpty
    private String nomeCompleto;

    @Column(name = "usuario_email")
    @Email
    private String email;

    @Column(name = "usuario_nascimento")
    private String dataNascimento;

    @Column(name = "senha")
    private String senha;

    public Usuario(String cpf, String nomeCompleto, String email, String dataNascimento, String senha) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public Usuario(){}


    /* TODO
        public String confirmarSenha(senha) {
            if (this.senha == senha){
                return 'Senhas conferem';
            }
     }
    */
}
