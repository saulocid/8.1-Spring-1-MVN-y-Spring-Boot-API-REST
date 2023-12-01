package com.SpringApiRest.Tienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringApiRest.Tienda.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,String> {
    
}
