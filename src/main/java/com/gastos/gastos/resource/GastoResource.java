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

import com.gastos.gastos.entity.Gasto;
import com.gastos.gastos.repository.GastoRepository;

@RestController
@RequestMapping("/gerenciargastos")
public class GastoResource {
	
	@Autowired(required=true)
	private GastoRepository gastoRepository;
	
	@GetMapping
	public List<Gasto> listaGastos() {
		List<Gasto> listaGastos = gastoRepository.findAll();
		return listaGastos;
	}
	
	@PostMapping
	public Gasto cadastrarGasto(@RequestBody @Valid Gasto gasto) {
		return gastoRepository.save(gasto); 	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Gasto>> buscar(@PathVariable Long id){
		Optional<Gasto> gasto = gastoRepository.findById(id);
		if (gasto == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(gasto);
	}

}
