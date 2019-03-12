package com.gastos.gastos;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

}