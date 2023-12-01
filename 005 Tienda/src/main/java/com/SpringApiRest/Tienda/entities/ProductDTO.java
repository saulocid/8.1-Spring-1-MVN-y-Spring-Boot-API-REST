package com.SpringApiRest.Tienda.entities;

import java.util.Calendar;

public class ProductDTO {
    
    private String id;
    private String nombre;
    private Long precio;
    private Calendar fechaVto;

    public ProductDTO() {
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

}
