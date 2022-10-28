package pturisticos;

public class LDCircularDV {

    private NodoDV p;

    LDCircularDV() {
        p = null;
    }

    public NodoDV getP() {
        return p;
    }

    public void setP(NodoDV p) {
        this.p = p;
    }

    public void adiFinal(LSimpleA a) {
        NodoDV nuevo = new NodoDV(a);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoDV r = getP();
            while (r.getSig() != getP()) {
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
        getP().setAnt(nuevo);
        nuevo.setSig(getP());
    }

    public void adiPrincipio(LSimpleA a) {
        NodoDV nuevo = new NodoDV(a);
        if (getP() == null) {
            setP(nuevo);
            nuevo.setSig(getP());
            nuevo.setAnt(getP());
        } else {
            NodoDV r = getP();
            while (r.getSig() != getP()) {
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setSig(getP());
            getP().setAnt(nuevo);
            nuevo.setAnt(r);
            setP(nuevo);
        }
    }

    public void leer2(int n) {
        for (int i = 1; i <= n; i++) {

        }
    }

    public void leer1(int n) {
        for (int i = 1; i <= n; i++) {

        }
    }

    public void mostrar() {
        if (getP() != null) {
            System.out.println("Actividades : ");
            NodoDV r = getP();//null
            while (r.getSig() != getP()) {
                r.mostrar();
                r = r.getSig();
            }
            r.mostrar();
        } else {
            System.out.println("Lista vacia");
        }
    }

    public int nroNodos() {
        int c = 0;
        if (getP() != null) {
            NodoDV r = getP();
            while (r.getSig() != getP()) {
                c++;
                r = r.getSig();
            }
            c++;
        }
        return c;
    }

    public void leer2() {

    }
}
