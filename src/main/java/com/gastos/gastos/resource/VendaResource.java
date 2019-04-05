package com.gastos.gastos.resource;

import java.math.BigDecimal;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.hibernate.tool.schema.internal.ExceptionHandlerLoggedImpl;
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
import com.gastos.gastos.enums.DiasSemana;
import com.gastos.gastos.repository.ClienteRepository;
import com.gastos.gastos.repository.DiscosRepository;
import com.gastos.gastos.repository.GeneroRepository;
import com.gastos.gastos.repository.VendaRepository;

@RestController
@RequestMapping("/gerenciarVendas")
public class VendaResource {

	@Autowired(required = true)
	private VendaRepository vendaRepository;

	@Autowired(required = true)
	private ClienteRepository clienteRepository;

	@Autowired(required = true)
	private GeneroRepository generoRepository;

	@Autowired(required = true)
	private DiscosRepository discosRepository;

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
	public ResponseEntity<Optional<Venda>> consultarVenda(@PathVariable Long id) {
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
	public Venda registrarVenda(@RequestParam("idGenero") Integer idGenero, @RequestParam("idDisco") Integer idDisco,
			@RequestParam("idCliente") Integer idCliente) {
		try {
			if (idDisco == null || idGenero == null || idCliente == null) {
				throw new IllegalStateException("Valores inválidos ou nulos");
			}
			Venda venda = new Venda();
			String diaSemana = weekDay();

			Cliente cliente = new Cliente();
			cliente = clienteRepository.findById(new Long(idCliente));

			Genero genero = new Genero();
			genero = generoRepository.findById(new Long(idGenero));

			Genero percentual = generoRepository.pegaPercentual(diaSemana, genero.getName());

			Disco disco = new Disco();
			disco = discosRepository.findByIdManual(new Long(idDisco));

			if (disco.getValor() == null) {
				disco.setValor(new BigDecimal(100));
			}
			venda.setCliente(cliente.getNome());
			venda.setCashBack(
					new BigDecimal(percentual.getPercentual()).multiply(disco.getValor()).divide(new BigDecimal(100)));

			cliente.setCashBack(venda.getCashBack().add(cliente.getCashBack()));

			venda.setValor(disco.getValor());
			return vendaRepository.save(venda);
		} catch (ExceptionInInitializerError e) {
			throw new IllegalStateException(e);
		}
	}

	/*
	 * método para equivaler o dia retornado do calendar com a String do banco
	 */
	public String weekDay() {
		Calendar cal = Calendar.getInstance();
		String diaSemana;
		diaSemana = new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
		switch (diaSemana) {
		case "Domingo":
			diaSemana = DiasSemana.DOMINGO.getDiaDaSemana();
			break;
		case "Segunda-feira":
			diaSemana = DiasSemana.SEGUNDA.getDiaDaSemana();
			break;
		case "Terça-feira":
			diaSemana = DiasSemana.TERCA.getDiaDaSemana();
			break;
		case "Quarta-feira":
			diaSemana = DiasSemana.QUARTA.getDiaDaSemana();
			break;
		case "Quinta-feira":
			diaSemana = DiasSemana.QUINTA.getDiaDaSemana();
			break;
		case "Sexta-feira":
			diaSemana = DiasSemana.SEXTA.getDiaDaSemana();
			break;
		case "Sabado":
			diaSemana = DiasSemana.SABADO.getDiaDaSemana();
			break;
		}
		return diaSemana;
	}
}
