package com.gastos.gastos.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gastos.gastos.entity.Cliente;
import com.gastos.gastos.repository.ClienteRepository;

@RestController
@RequestMapping("/registrarCliente")
public class ClienteResource {
	
	@Autowired(required=true)
	private ClienteRepository clienteRepository;
	
	@PostMapping
	public Cliente salvarDisco(@RequestBody @Valid Cliente cliente) {
		return clienteRepository.save(cliente); 	
	}
	

}
