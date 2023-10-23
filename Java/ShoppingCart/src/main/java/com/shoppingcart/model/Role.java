package com.shoppingcart.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "role", unique = true)
	private String role;
	
	private Set<UserEntity> userEntities = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<UserEntity> getUserEntities() {
		return userEntities;
	}

	@ManyToMany(mappedBy = "roles")
	public void setUserEntities(Set<UserEntity> userEntities) {
		this.userEntities = userEntities;
	}

	public Role() {
		super();
	}
	
	
}
