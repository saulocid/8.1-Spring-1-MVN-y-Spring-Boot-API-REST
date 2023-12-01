package com.SpringApiRest.Tienda.entities;

import java.util.Calendar;

public class OrderDTO {
    
    private String id;
    private Calendar fecha;
    private ClientDTO cliente;

    public OrderDTO() {
    }

    public ClientDTO getCliente() {
        return cliente;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public String getId() {
        return id;
    }

    public void setCliente(ClientDTO cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setId(String id) {
        this.id = id;
    }

}
