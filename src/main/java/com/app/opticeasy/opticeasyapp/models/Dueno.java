package com.app.opticeasy.opticeasyapp.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "dueno")
public class Dueno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDueno;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "dueno", cascade = CascadeType.ALL)
    private List<Licencia> licencias;

    public Dueno() {
    }

    public Dueno(Long idDueno, Usuario usuario, List<Licencia> licencias) {
        this.idDueno = idDueno;
        this.usuario = usuario;
        this.licencias = licencias;
    }

    public Long getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(Long idDueno) {
        this.idDueno = idDueno;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Licencia> getLicencias() {
        return licencias;
    }

    public void setLicencias(List<Licencia> licencias) {
        this.licencias = licencias;
    }



}
