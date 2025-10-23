package com.projetoweb.projetospring.repositories;

import com.projetoweb.projetospring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
