package Eje_2_;

public class NodoA {

    private String anio;
    private LSimpleM m;
    private NodoA sig;

    public NodoA() {
        // TODO Auto-generated constructor stub
    }

    public NodoA(String anio, LSimpleM m) {
        super();
        this.anio = anio;
        this.m = m;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public LSimpleM getM() {
        return m;
    }

    public void setM(LSimpleM m) {
        this.m = m;
    }

    public NodoA getSig() {
        return sig;
    }

    public void setSig(NodoA sig) {
        this.sig = sig;
    }

    public void mostrar() {
        System.out.println("NodoA [año=" + anio + "]");
        m.mostrar();
    }

}
