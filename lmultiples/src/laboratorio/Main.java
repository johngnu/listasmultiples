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

        lc.mostrar();
        
        // mayor precio
        mayorprecio(lp);
        
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
