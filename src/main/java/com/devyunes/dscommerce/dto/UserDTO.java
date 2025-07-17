package com.devyunes.dscommerce.dto;

import java.time.LocalDate;

import com.devyunes.dscommerce.entities.User;
import com.fasterxml.jackson.annotation.JsonFormat;


public class UserDTO {

	private Long id;
	private String name;
	private String email;
	private String phone;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate birthDate;
	private String password;
	
	public UserDTO() {
	}
	
	public UserDTO(Long id, String name, String email, String phone, LocalDate birthDate, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.birthDate = birthDate;
		this.password = password;
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		phone = entity.getPhone();
		birthDate = entity.getBirthDate();
		password = entity.getPassword();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getPassword() {
		return password;
	}
	
	
	
	
	
}
