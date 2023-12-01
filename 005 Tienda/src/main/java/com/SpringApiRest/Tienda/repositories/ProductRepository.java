package com.SpringApiRest.Tienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SpringApiRest.Tienda.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {

    @Query("SELECT p FROM Product p WHERE p.nombre = :opc")
    public Product buscarPorNombre(@Param("opc") String nombre);
    
}
