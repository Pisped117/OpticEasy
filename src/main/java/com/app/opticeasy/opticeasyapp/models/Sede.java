package com.app.opticeasy.opticeasyapp.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "sede")
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSede;

    @Column(name = "nombre_sede")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "id_localidad")
    private Localidad localidad;

    @OneToMany(mappedBy = "sede", cascade = CascadeType.ALL)
    private List<Ventas> ventas;

    public Sede() {
    }

    public Sede(Long idSede, String nombre, String direccion, Localidad localidad, List<Ventas> ventas) {
        this.idSede = idSede;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.ventas = ventas;
    }

    public Long getIdSede() {
        return idSede;
    }

    public void setIdSede(Long idSede) {
        this.idSede = idSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }

    
}
