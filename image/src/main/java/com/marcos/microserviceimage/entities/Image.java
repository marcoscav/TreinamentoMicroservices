package com.marcos.microserviceimage.entities;

public class Image implements java.io.Serializable {

	private static final long serialVersionUID = 9213866513641249167L;
	private Long id;
	private String title;
	private String url;

	public Image() {

	}

	public Image(Long id, String title, String url) {
		this.id = id;
		this.title = title;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
