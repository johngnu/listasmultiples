package listasm;

public class NodoA {

    private int anio;
    private ListaDPA lpa;
    private NodoA sig;

    NodoA() {
        sig = null;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ListaDPA getLpa() {
        return lpa;
    }

    public void setLpa(ListaDPA lpa) {
        this.lpa = lpa;
    }

    public NodoA getSig() {
        return sig;
    }

    public void setSig(NodoA sig) {
        this.sig = sig;
    }

}
