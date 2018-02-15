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
    private int stock;
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
     */
    public Producto(String nombre, double precio, int stock, int minimo) {
        this.nombre = nombre;
        this.precio = precio;
        this.minimo = minimo;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }
}
