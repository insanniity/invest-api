package br.com.insannity.invest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.insannity.invest.entities.Investimento;
import br.com.insannity.invest.repositories.InvestimentoRepository;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {
	
	@Autowired
	private InvestimentoRepository repository;
	
	@GetMapping
	public List<Investimento> listarTodos(){
		return repository.findAll();
	}
	
	@PostMapping("/{codigo}")
	public Investimento buscarPeloCodigo(@PathVariable Long codigo) {
		return repository.findById(codigo).orElseThrow(null);
	}
	
	@PostMapping
	public Investimento cadastrar(@RequestBody Investimento investimento) {
		return repository.save(investimento);
	}
	
	@DeleteMapping("/{codigo}")
	public void deletar(@PathVariable Long codigo) {
		repository.deleteById(codigo);;
	} 
	
	
}
