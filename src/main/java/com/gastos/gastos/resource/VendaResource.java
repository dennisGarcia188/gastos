package com.gastos.gastos.resource;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gastos.gastos.entity.Cliente;
import com.gastos.gastos.entity.Disco;
import com.gastos.gastos.entity.Genero;
import com.gastos.gastos.entity.Venda;
import com.gastos.gastos.repository.CashBackRepository;
import com.gastos.gastos.repository.ClienteRepository;
import com.gastos.gastos.repository.DiscosRepository;
import com.gastos.gastos.repository.GeneroRepository;
import com.gastos.gastos.repository.VendaRepository;

@RestController
@RequestMapping("/gerenciarVendas")
public class VendaResource {
	
	@Autowired(required=true)
	private VendaRepository vendaRepository;
	
	@Autowired(required=true)
	private CashBackRepository cashBackRepository;
	
	@Autowired(required=true)
	private ClienteRepository clienteRepository;
	
	@Autowired(required=true)
	private DiscosRepository discoRepository;
	
	@Autowired(required=true)
	private GeneroRepository generoRepository;
	
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
	@PostMapping("/registrarVenda")
	public Venda registrarVenda(@PathVariable Long idGenero,@PathVariable Long idDisco, @PathVariable Long idCliente) {
		Venda venda = new Venda();
		Genero cashback = new Genero();
		
		Cliente cliente = new Cliente();
		cliente = clienteRepository.findById(idCliente);
		
		Disco disco = new Disco();
		disco = discoRepository.findById(idDisco);
		
		Genero genero = new Genero();
		genero = generoRepository.findById(idGenero);
		
		cashback = cashBackRepository.findById(genero.getId());
		venda.setCliente(cliente.getNome());
		venda.setCashBack(new BigDecimal(cashback.getPercentual()).multiply(disco.getValor()));
		return vendaRepository.save(venda); 	
	}
	


}
