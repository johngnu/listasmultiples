package pturisticos;

public class Main {

    public static void main(String[] args) {
        LDobleDT dt = new LDobleDT();
        dt.leer();
        dt.mostrar();
        LSCircularC c = new LSCircularC();
        c.leer2();
        c.mostrar();
        PilaPaquetesTuristicos pt = new PilaPaquetesTuristicos();
        pt.llenar2();
        pt.mostrar();
        //a. De cada cliente mostrar el total gastado en la compra de paquetes turisticos.
//		SolucionA(c,p,d);
        //b. De todos los paquetes turisticos con destino tur�stico X, mostrar al guia turistico que estuvo a cargo 
        //de mas actividades durante el año.
//		SolucionB(p,"coroico",d);
        //c. Contar todas las ventas efectuadas a un cliente que sobrepasen los 800Bs
        SolucionC(pt, dt, 800);

    }

    private static void SolucionA(LSCircularC c, PilaPaquetesTuristicos p, LDobleDT d) {
        NodoC c1 = c.getP();
        if (c1 != null) {
            while (c1.getSig() != c.getP()) {
                System.out.println("Cliente: " + c1.getNombre() + " Total: " + total(c1.getCi(), p, d));
                c1 = c1.getSig();
            }
            System.out.println("Cliente: " + c1.getNombre() + " Total: " + total(c1.getCi(), p, d));
        } else {
            System.out.println("Lista Vacia");
        }
    }

    private static int total(String ci, PilaPaquetesTuristicos pt, LDobleDT dt) {
        PilaPaquetesTuristicos aux = new PilaPaquetesTuristicos();
        int cont = 0;
        while (!pt.esvacia()) {
            PaqueteTuristico x = pt.eliminar();
            if (x.getCi().equals(ci)) {
                cont = cont + precioPaquete(x.getCodDestino(), dt);
            }
            aux.adicionar(x);
        }
        pt.vaciar(aux);
        return cont;
    }

    private static int precioPaquete(String codDestino, LDobleDT d) {
        NodoD d1 = d.getP();
        while (d1 != null) {
            if (d1.getCodDestino().equals(codDestino)) {
                return d1.getCosto();
            }
            d1 = d1.getSig();
        }
        return 0;
    }

    
    private static void SolucionB(PilaPaquetesTuristicos p, String x, LDobleDT d) {
        PilaPaquetesTuristicos aux = new PilaPaquetesTuristicos();
        while (!p.esvacia()) {
            PaqueteTuristico pt = p.eliminar();
            if (verificaDestino(x, pt.getCodDestino(), d)) {
                System.out.println("Paquete: " + pt.getCodDestino());
                guiaConMayorActividad(pt.getDv(), pt.getG());
            }
            aux.adicionar(pt);
        }
        p.vaciar(aux);
    }

    private static boolean verificaDestino(String x, String codDestino, LDobleDT d) {
        NodoD d1 = d.getP();
        while (d1 != null) {
            if (d1.getCodDestino().equals(codDestino) && d1.getNombre().equals(x)) {
                return true;
            }
            d1 = d1.getSig();
        }
        return false;
    }

    private static void guiaConMayorActividad(LDCircularDV dv, LSimpleG g) {
        int may = buscarMayorCantidad(dv, g);
        NodoG g1 = g.getP();
        while (g1 != null) {
            if (contarViajesPorGuia(g1.getCodGuia(), dv) == may) {
                g1.mostrar();
            }
            g1 = g1.getSig();
        }
    }

    private static int buscarMayorCantidad(LDCircularDV dv, LSimpleG g) {
        int mayor = 0;
        NodoG g1 = g.getP();
        while (g1 != null) {
            int n = contarViajesPorGuia(g1.getCodGuia(), dv);
            if (n > mayor) {
                mayor = n;
            }
            g1 = g1.getSig();
        }
        return mayor;
    }
    
    private static int contarViajesPorGuia(String codGuia, LDCircularDV dv) {
        int cont = 0;
        NodoDV d1 = dv.getP();
        if (d1 != null) {
            while (d1.getSig() != dv.getP()) {
                NodoA a1 = d1.getLa().getP();
                while (a1 != null) {
                    if (a1.getCodGuia().equals(codGuia)) {
                        cont++;
                    }
                    a1 = a1.getSig();
                }
                d1 = d1.getSig();
            }

            NodoA a1 = d1.getLa().getP();
            while (a1 != null) {
                if (a1.getCodGuia().equals(codGuia)) {
                    cont++;
                }
                a1 = a1.getSig();
            }
        }
        return cont;
    }    

    
    private static void SolucionC(PilaPaquetesTuristicos p, LDobleDT d, int n) {
        PilaPaquetesTuristicos aux = new PilaPaquetesTuristicos();
        int cont = 0;
        while (!p.esvacia()) {
            PaqueteTuristico x = p.eliminar();
            if (esPrecioMayorA(x.getCodDestino(), d, n)) {
                cont++;
            }
            aux.adicionar(x);
        }
        p.vaciar(aux);
        System.out.println("Paquetes con precio mayor a 800 es:" + cont);
    }

    private static boolean esPrecioMayorA(String codDestino, LDobleDT d, int n) {
        NodoD d1 = d.getP();
        while (d1 != null) {
            if (d1.getCodDestino().equals(codDestino) && d1.getCosto() > n) {
                return true;
            }
            d1 = d1.getSig();
        }
        return false;
    }

}
