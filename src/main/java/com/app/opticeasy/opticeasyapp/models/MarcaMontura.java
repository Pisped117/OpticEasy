package com.app.opticeasy.opticeasyapp.models;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "marca_montura")
public class MarcaMontura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdMarcaMontura;

    @Column(name = "nombre_marca_montura")
    private String nombre;

    @OneToMany(mappedBy = "marcaMontura", cascade = CascadeType.ALL)
    private List<Montura> monturas;

    public MarcaMontura() {
    }

    public MarcaMontura(Long idMarcaMontura, String nombre, List<Montura> monturas) {
        IdMarcaMontura = idMarcaMontura;
        this.nombre = nombre;
        this.monturas = monturas;
    }

    public Long getIdMarcaMontura() {
        return IdMarcaMontura;
    }

    public void setIdMarcaMontura(Long idMarcaMontura) {
        IdMarcaMontura = idMarcaMontura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Montura> getMonturas() {
        return monturas;
    }

    public void setMonturas(List<Montura> monturas) {
        this.monturas = monturas;
    }

    
}
