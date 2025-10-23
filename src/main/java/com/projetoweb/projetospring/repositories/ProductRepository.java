package com.projetoweb.projetospring.repositories;

import com.projetoweb.projetospring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
