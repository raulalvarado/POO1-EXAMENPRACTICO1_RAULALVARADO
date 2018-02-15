/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import com.sv.udb.clases.Producto;

/**
 *
 * @author Estudiante
 */
public class ClaseProductos {

    ArrayList<Producto> listProd;

    public ClaseProductos() {
        this.listProd = new ArrayList<>();
    }

    public void agregar(String name, double price, int stock, int minimun) {
        this.listProd.add(new Producto(name, price, stock, minimun));
    }

    public ArrayList<Producto> getTopPrecio()
    {
        ArrayList<Producto> resultp = new ArrayList<>();
        Producto copiaprecio;
        double mayor= 0;
       
        for(Producto prod: listProd)
        {
            if(prod.getPrecio()>0)
            {
                copiaprecio=prod;
                mayor=prod.getPrecio();
                resultp.add(copiaprecio);
            }
                
        }
        return resultp;
        
    }

    }
