package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Favorito;
import br.edu.uniesp.api.service.FavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorito")
public class FavoritoResource {

    @Autowired
    private FavoritoService service;


    @PostMapping
    public Favorito salvarFavorito(@RequestBody Favorito favorito) {
        favorito = service.salvarFavorito(favorito);
        return favorito;
    }

    @GetMapping
    public List <Favorito> listarFavorito() {
        return service.listarFavorito();
    }

    @DeleteMapping("{id}")
    public void removerFavorito(@PathVariable int id) {service.deletarFavorito(id);}

    @PutMapping
    public Favorito atualizarFavorito(@RequestBody Favorito favorito) throws Exception {
        return service.atualizarFavorito(favorito);
    }

}
