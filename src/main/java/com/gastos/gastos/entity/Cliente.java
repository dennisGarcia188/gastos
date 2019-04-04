package com.gastos.gastos.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	/*
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/*
	 * nome
	 */
	private String nome;
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getCashBack() {
		return cashBack;
	}

	public void setCashBack(BigDecimal cashBack) {
		this.cashBack = cashBack;
	}
}
