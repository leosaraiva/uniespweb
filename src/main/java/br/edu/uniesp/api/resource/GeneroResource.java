package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroResource {

    @Autowired
    private GeneroService service;

    @PostMapping
    public Genero salvar(@RequestBody Genero genero){
        genero = service.salvarGenero(genero);
        return genero;
    }

    @GetMapping
    public List <Genero> listarGenero() {
        return service.listarGenero();
    }

    @DeleteMapping({"id"})
    public void deletarGenero(@PathVariable int id) {service.deletarGenero(id);}

    @PutMapping
    public Genero atualizarGenero(@RequestBody Genero genero) throws Exception {

        return service.atualizarGenero(genero);

    }





}
