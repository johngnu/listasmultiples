package laboratorio;

public class Main {

    public static void main(String[] args) {
        // productos 
        ListaDP lp = new ListaDP();
        lp.adiFinal("p1", 5);
        lp.adiFinal("p2", 10);
        lp.adiFinal("p3", 15);
        //lp.mostrar();

        // expositores
        ListaSE le = new ListaSE();
        le.adiFinal("juan");
        le.adiFinal("oscar");
        le.adiFinal("ana");
        //le.mostrar();

        // carpas 
        ListaSC lc = new ListaSC();
        lc.adiFinal(1, "ubic 1", le, lp);

        //lc.mostrar();
        // mayor precio
        //mayorprecio(lp);
        //ejercicio2(lc, 1);
        ejercicio3(lc, "juan");

    }

    public static void ejercicio3(ListaSC a, String x) {
        NodoC r = a.getP();
        while (r != null) {
            NodoE o = r.getA().getP();
            while (o != null) {
                if (o.getNombre().equals(x)) {
                    System.out.println("Carpa: " + r.getNro());
                }
                o = o.getSig();
            }
            r = r.getSig();
        }
    }

    public static void ejercicio2(ListaSC a, int x) {
        NodoC r = a.getP();
        while (r != null) {
            if (r.getNro() == x) {
                System.out.println("Carpa: " + r.getNro());
                r.getB().mostrar();
                r.getB();
            }
            r = r.getSig();
        }
    }

    public static void ejercicio4(ListaSC a) {
        NodoC r = a.getP();
        while (r != null) {
            System.out.println("Carpa: " + r.getNro());
            mayorprecio(r.getB());
            r = r.getSig();
        }
    }

    public static void mayorprecio(ListaDP a) {
        int may = 0;
        NodoP r = a.getP();
        System.out.println("producto de mayor precio: ");
        while (r != null) {
            if (r.getPrecio() > may) {
                may = r.getPrecio();
            }
            r = r.getSig();
        }
        r = a.getP();
        while (r != null) {
            if (r.getPrecio() == may) {
                System.out.println("\t" + r.getNombre());
            }
            r = r.getSig();
        }
    }

}
