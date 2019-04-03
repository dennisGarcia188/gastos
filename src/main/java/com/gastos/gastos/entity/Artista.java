package com.gastos.gastos.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Artista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_artista;
	
	@ManyToOne(targetEntity = Externalurls.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="idexternal")
	private Externalurls external_urls;
	
	private String href;
	
	private String id;
	
	private String name;
	
	private String type;
	
	private String uri;

	/*
	 * getters and setters
	 */
	

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Long getId_artista() {
		return id_artista;
	}

	public void setId_artista(Long id_artista) {
		this.id_artista = id_artista;
	}

	public Externalurls getExternal_urls() {
		return external_urls;
	}

	public void setExternal_urls(Externalurls external_urls) {
		this.external_urls = external_urls;
	}

	

	
}
