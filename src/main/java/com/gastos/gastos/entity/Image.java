package com.gastos.gastos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {

	/*
	 * idimage
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idimage;

	/*
	 * height
	 */
	private Integer height;

	/*
	 * url
	 */
	private String url;

	/*
	 * width
	 */
	private Integer width;

	/*
	 * getters and setters
	 */

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Long getIdimage() {
		return idimage;
	}

	public void setIdimage(Long idimage) {
		this.idimage = idimage;
	}

}
