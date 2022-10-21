package listasm;

public class ListaDPA {

    private NodoPA p;

    ListaDPA() {
        p = null;
    }

    public NodoPA getP() {
        return p;
    }

    public void setP(NodoPA p) {
        this.p = p;
    }

    public void adiFinal(int a, int b, int c) {
        NodoPA nue = new NodoPA();
        nue.setIdTipo(a);
        nue.setIdRango(b);
        nue.setNroVehiculos(c);

        if (getP() == null) {
            setP(nue);
        } else {
            NodoPA r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nue);
            nue.setAnt(r);
        }
    }

    public void mostrar() {
        NodoPA o = getP();
        while (o != null) {
            System.out.println("\nidTipo: " + o.getIdTipo() + ", idRango: " + o.getIdRango() + ", nroVehiculos: " + o.getNroVehiculos());
            o = o.getSig();
        }
    }
}
