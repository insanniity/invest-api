package br.com.insannity.invest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.insannity.invest.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
