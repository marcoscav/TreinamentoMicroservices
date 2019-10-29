package com.marcos.microservicegallery.entities;

import java.util.List;

public class Gallery implements java.io.Serializable {

	private static final long serialVersionUID = 8043966775024185517L;

	private Long id;

	private List<Object> images;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Object> getImages() {
		return images;
	}

	public void setImages(List<Object> images) {
		this.images = images;
	}

}
