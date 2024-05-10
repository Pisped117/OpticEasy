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
@Table(name = "tipo_documento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoDocumento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "sigla")
    private char sigla;

    @OneToMany(mappedBy = "tipoDocumento", cascade = CascadeType.ALL)
    private List<Persona> personas;

    public TipoDocumento() {
    }

    public TipoDocumento(Long idTipoDocumento, String nombre, char sigla, List<Persona> personas) {
        this.idTipoDocumento = idTipoDocumento;
        this.nombre = nombre;
        this.sigla = sigla;
        this.personas = personas;
    }

    public Long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSigla() {
        return sigla;
    }

    public void setSigla(char sigla) {
        this.sigla = sigla;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    
    
}
