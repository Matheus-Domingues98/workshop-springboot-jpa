package com.projetoweb.projetospring.repositories;

import com.projetoweb.projetospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
