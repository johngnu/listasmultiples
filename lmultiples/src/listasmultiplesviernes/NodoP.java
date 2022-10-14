/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasmultiplesviernes;

/**
 *
 * @author Carmen Huanca
 */
public class NodoP {
    private String nombre;
    private int precioUnit;
    private NodoP sig;
    
    NodoP()
    {
        sig=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(int precioUnit) {
        this.precioUnit = precioUnit;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
    
}
