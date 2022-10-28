package farmacia;

public class NodoF {

    private Farmacia f;
    private NodoF ant, sig;

    public NodoF() {
        // TODO Auto-generated constructor stub
    }

    public NodoF(Farmacia f) {
        super();
        this.f = f;
    }

    public Farmacia getF() {
        return f;
    }

    public void setF(Farmacia f) {
        this.f = f;
    }

    public NodoF getAnt() {
        return ant;
    }

    public void setAnt(NodoF ant) {
        this.ant = ant;
    }

    public NodoF getSig() {
        return sig;
    }

    public void setSig(NodoF sig) {
        this.sig = sig;
    }

}
