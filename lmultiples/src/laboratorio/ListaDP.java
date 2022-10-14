package laboratorio;

public class ListaDP {

    private NodoP p;

    ListaDP() {
        p = null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }

    public void adiFinal(String a, int b) {
        NodoP nue = new NodoP();
        nue.setNombre(a);
        nue.setPrecio(b);

        if (getP() == null) {
            setP(nue);
        } else {
            NodoP r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nue);
            nue.setAnt(r);
        }
    }

    public void mostrar() {
        NodoP o = getP();
        while (o != null) {
            System.out.println("\nNombre: " + o.getNombre() + ", precio: " + o.getPrecio());
            o = o.getSig();
        }
    }
}
