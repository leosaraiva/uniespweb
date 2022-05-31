package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Favorito;
import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.repository.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritoService {

    @Autowired
    private FavoritoRepository repository;

    public Favorito salvarFavorito(Favorito favorito) { return repository.save(favorito); }

    public Favorito atualizarFavorito(Favorito favorito) throws Exception {
        if (favorito.getId() == null) {
            throw new Exception("ID não encontrado");
        }
        return repository.save(favorito);
    }

    public void deletarFavorito (int id) { repository.deleteById(id); }

    public List<Favorito> listarFavorito() { return repository.findAll(); }

}
