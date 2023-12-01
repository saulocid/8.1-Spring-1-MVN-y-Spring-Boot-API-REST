package com.SpringApiRest.Tienda.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    private Long dni;
    private String nombreCompleto;
    private String eMail;
    private Long telefono;

    public Client() {
    }

    public Long getDni() {
        return dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Long getTelefono() {
        return telefono;
    }

    public String geteMail() {
        return eMail;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + "\nNombre Completo: " + nombreCompleto + "\nE-mail: " + eMail + "\nNúmero de teléfono: "
                + telefono;
    }

}
