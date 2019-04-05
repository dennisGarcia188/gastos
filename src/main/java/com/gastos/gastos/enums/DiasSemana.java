package com.gastos.gastos.enums;

public enum DiasSemana {

	DOMINGO("domingo"), SEGUNDA("segunda"), TERCA("terca"), QUARTA("quarta"), QUINTA("quinta"), SEXTA("sexta"),
	SABADO("sabado");

	private DiasSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	private String diaDaSemana;

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

}
