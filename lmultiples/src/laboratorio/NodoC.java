package laboratorio;

public class NodoC {

    private int nro;
    private String ubiccacion;
    private ListaSE a;
    private ListaDP b;
    private NodoC ant, sig;

    NodoC() {
        ant = sig = null;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getUbiccacion() {
        return ubiccacion;
    }

    public void setUbiccacion(String ubiccacion) {
        this.ubiccacion = ubiccacion;
    }

    public ListaSE getA() {
        return a;
    }

    public void setA(ListaSE a) {
        this.a = a;
    }

    public ListaDP getB() {
        return b;
    }

    public void setB(ListaDP b) {
        this.b = b;
    }

    public NodoC getSig() {
        return sig;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }

    public NodoC getAnt() {
        return ant;
    }

    public void setAnt(NodoC ant) {
        this.ant = ant;
    }

}
