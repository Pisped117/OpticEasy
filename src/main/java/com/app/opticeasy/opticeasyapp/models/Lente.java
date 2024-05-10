package com.app.opticeasy.opticeasyapp.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lente")
public class Lente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLente;

    @Column(name = "tipo_lente")
    private String tipoLente;

    @Column(name = "material")
    private String material;

    @OneToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @OneToMany(mappedBy = "lente", cascade = CascadeType.ALL)
    private List<LentesMonturas> lentesMonturas;


    public Lente() {
    }

    public Lente(Long idLente, String tipoLente, String material, Producto producto,
            List<LentesMonturas> lentesMonturas) {
        this.idLente = idLente;
        this.tipoLente = tipoLente;
        this.material = material;
        this.producto = producto;
        this.lentesMonturas = lentesMonturas;
    }

    public Long getIdLente() {
        return idLente;
    }

    public void setIdLente(Long idLente) {
        this.idLente = idLente;
    }

    public String getTipoLente() {
        return tipoLente;
    }

    public void setTipoLente(String tipoLente) {
        this.tipoLente = tipoLente;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<LentesMonturas> getLentesMonturas() {
        return lentesMonturas;
    }

    public void setLentesMonturas(List<LentesMonturas> lentesMonturas) {
        this.lentesMonturas = lentesMonturas;
    }


}
