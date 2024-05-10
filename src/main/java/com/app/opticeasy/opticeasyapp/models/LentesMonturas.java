package com.app.opticeasy.opticeasyapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lentes_monturas")
public class LentesMonturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLentesMonturas;

    @ManyToOne
    @JoinColumn(name = "id_montura")
    private Montura montura;

    @ManyToOne
    @JoinColumn(name = "id_lente")
    private Lente lente;

    public LentesMonturas() {
    }

    public LentesMonturas(Long idLentesMonturas, Montura montura, Lente lente) {
        this.idLentesMonturas = idLentesMonturas;
        this.montura = montura;
        this.lente = lente;
    }

    public Long getIdLentesMonturas() {
        return idLentesMonturas;
    }

    public void setIdLentesMonturas(Long idLentesMonturas) {
        this.idLentesMonturas = idLentesMonturas;
    }

    public Montura getMontura() {
        return montura;
    }

    public void setMontura(Montura montura) {
        this.montura = montura;
    }

    public Lente getLente() {
        return lente;
    }

    public void setLente(Lente lente) {
        this.lente = lente;
    }

    
}
