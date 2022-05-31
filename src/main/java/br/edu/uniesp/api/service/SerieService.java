package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.model.Serie;
import br.edu.uniesp.api.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    @Autowired
    private SerieRepository repository;

    public Serie salvar(Serie serie){
        return repository.save(serie);
    }

    public Serie atualizar(Serie serie) throws Exception{
        if(serie.getId()==null){
            throw new Exception("ID não encontrado");
        }
        return repository.save(serie);
    }
    public List<Serie> listar(){
        return repository.findAll();
    }
    public void deletar(int id){
        repository.deleteById(id);
    }
    public List<Serie> listarSeriePorTitulo(String titulo){
        return repository.findByTitulo(titulo);
    }
}
