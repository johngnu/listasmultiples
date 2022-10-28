package farmacia;

public class LDobleF {

    private NodoF p;

    public LDobleF() {
        p = null;
    }

    public NodoF getP() {
        return p;
    }

    public void setP(NodoF p) {
        this.p = p;
    }

    public void adiprincipio(Farmacia f) {
        NodoF nuevo = new NodoF(f);
        if (getP() == null) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            getP().setAnt(nuevo);
            setP(nuevo);
        }
    }

    public void adifinal(Farmacia f) {
        NodoF nuevo = new NodoF(f);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoF r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }

    public int nroNodos() {
        NodoF r = getP();
        int cont = 0;
        while (r != null) {
            cont++;
            r = r.getSig();
        }
        return cont;
    }

    public void mostrar() {
        System.out.println("-----------FARMACIAS------------ ");
        NodoF z = getP();
        while (z != null) {
            z.getF().mostrar();
            z = z.getSig();
        }
    }

    public void leer() {
        LSimpleM m1 = new LSimpleM();
        m1.adiFinal(new Medicamento("aspirina", "laser", 22));
        m1.adiFinal(new Medicamento("simvastatina", "amug", 23));
        m1.adiFinal(new Medicamento("omeprazol", "cofar", 12));
        m1.adiFinal(new Medicamento("ibuprofeno", "laser", 0));
        adifinal(new Farmacia("Bolivia", "Av. Franco", "Lopez", m1));
        LSimpleM m2 = new LSimpleM();
        m2.adiFinal(new Medicamento("lexotina", "laser", 22));
        m2.adiFinal(new Medicamento("ramipril", "novart", 23));
        m2.adiFinal(new Medicamento("lexotiroxina", "cofar", 12));
        m2.adiFinal(new Medicamento("amdopicina", "jasen", 0));
        adifinal(new Farmacia("Soledad", "Av. Franco", "Lopez", m2));
        LSimpleM m3 = new LSimpleM();
        m3.adiFinal(new Medicamento("paracetamol", "laser", 22));
        m3.adiFinal(new Medicamento("ramipril", "novart", 23));
        m3.adiFinal(new Medicamento("lexotiroxina", "cofar", 12));
        m3.adiFinal(new Medicamento("aspirina", "jasen", 0));
        adifinal(new Farmacia("Cruz Mar", "Av. Franco", "Lopez", m3));

    }
}
