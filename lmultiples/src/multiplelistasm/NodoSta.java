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
public class NodoSta {
    private int nroStand;
    private Empresa e;
    private LSimplePer a;
    private LDoblePro b;
    private NodoSta sig;

    NodoSta(){
        sig=null;
    }

    public int getNroStand() {
        return nroStand;
    }

    public void setNroStand(int nroStand) {
        this.nroStand = nroStand;
    }

    public Empresa getE() {
        return e;
    }

    public void setE(Empresa e) {
        this.e = e;
    }

    public LSimplePer getA() {
        return a;
    }

    public void setA(LSimplePer a) {
        this.a = a;
    }

    public LDoblePro getB() {
        return b;
    }

    public void setB(LDoblePro b) {
        this.b = b;
    }

    public NodoSta getSig() {
        return sig;
    }

    public void setSig(NodoSta sig) {
        this.sig = sig;
    }
    
    
}
