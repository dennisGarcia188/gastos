package com.gastos.gastos.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class Disco {

	/*
	 * idDisco
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_disco;

	/*
	 * album_type
	 */
	private String album_type;

	/*
	 * artists
	 */
	@ManyToMany(targetEntity = Artista.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@OrderColumn(name = "id_artista")
	@JoinColumn(name = "id_artista")
	private Artista[] artists;

	/*
	 * available_markets
	 */
	private String[] available_markets;

	/*
	 * external_urls
	 */
	@ManyToOne(targetEntity = Externalurls.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "idexternal")
	private Externalurls external_urls;

	/*
	 * href
	 */
	private String href;

	/*
	 * id
	 */
	private String id;

	/*
	 * images
	 */
	@OneToMany(targetEntity = Image.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@OrderColumn(name = "idimage")
	private Image[] images;

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
	 * valor
	 */
	private BigDecimal valor;

	/*
	 * getters and setters
	 */

	public String getAlbum_type() {
		return album_type;
	}

	public void setAlbum_type(String album_type) {
		this.album_type = album_type;
	}

	public String[] getAvailable_markets() {
		return available_markets;
	}

	public void setAvailable_markets(String[] available_markets) {
		this.available_markets = available_markets;
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

	public Image[] getImages() {
		return images;
	}

	public void setImages(Image[] images) {
		this.images = images;
	}

	public Artista[] getArtists() {
		return artists;
	}

	public void setArtists(Artista[] artists) {
		this.artists = artists;
	}

	public long getId_disco() {
		return id_disco;
	}

	public void setId_disco(long id_disco) {
		this.id_disco = id_disco;
	}

	public Externalurls getExternal_urls() {
		return external_urls;
	}

	public void setExternal_urls(Externalurls external_urls) {
		this.external_urls = external_urls;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
