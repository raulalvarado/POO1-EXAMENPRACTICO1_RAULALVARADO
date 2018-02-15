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
public class Factura {
    private int numFact;
    private List<Producto> lstPro;

    public Factura() {
        this.lstPro = new ArrayList<>();
    }

    public Factura(int categ) {
        this.numFact = categ;
        this.lstPro = new ArrayList<>();
    }

    public int getCateg() {
        return numFact;
    }

    public void setCateg(int categ) {
        this.numFact = categ;
    }

    public List<Producto> getLstPro() {
        return lstPro;
    }

    public void setLstPro(List<Producto> lstPro) {
        this.lstPro = lstPro;
    }

    @Override
    public String toString() {
        return  numFact+"";
    }

    
    
    
}
