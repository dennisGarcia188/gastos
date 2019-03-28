package com.gastos.gastos.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gastos.gastos.entity.Disco;
import com.gastos.gastos.repository.DiscosRepository;

@RestController
@RequestMapping("/gerenciarDiscos")
public class DiscosResource {
	
	@Autowired(required=true)
	private DiscosRepository discosRepository;
	
	/*
	 * método para consultar todos os discos
	 */
	@GetMapping
	public List<Disco> listarDiscos() {
		List<Disco> listarDiscos = discosRepository.findAll();
		return listarDiscos;
	}
	
	
	/*
	 * método para consultar uma disco pelo identificador
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Disco>> consultarDisco(@PathVariable Long id){
		Optional<Disco> disco = discosRepository.findById(id);
		if (disco == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(disco);
	}
	
	/*
	 * método para salvar um disco novo
	 */
	@PostMapping
	public Disco salvarDisco(@RequestBody @Valid Disco disco) {
		return discosRepository.save(disco); 	
	}
	

}
