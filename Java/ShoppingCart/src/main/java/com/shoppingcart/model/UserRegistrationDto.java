package com.shoppingcart.model;

import java.util.Set;

import jakarta.validation.constraints.Size;

public class UserRegistrationDto {

	@Size(min = 5,max = 30,message = "Your password '${validatedValue} must be between {min} and {max} characters long")
	private String password;
	@Size(min = 5,max = 15,message = "Your user name  '${validatedValue} must be between {min} and {max} characters long")
	private String username;
	@Size(min = 1, message = "Please provide first name")
	private String firstname;
	@Size(min = 1, message = "Please provide last name")
	private String lastname;
	@Size(min = 5,max = 25,message = "Your email  '${validatedValue} must be between {min} and {max} characters long")
	private String email;
	@Size(min = 5,max = 10,message = "Your role  '${validatedValue} must be between {min} and {max} characters long")
	private Set<String> roles;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	public UserRegistrationDto(
			@Size(min = 5, max = 30, message = "Your password '${validatedValue} must be between {min} and {max} characters long") String password,
			@Size(min = 5, max = 15, message = "Your user name  '${validatedValue} must be between {min} and {max} characters long") String username,
			@Size(min = 1, message = "Please provide first name") String firstname,
			@Size(min = 1, message = "Please provide last name") String lastname,
			@Size(min = 5, max = 25, message = "Your email  '${validatedValue} must be between {min} and {max} characters long") String email,
			@Size(min = 5, max = 10, message = "Your role  '${validatedValue} must be between {min} and {max} characters long") Set<String> roles) {
		super();
		this.password = password;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.roles = roles;
	}
	public UserRegistrationDto() {
		super();
	}
	
}
