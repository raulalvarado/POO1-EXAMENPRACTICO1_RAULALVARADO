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
public class ClaseCategoria {
    List<Categoria> lstcat;

    public ClaseCategoria() {
        lstcat = new ArrayList<>();
    }
    
    public boolean AddCate(String nomb)
    {
        boolean resp = false;
        try
        {
            lstcat.add(new Categoria(nomb));
            resp = true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return resp;
    }
    
    public List<Categoria> ObtCate()
    {
        return this.lstcat;
    }
    
    public boolean AddProCat(Categoria cat, Producto pro)
    {
        boolean resp = false;
        try
        {
            if(cat != null)
            {
                List<Producto> listTemp = cat.getLstPro(); //Obtiene la lista de jugadores
                listTemp.add(pro); //Agrega el jugador
                cat.setLstPro(listTemp); //Devuelve la lista con el jugador agregado
                resp = true;
            }
        }
        catch (Exception ex) {
            System.err.println("Error al agregar el Producto: " + ex.getMessage());
        }
        return resp;
    }
}
