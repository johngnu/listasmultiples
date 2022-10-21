package listasm;

public class ListaSA {

    private NodoA p;

    ListaSA() {
        p = null;
    }

    public NodoA getP() {
        return p;
    }

    public void setP(NodoA p) {
        this.p = p;
    }

    public void adiFinal(int a, ListaDPA b) {
        NodoA nue = new NodoA();
        nue.setAnio(a);
        nue.setLpa(b);

        if (getP() == null) {
            setP(nue);
        } else {
            NodoA r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nue);
        }
    }

    public void mostrar() {
        NodoA o = getP();
        while (o != null) {
            System.out.println("\nAño: " + o.getAnio());
            o.getLpa().mostrar();
            o = o.getSig();
        }
    }
}
