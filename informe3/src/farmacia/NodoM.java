package farmacia;

public class NodoM {

    private Medicamento m;
    private NodoM sig;

    public NodoM() {
        // TODO Auto-generated constructor stub
    }

    public NodoM(Medicamento m) {
        super();
        this.m = m;
    }

    public Medicamento getM() {
        return m;
    }

    public void setM(Medicamento m) {
        this.m = m;
    }

    public NodoM getSig() {
        return sig;
    }

    public void setSig(NodoM sig) {
        this.sig = sig;
    }

}
