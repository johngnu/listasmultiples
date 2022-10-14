/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplelistasm;

/**
 *
 * @author Carmen Huanca
 */
public class MultipleListasM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa e1 = new Empresa("emp1", "grande", "Nacional");
        Empresa e5 = new Empresa("emp2", "microempresa", "Nacional");
        Empresa e2 = new Empresa("emp3", "pequena", "Nacional");
        Empresa e4 = new Empresa("emp4", "mediana", "Local");
        Empresa e3 = new Empresa("emp5", "grande", "Interacional");

        LSimplePer lp1 = new LSimplePer();
        lp1.adiFinal("juan", "promotor");
        lp1.adiFinal("lucy", "ventas");
        lp1.adiFinal("maria", "caja");

        LSimplePer lp2 = new LSimplePer();
        lp2.adiFinal("rene", "ventas");
        lp2.adiFinal("rocio", "ventas");

        LSimplePer lp3 = new LSimplePer();
        lp3.adiFinal("ana", "promotora");
        lp3.adiFinal("maria", "caja");

        LDoblePro pr1 = new LDoblePro();
        pr1.adiFinal("prod1", "tipo1", "entr1", 20);
        pr1.adiFinal("prod2", "tipo1", "entr1", 70);
        pr1.adiFinal("prod4", "tipo3", "entr1", 45);

        LDoblePro pr2 = new LDoblePro();
        pr2.adiFinal("prod11", "tipo21", "entr31", 50);
        pr2.adiFinal("prod22", "tipo31", "entr31", 35);

        LDoblePro pr3 = new LDoblePro();
        pr3.adiFinal("prod41", "tipo41", "entr41", 10);
        //pr3.adiFinal("prod42", "tipo41", "entr41", 30);

        LSimpleSta ls = new LSimpleSta();
        ls.adiFinal(30, e1, lp1, pr1);
        ls.adiFinal(21, e3, lp3, pr3);
        ls.adiFinal(44, e5, lp2, pr2);

        ls.mostrar();
        //MOSTRAR EL NUMERO DE STAND DONDE SE ENCUENTRA LA 
        //EMPRESA CON NOMBRE X
        busca(ls, "emp2");
        // AGREGAR UN NUEVO PRODCTO A LA EMPRESA CON NOMBRE X
        agrega(ls, "emp2");
        ls.mostrar();
        // AGREGAR UN NUEVO PRODCTO A LA EMPRESA CON NOMBRE X
        // despues del i-esimo producto
        agrega2(ls, "emp2", 1);
        ls.mostrar();
        //ELIMINAR EL PRIMER PRODUCTO DE CADA EMPRESA
        eliminar(ls);
        ls.mostrar();
    }

    public static void eliminar(LSimpleSta a) {
        NodoSta z = a.getP();
        while (z != null) {
            z.getB().setP(z.getB().getP().getSig());
            if (z.getB().getP() != null) {
                z.getB().getP().setAnt(null);
            }
            z = z.getSig();
        }
    }

    public static void agrega2(LSimpleSta a, String x, int i) {
        NodoSta z = a.getP();
        while (z != null) {
            if (z.getE().getNombre().equals(x)) {
                int c = 0;
                NodoPro r = z.getB().getP();
                while (r != null) {
                    c++;
                    if (c == i) {
                        NodoPro nue = new NodoPro();
                        nue.setNombre("nuenue");
                        nue.setTipo("nueTip");
                        nue.setEntrega("nueEnt");
                        nue.setPrecio(5);
                        NodoPro r2 = r.getSig();
                        r.setSig(nue);
                        nue.setAnt(r);
                        nue.setSig(r2);
                        if (r2 != null) {
                            r2.setAnt(nue);
                        }

                    }
                    r = r.getSig();
                }
            }
            z = z.getSig();
        }
    }

    public static void agrega(LSimpleSta a, String x) {
        NodoSta z = a.getP();
        while (z != null) {
            if (z.getE().getNombre().equals(x)) {
                z.getB().adiFinal("nue", "nueT", "nueE", 100);
            }
            z = z.getSig();
        }
    }

    public static void busca(LSimpleSta a, String x) {
        NodoSta w = a.getP();
        while (w != null) {
            if (w.getE().getNombre().equals(x)) {
                System.out.println("\nSTAND : " + w.getNroStand());
            }
            w = w.getSig();
        }
    }

}
