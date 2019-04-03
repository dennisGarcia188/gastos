package com.gastos.gastos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Externalurls {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idexternal;
	
    @Column(name="[key]")
	private String key;
	
    @Column(name="[value]")
	private String value;
	
	/*
	 * getters and setters
	 */

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getIdexternal() {
		return idexternal;
	}

	public void setIdexternal(Long idexternal) {
		this.idexternal = idexternal;
	}

}
