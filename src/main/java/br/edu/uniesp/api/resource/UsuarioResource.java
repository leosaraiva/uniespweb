package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Usuario;
import br.edu.uniesp.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
        usuario = service.cadastrarUsuario(usuario);
        return usuario;
    }

    @GetMapping
    public List <Usuario> listarUsuario() {
        return service.listarUsuario();
    }

    @DeleteMapping("{cpf}")
    public void removerUsuario(@PathVariable String cpf) { service.deletarUsuario(cpf);}

    @PutMapping
    public Usuario atualizarUsuario (@RequestBody Usuario usuario) throws Exception {
        return service.atualizarUsuario(usuario);
    }

}
