package com.diego.register.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Instant initialDate;
	private Instant finalDate;
	private String cnpj;
	private String comments;
	
	public User() {
		
	}
	
	public User(Long id, String name, Instant initialDate, Instant finalDate, String cnpj, String comments) {
		super();
		this.id = id;
		this.name = name;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
		this.cnpj = cnpj;
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Instant getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Instant initialDate) {
		this.initialDate = initialDate;
	}

	public Instant getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Instant finalDate) {
		this.finalDate = finalDate;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
