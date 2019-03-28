package com.gastos.gastos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;


@Entity
public class Disco {
	
	/*
	 * idDisco
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDisco;
	
	/*
	 * album_type
	 */
	private String album_type;
	
	/*
	 * artists
	 */
	@ManyToOne
	@JoinTable(name="artista")
	private Artista artists;
	
	/*
	 * available_markets
	 */
	private String[] available_markets;
	
	/*
	 * external_urls
	 */
	private String external_urls;
	
	/*
	 * href
	 */
	private String href;
	
	/*
	 * id
	 */
	private String id;
	
	//private Image[] images;
	
	/*
	 * name
	 */
	private String name;
	
	/*
	 * type
	 */
	private String type;
	
	/*
	 * uri
	 */
	private String uri;
	

	/*
	 * getters and setters 
	 */

	public long getIdDisco() {
		return idDisco;
	}

	public void setIdDisco(long idDisco) {
		this.idDisco = idDisco;
	}

	public String getAlbum_type() {
		return album_type;
	}

	public void setAlbum_type(String album_type) {
		this.album_type = album_type;
	}

	public Artista getArtists() {
		return artists;
	}

	public void setArtists(Artista artists) {
		this.artists = artists;
	}

	public String[] getAvailable_markets() {
		return available_markets;
	}

	public void setAvailable_markets(String[] available_markets) {
		this.available_markets = available_markets;
	}

	public String getExternal_urls() {
		return external_urls;
	}

	public void setExternal_urls(String external_urls) {
		this.external_urls = external_urls;
	}

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

}
