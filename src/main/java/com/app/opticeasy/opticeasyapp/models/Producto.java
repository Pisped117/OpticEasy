package com.app.opticeasy.opticeasyapp.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio_compra")
    private Double precioCompra;
    
    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "stock")
    private int stock;

    @OneToOne(mappedBy = "producto")
    private Montura montura;

    @OneToOne(mappedBy = "producto")
    private Lente lente;

    @OneToMany(mappedBy = "producto")
    private List<DetalleVenta> detalleVentas;

    public Producto() {
    }

    public Producto(Long idProducto, String nombreProducto, String descripcion, Double precioCompra, Double precioVenta,
            int stock, Montura montura, Lente lente, List<DetalleVenta> detalleVentas) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.montura = montura;
        this.lente = lente;
        this.detalleVentas = detalleVentas;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

    public List<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }


}
