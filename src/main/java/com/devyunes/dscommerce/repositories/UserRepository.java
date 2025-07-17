package com.devyunes.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devyunes.dscommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
