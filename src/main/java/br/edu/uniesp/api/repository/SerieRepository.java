package br.edu.uniesp.api.repository;

import br.edu.uniesp.api.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository extends JpaRepository<Serie,Integer> {
    List<Serie> findByTitulo(String titulo);
    @Query("select s.genero from Serie s where " +
            "s.genero.nome =:genero")
    List<Serie> buscarPorGenero(@Param("genero") String genero);
}
