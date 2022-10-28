package farmacia;

public class LSimpleM {

    private NodoM p;

    public LSimpleM() {
        p = null;
    }

    public NodoM getP() {
        return p;
    }

    public void setP(NodoM p) {
        this.p = p;
    }

    public boolean esvacia() {
        return p == null;
    }

    public void adiFinal(Medicamento a) {
        NodoM nuevo = new NodoM();
        nuevo.setM(a);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoM r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public void adiFinal_2(NodoM nuevo) {
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoM r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public void adiPrincipio(Medicamento a) {
        NodoM nuevo = new NodoM();
        nuevo.setM(a);
        if (getP() == null) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
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
        System.out.println("---------Medicamentos------");
        NodoM r = getP();
        while (r != null) {
            r.getM().mostrar();
            r = r.getSig();
        }
    }

    public void leer2() {

    }

    public int nroNodos() {
        int c = 0;
        NodoM w = getP();
        while (w != null) {
            c++;
            w = w.getSig();
        }
        return c;
    }

}
