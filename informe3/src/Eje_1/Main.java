package Eje_1;

public class Main {

    public static void main(String[] args) {
        CSimpleSucursales s = new CSimpleSucursales();
        s.llenar2();
        s.mostrar();
        //a. De cada sucursal mostrar al empleado que realizo mas ventas durante
        //el mes.
//		SolucionA(s);
        //b. Del cliente con ci X mostrar el total gastado en sus compras realizadas
        //en cada una de las sucursales.
        SolucionB(s, "333");
    }

    private static void SolucionB(CSimpleSucursales s, String ciX) {
        CSimpleSucursales aux = new CSimpleSucursales();
        while (!s.esvacia()) {
            Sucursal x = s.eliminar();
            System.out.print("Sucursal: " + x.getNombre());
            MostrarTotalComprasCliente_X(x.getD(), ciX);
            aux.adicionar(x);
        }
        s.vaciar(aux);
    }

    private static void MostrarTotalComprasCliente_X(LSimpleD d, String ciX) {
        NodoD d1 = d.getP();
        int acum = 0;
        while (d1 != null) {
            NodoV v1 = d1.getV().getP();
            while (v1 != null) {
                if (v1.getCi().equals(ciX)) {
                    acum = acum + SumadorTotalDeProductos(v1.getP().getP());
                }
                v1 = v1.getSig();
            }
            d1 = d1.getSig();
        }
        System.out.println(" Total: " + acum);
    }

    private static int SumadorTotalDeProductos(NodoP p) {
        int sum = 0;
        while (p != null) {
            sum = sum + p.getPrecio() * p.getCantidad();
            p = p.getSig();
        }
        return sum;
    }

    private static void SolucionA(CSimpleSucursales s) {
        CSimpleSucursales aux = new CSimpleSucursales();
        while (!s.esvacia()) {
            Sucursal x = s.eliminar();
            //Proceso
            System.out.println("Sucursal: " + x.getNombre());
            MostrarMayorEmpleado(x.getE(), x.getD());
            aux.adicionar(x);
        }
        s.vaciar(aux);
    }

    private static void MostrarMayorEmpleado(LSimpleE e, LSimpleD d) {
        NodoE e1 = e.getP();
        //Se halla la mayor cantidad de ventas que realizo un empleado
        int may = MayorCantidad_DeVEntas(e, d);
        while (e1 != null) {
            //Se compara con el mayor de cada empleado, si es igual mostramos al empleado
            if (ContadorDeVentasPorEmpleado(e1.getCodEmpleado(), d) == may) {
                e1.mostrar();
            }
            e1 = e1.getSig();
        }
    }

    private static int MayorCantidad_DeVEntas(LSimpleE e, LSimpleD d) {
        NodoE e1 = e.getP();
        int may = 0;
        while (e1 != null) {
            if (ContadorDeVentasPorEmpleado(e1.getCodEmpleado(), d) > may) {
                may = ContadorDeVentasPorEmpleado(e1.getCodEmpleado(), d);
            }
            e1 = e1.getSig();
        }
        return may;
    }

    private static int ContadorDeVentasPorEmpleado(String codEmpleado, LSimpleD d) {
        NodoD d1 = d.getP();
        int cont = 0;
        while (d1 != null) {
            NodoV e1 = d1.getV().getP();
            while (e1 != null) {
                if (e1.getCodEmpleado().equals(codEmpleado)) {
                    cont++;
                }
                e1 = e1.getSig();
            }
            d1 = d1.getSig();
        }
        return cont;
    }
}
