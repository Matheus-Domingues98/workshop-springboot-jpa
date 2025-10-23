package com.projetoweb.projetospring.repositories;

import com.projetoweb.projetospring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
