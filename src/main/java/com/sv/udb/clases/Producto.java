/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author Raul Alvarado
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private double stock;
    private int minimo;
    private String fecha;

    public Producto() {
    }

    /**
     *
     * @param nombre
     * @param precio
     * @param stock
     * @param minimo
     * @param fecha
     */
    public Producto(String nombre, double precio, double stock, int minimo, String fecha) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock=stock;
        this.minimo = minimo;
        this.fecha=fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
