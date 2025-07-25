package com.devyunes.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devyunes.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
