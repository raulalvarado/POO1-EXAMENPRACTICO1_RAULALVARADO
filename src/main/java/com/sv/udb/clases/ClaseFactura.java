/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dante
 */
public class ClaseFactura {
    List<Factura> lstcat;

    public ClaseFactura() {
        lstcat = new ArrayList<>();
    }
    
    public boolean AddCate(int num)
    {
        boolean resp = false;
        try
        {
            lstcat.add(new Factura(num));
            resp = true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return resp;
    }
    
    public List<Factura> ObtFact()
    {
        return this.lstcat;
    }
    
    public boolean AddProFact(Factura fact, Producto pro)
    {
        boolean resp = false;
        try
        {
            if(fact != null)
            {
                List<Producto> listTemp = fact.getLstPro(); //Obtiene la de productos
                listTemp.add(pro); //Agrega el producto
                fact.setLstPro(listTemp); //Devuelve la lista con el producto agregado
                resp = true;
            }
        }
        catch (Exception ex) {
            System.err.println("Error al agregar el Producto: " + ex.getMessage());
        }
        return resp;
    }
    
    public double stockCompare(Producto pro)
    {
        double exist=pro.getStock();
        return exist;
    }
            
    
    public boolean ValExists(double pro, double exist )
    {
        boolean resp= false;
        
        try
        {
            if(pro<exist)
            {
                resp= true;
            }
            
        }
        catch(Exception ex)
        {
            System.err.println("Error al agregar el pproducto: " + ex.getMessage());
        }
        return resp;
    }
}
