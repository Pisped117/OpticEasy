package com.app.opticeasy.opticeasyapp.models;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerfil;

    @Column(name = "nombre_perfil")
    private String nombrePerfil;

    @Column(name = "descripcion_rol")
    private String descripcion;

    @ManyToMany(mappedBy = "perfiles")
    private List<Usuario> usuarios;

    public Perfil() {
    }

    public Perfil(Long idPerfil, String nombrePerfil, String descripcion, List<Usuario> usuarios) {
        this.idPerfil = idPerfil;
        this.nombrePerfil = nombrePerfil;
        this.descripcion = descripcion;
        this.usuarios = usuarios;
    }

    public Long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    
}
