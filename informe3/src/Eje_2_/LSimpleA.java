package Eje_2_;

public class LSimpleA {

    private NodoA p;

    public LSimpleA() {
        p = null;
    }

    public NodoA getP() {
        return p;
    }

    public void setP(NodoA p) {
        this.p = p;
    }

    public boolean esvacia() {
        return p == null;
    }

    public void adiFinal(String anio, LSimpleM m) {
        NodoA nuevo = new NodoA();
        nuevo.setAnio(anio);
        nuevo.setM(m);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoA r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public void adiFinal_2(NodoA nuevo) {
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoA r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public void adiPrincipio(String anio, LSimpleM m) {
        NodoA nuevo = new NodoA();
        nuevo.setAnio(anio);
        nuevo.setM(m);
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
        System.out.println("---------A�os------");
        NodoA r = getP();
        while (r != null) {
            r.mostrar();
            r = r.getSig();
        }
    }

    public void leer2() {
        LSimpleD d1 = new LSimpleD();
        d1.adiFinal(new Atencion("02", "pepita", "gato", "ninguno"));
        d1.adiFinal(new Atencion("08", "roger", "perro", "ninguno"));
        d1.adiFinal(new Atencion("10", "lucas", "gato", "ninguno"));
        d1.adiFinal(new Atencion("15", "rocky", "perro", "ninguno"));
        LSimpleD d2 = new LSimpleD();
        d2.adiFinal(new Atencion("09", "porki", "perro", "ninguno"));
        d2.adiFinal(new Atencion("25", "perla", "perro", "ninguno"));
        d2.adiFinal(new Atencion("25", "lucas", "perro", "ninguno"));
        d2.adiFinal(new Atencion("25", "rocky", "perro", "ninguno"));

        LSimpleM m1 = new LSimpleM();
        m1.adiFinal("10", d1);
        m1.adiFinal("08", d2);

        adiFinal("2020", m1);

        LSimpleD d4 = new LSimpleD();
        d4.adiFinal(new Atencion("02", "pepita", "gato", "ninguno"));
        d4.adiFinal(new Atencion("08", "roger", "gato", "ninguno"));
        d4.adiFinal(new Atencion("10", "lucas", "gato", "ninguno"));
        d4.adiFinal(new Atencion("15", "rocky", "perro", "ninguno"));
        LSimpleD d5 = new LSimpleD();
        d5.adiFinal(new Atencion("10", "porki", "perro", "ninguno"));
        d5.adiFinal(new Atencion("30", "anyi", "perro", "ninguno"));
        d5.adiFinal(new Atencion("01", "lucas", "gato", "ninguno"));
        d5.adiFinal(new Atencion("02", "poly", "perro", "ninguno"));

        LSimpleM m2 = new LSimpleM();
        m2.adiFinal("12", d4);
        m2.adiFinal("11", d5);

        adiFinal("2021", m2);

    }

    public int nroNodos() {
        int c = 0;
        NodoA w = getP();
        while (w != null) {
            c++;
            w = w.getSig();
        }
        return c;
    }

}
