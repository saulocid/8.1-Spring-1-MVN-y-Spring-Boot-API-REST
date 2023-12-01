package com.SpringApiRest.Tienda.entities;

import java.util.Calendar;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private Long precio;
    private Calendar fechaVto;

    public Product() {
    }

    public Calendar getFechaVto() {
        return fechaVto;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setFechaVto(Calendar fechaVto) {
        this.fechaVto = fechaVto;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nPrecio $" + precio + "\nFecha de Vencimiento: "
                + fechaVto.get(Calendar.DATE);
    }

}
