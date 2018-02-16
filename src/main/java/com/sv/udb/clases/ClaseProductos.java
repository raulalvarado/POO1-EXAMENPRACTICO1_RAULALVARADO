/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import com.sv.udb.clases.Producto;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Raul Alvarado
 */
public class ClaseProductos {

    ArrayList<Producto> listProd;

    public ClaseProductos() {
        this.listProd = new ArrayList<>();
    }

    public void agregar(String name, double price, double stock, int minimun, String fecha) {
        this.listProd.add(new Producto(name, price, stock, minimun, fecha));
    }

    public ArrayList<Producto> getTopPrecio() {
        ArrayList<Producto> resultp = new ArrayList<>();
        try {
            listProd.sort(Comparator.comparing(Producto::getPrecio).reversed());
            for (int i = 0; i < listProd.size(); i++) {
                if (i < 3) {
                    resultp.add(listProd.get(i));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultp;
    }

    public ArrayList<Producto> getFechaVen() {
        
        ArrayList<Producto> resultp= new ArrayList<>();
        try {
            SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
            resultp.add(listProd.get(0));
            for(Producto producto: listProd)
            {
                Date primerafecha = dateformat.parse(resultp.get(0).getFecha());
                Date segundafecha = dateformat.parse(producto.getFecha());
                if(segundafecha.before(primerafecha))
                {
                    resultp.clear();
                    resultp.add(producto);
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return resultp;
    }
    
    public ArrayList<Producto> existenciaMin()
    {
        ArrayList<Producto> resultp= new ArrayList<>();
        
        for(Producto producto:listProd)
        {
            if(producto.getStock()==producto.getMinimo())
            {
                resultp.add(producto);
            }
        }
        return resultp;
    }
    
    public ArrayList<Producto> ObtPro()
    {
        return this.listProd;
    }

}
