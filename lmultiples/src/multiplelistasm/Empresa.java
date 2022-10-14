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
public class Empresa {
    private String nombre,tamano,tipo;
    Empresa(String a, String b, String c){
        nombre=a;
        tamano=b;
        tipo=c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void mostrar()
    {
        System.out.println("\nEMPRESA:"+nombre+" "+tamano+" "+tipo);
        
    }
}
