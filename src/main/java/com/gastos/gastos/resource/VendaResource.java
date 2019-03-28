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
import com.gastos.gastos.entity.Venda;
import com.gastos.gastos.repository.VendaRepository;

@RestController
@RequestMapping("/gerenciarVendas")
public class VendaResource {
	
	@Autowired(required=true)
	private VendaRepository vendaRepository;
	
	/*
	 * método para listar todas as vendas
	 */
	@GetMapping
	public List<Venda> listarVendas() {
		List<Venda> listarVendas = vendaRepository.findAll();
		return listarVendas;
	}
	
	/*
	 * método para consultar uma venda pelo identificador
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Venda>> consultarVenda(@PathVariable Long id){
		Optional<Venda> venda = vendaRepository.findById(id);
		if (venda == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(venda);
	}
	
	/*
	 * método para realizar uma venda
	 */
	@PostMapping
	public Venda registrarVenda(@RequestBody @Valid Venda venda) {
		return vendaRepository.save(venda); 	
	}
	


}
