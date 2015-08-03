package com.test;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="t_zlh_yxcq")
public class Yxcq implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name1;
	private String name2;
	private String name3;

	@Id
	@Column(name="id")
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	@Column(name="name1")
	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}
	@Column(name="name2")
	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}
	@Column(name="name3")
	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

}
