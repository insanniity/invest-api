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

import br.com.insannity.invest.entities.Categoria;
import br.com.insannity.invest.repositories.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public List<Categoria> listarTodos(){
		return repository.findAll();
	}
	
	@PostMapping("/{codigo}")
	public Categoria buscarPeloCodigo(@PathVariable Long codigo) {
		return repository.findById(codigo).orElseThrow(null);
	}
	
	@PostMapping
	public Categoria cadastrar(@RequestBody Categoria categoria) {
		return repository.save(categoria);
	}
	
	@DeleteMapping("/{codigo}")
	public void deletar(@PathVariable Long codigo) {
		repository.deleteById(codigo);;
	} 

}
