package br.com.insannity.invest.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Investimento {
	
	@Id
	private Long codigo;
	
	private String codigoAtivo;
	
	private Double valorCota;
	
	private Integer quantidadeCotas;
	
	private LocalDate data;
	
	
}
