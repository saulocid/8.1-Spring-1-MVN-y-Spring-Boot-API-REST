package com.SpringApiRest.Tienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SpringApiRest.Tienda.entities.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client,Long>{
    
    @Query("SELECT c FROM Client c WHERE c.nombreCompleto = :opc")
    public Client buscarPorNombre(@Param("opc") String nombreCompleto);

}
