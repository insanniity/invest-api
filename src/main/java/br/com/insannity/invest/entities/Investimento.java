package br.com.insannity.invest.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Investimento {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String codigoAtivo;
	
	private Double valorCota;
	
	private Integer quantidadeCotas;
	
	private LocalDate data;	
	
	@ManyToOne
	@JoinColumn(name = "codigo_categoria")
	private Categoria categoria;
	
	
	
}
