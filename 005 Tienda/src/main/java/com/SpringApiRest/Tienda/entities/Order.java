package com.SpringApiRest.Tienda.entities;

import java.util.Calendar;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Order {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private Calendar fecha;
    private Client cliente;

    public Order() {
    }

    public Client getCliente() {
        return cliente;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public String getId() {
        return id;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nFecha: " + fecha.get(Calendar.DATE) + "\nCliente: " + cliente.getNombreCompleto();
    }

}
