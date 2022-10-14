/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasmultiplesviernes;

/**
 *
 * @author Carmen Huanca
 */
public class ListasMultiplesViernes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LSimpleP p1 = new LSimpleP();
        p1.adiFinal("pr1", 10);
        p1.adiFinal("pr2", 35);
        p1.adiFinal("pr3", 5);
        p1.adiFinal("pr4", 27);

        LSimpleP p2 = new LSimpleP();
        p2.adiFinal("pr21", 10);
        p2.adiFinal("pr22", 35);
        p2.adiFinal("pr23", 5);
        p2.adiFinal("pr24", 27);

        LSimpleP p3 = new LSimpleP();
        p3.adiFinal("pr31", 10);
        p3.adiFinal("pr32", 35);
        p3.adiFinal("pr33", 5);
        p3.adiFinal("pr34", 27);

        LDoblePu A = new LDoblePu();
        A.adiFinal(1, 11, 111, "Pedro", p1);
        A.adiFinal(2, 11, 115, "Maria", p2);
        A.adiFinal(1, 12, 110, "Lucy", p3);
        A.mostrar();
        // agregar un nuevo producto al puesto del expositor X
        busca(A, "Lucy", "prodNue", 100);
        A.mostrar();
        busca2(A, "Lucy", "prodNue2", 1000);
        A.mostrar();
    }

    public static void busca(LDoblePu a, String b, String c, int d) {
        NodoPu r = a.getP();
        while (r != null) {
            if (r.getNomExpositor().equals(b)) {
                r.getLp().adiFinal(c, d);
            }
            r = r.getSig();
        }
    }

    public static void busca2(LDoblePu a, String b, String c, int d) {
        NodoPu r = a.getP();
        while (r != null) {
            if (r.getNomExpositor().equals(b)) {
                NodoP r2 = r.getLp().getP();
                while (r2.getSig().getSig() != null) {
                    r2 = r2.getSig();

                }
                NodoP nue = new NodoP();
                nue.setNombre(c);
                nue.setPrecioUnit(d);
                nue.setSig(r2.getSig());
                r2.setSig(nue);
            }
            r = r.getSig();
        }
    }

}
