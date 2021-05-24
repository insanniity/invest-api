package br.com.insannity.invest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.insannity.invest.entities.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}
