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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "montura")
public class Montura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMontura;

    @Column(name = "modelo")
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "IdMarcaMontura")
    private MarcaMontura marcaMontura;

    @OneToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @OneToMany(mappedBy = "montura", cascade = CascadeType.ALL)
    private List<LentesMonturas> lentesMonturas;

    public Montura() {
    }

    public Montura(Long idMontura, String modelo, MarcaMontura marcaMontura, Producto producto,
            List<LentesMonturas> lentesMonturas) {
        this.idMontura = idMontura;
        this.modelo = modelo;
        this.marcaMontura = marcaMontura;
        this.producto = producto;
        this.lentesMonturas = lentesMonturas;
    }

    public Long getIdMontura() {
        return idMontura;
    }

    public void setIdMontura(Long idMontura) {
        this.idMontura = idMontura;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public MarcaMontura getMarcaMontura() {
        return marcaMontura;
    }

    public void setMarcaMontura(MarcaMontura marcaMontura) {
        this.marcaMontura = marcaMontura;
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
