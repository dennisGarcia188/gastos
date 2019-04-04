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
import org.springframework.web.bind.annotation.RequestParam;
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
	private DiscosRepository discosRepository;
	
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
	public Venda registrarVenda(@RequestParam("idGenero") Integer idGenero,@RequestParam("idDisco") Integer idDisco, @RequestParam("idCliente") Integer idCliente) {
		Venda venda = new Venda();
		Genero cashback = new Genero();
		
		Cliente cliente = new Cliente();
		cliente = clienteRepository.findById(new Long(idCliente));
		
		Genero genero = new Genero();
		genero = generoRepository.findById(new Long(idGenero));
		
		Disco disco = new Disco();
        //disco = discosRepository.findById(new Long(idDisco));
		disco.setValor(new BigDecimal(100));
        
		cashback = cashBackRepository.findById(genero.getId());
		venda.setCliente(cliente.getNome());
		venda.setCashBack(new BigDecimal(cashback.getPercentual()).multiply(disco.getValor()).divide(new BigDecimal(100)));
		
		cliente.setCashBack(venda.getCashBack().add(cliente.getCashBack()));
		
		venda.setValor(disco.getValor());
		return vendaRepository.save(venda); 	
	}
	


}
