package com.common.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
