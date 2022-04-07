package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Usuario;
import br.edu.uniesp.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario cadastrarUsuario(Usuario usuario) {return repository.save(usuario); }

    public Usuario atualizarUsuario(Usuario usuario) throws Exception {
        if (usuario.getCpf() == null) {
            throw new Exception("Usuário não encontrado");
        }
        return repository.save(usuario);
    }

    public void deletarUsuario(String cpf) {repository.deleteById(cpf); }

    public List<Usuario> listarUsuario() {return repository.findAll(); }

}
