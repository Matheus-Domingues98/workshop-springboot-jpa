package com.projetoweb.projetospring.repositories;

import com.projetoweb.projetospring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
