package com.app.opticeasy.opticeasyapp.models;


import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoDocumento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "sigla", length = 4)
    private String sigla;

    @OneToMany(mappedBy = "tipoDocumento", cascade = CascadeType.ALL)
    private List<Persona> personas;

    public TipoDocumento() {
    }

    public TipoDocumento(Long idTipoDocumento, String nombre, String sigla, List<Persona> personas) {
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" +
                "idTipoDocumento=" + idTipoDocumento +
                ", nombre='" + nombre + '\'' +
                ", sigla='" + sigla + '\'' +
                //", personas=" + personas +
                '}';
    }
}
