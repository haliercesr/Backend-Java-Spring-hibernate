//en la carpeta entities representan los objetos y encapsulan los datos y comportamientos de esos objetos que luego van a ser mapeados con la base de datos
package com.cesarhalier.apirest.apirest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // este decorador le dice a java quee esta clase es de tipo entidad
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gerecaion automatica de id autoincrementales
    private Long id;
    private String nombre;
    private double precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
