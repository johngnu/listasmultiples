package laboratorio;

public class ListaSE {

    private NodoE p;

    ListaSE() {
        p = null;
    }

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }

    public void adiFinal(String n) {
        NodoE nuevo = new NodoE();
        nuevo.setNombre(n);

        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoE r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoE o = getP();
        System.out.println("-- LISTA EXPOSITORES :");
        while (o != null) {
            System.out.println("<" + o.getNombre() + ">");
            o = o.getSig();
        }
    }
}
