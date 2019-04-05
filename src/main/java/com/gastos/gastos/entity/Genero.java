package com.gastos.gastos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genero {

	/*
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	/*
	 * name
	 */
	public String name;

	/*
	 * percentual
	 */
	public String percentual;

	/*
	 * diaSemana
	 */
	public String diaSemana;

	/*
	 * getters and setters
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPercentual() {
		return percentual;
	}

	public void setPercentual(String percentual) {
		this.percentual = percentual;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

}
