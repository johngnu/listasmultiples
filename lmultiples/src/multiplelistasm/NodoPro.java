/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplelistasm;

/**
 *
 * @author Carmen Huanca
 */
public class NodoPro {
    private String nombre,tipo,entrega;
    private int precio;
    private NodoPro ant,sig;

    NodoPro()
    {
        ant=sig=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public NodoPro getAnt() {
        return ant;
    }

    public void setAnt(NodoPro ant) {
        this.ant = ant;
    }

    public NodoPro getSig() {
        return sig;
    }

    public void setSig(NodoPro sig) {
        this.sig = sig;
    }
    
}
