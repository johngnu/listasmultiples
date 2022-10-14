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
public class NodoPer {
    private String nombre,cargo;
    private NodoPer sig;
    
    NodoPer()
    {
        sig=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public NodoPer getSig() {
        return sig;
    }

    public void setSig(NodoPer sig) {
        this.sig = sig;
    }
    

    
}
