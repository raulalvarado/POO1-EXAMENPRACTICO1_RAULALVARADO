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
public class Categoria {
    private String categ;
    private List<Producto> lstPro;

    public Categoria() {
        this.lstPro = new ArrayList<>();
    }

    public Categoria(String categ) {
        this.categ = categ;
        this.lstPro = new ArrayList<>();
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public List<Producto> getLstPro() {
        return lstPro;
    }

    public void setLstPro(List<Producto> lstPro) {
        this.lstPro = lstPro;
    }

    @Override
    public String toString() {
        return categ;
    }
    
    
}
