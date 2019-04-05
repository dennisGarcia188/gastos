package com.gastos.gastos.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda {

	/*
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/*
	 * valor
	 */
	private BigDecimal valor;

	/*
	 * cliente
	 */
	private String cliente;

	/*
	 * cashback
	 */
	private BigDecimal cashBack;

	/*
	 * getters and setters
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getCashBack() {
		return cashBack;
	}

	public void setCashBack(BigDecimal cashBack) {
		this.cashBack = cashBack;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}
