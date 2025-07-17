package com.devyunes.dscommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devyunes.dscommerce.dto.UserDTO;
import com.devyunes.dscommerce.entities.User;
import com.devyunes.dscommerce.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public UserDTO findById (Long id) {
		Optional<User> result = repository.findById(id);
		User user = result.get();
		UserDTO dto = new UserDTO(user);
		return dto;
	}
	@Transactional(readOnly = true)
	public Page<UserDTO> findAll(Pageable pageable){
		Page<User> result = repository.findAll(pageable);
		return result.map(x-> new UserDTO(x));
	}
	
	@Transactional
	public UserDTO insert(UserDTO dto) {
		User entity = new User();
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPhone(dto.getPhone());
		entity.setBirthDate(dto.getBirthDate());
		entity.setPassword(dto.getPassword());
		
		entity = repository.save(entity);
		return new UserDTO(entity);
		
	}
	

}
