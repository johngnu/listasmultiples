package laboratorio;

public class ListaDC {

    private NodoC p;

    ListaDC() {
        p = null;
    }

    public NodoC getP() {
        return p;
    }

    public void setP(NodoC p) {
        this.p = p;
    }

    public void adiFinal(int n, String u, ListaSE a, ListaDP b) {
        NodoC nue = new NodoC();
        nue.setNro(n);
        nue.setUbiccacion(u);
        nue.setA(a);
        nue.setB(b);

        if (getP() == null) {
            setP(nue);
        } else {
            NodoC r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nue);
            nue.setAnt(r);
        }
    }

    public void mostrar() {
        NodoC o = getP();
        while (o != null) {
            System.out.println("\nNro: " + o.getNro() + ", ubicacion: " + o.getUbiccacion());
            o.getA().mostrar();
            o.getB().mostrar();
            o = o.getSig();
        }
    }
}
