package com.app.opticeasy.opticeasyapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Long idDetalleVenta;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "subtotal")
    private Double subtotal;

    @ManyToOne
    @JoinColumn(name = "id_ventas")
    private Ventas ventas;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    public DetalleVenta() {
    }

    public DetalleVenta(Long idDetalleVenta, int cantidad, Double subtotal, Ventas ventas, Producto producto) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.ventas = ventas;
        this.producto = producto;
    }

    public Long getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(Long idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Ventas getVentas() {
        return ventas;
    }

    public void setVentas(Ventas ventas) {
        this.ventas = ventas;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
}
