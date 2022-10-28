package temperatura;

public class Main {

    public static void main(String[] args) {
        LSimpleE e = new LSimpleE();
        e.leer2();
        e.mostrar();
        //a) Mostrar la mayor Precipitacion Pluvial que se presento el mes de 
        //Abril en cada ciudad.
//		SolucionA(e);
        //b) Mostrar los pronosticos de El Alto y de La Paz del mes X, donde se 
        //presento fuertes vientos
        SolucionB(e, "octubre");

    }

    private static void SolucionB(LSimpleE e, String mesX) {
        NodoE e1 = e.getP();
        while (e1 != null) {
            if (e1.getCiudad().equals("La Paz")) {
                System.out.println("Ciudad Lap Paz");
                RecorrerMes_X(e1.getM(), mesX);
            }
            if (e1.getCiudad().equals("El Alto")) {
                System.out.println("Ciudad El Alto");
                RecorrerMes_X(e1.getM(), mesX);
            }
            e1 = e1.getSig();
        }
    }

    private static void RecorrerMes_X(LSimpleM m, Object mesX) {
        NodoM m1 = m.getP();
        while (m1 != null) {
            if (m1.getMes().equals(mesX)) {
                MostrarPronosticos(m1.getP());
            }
            m1 = m1.getSig();
        }
    }

    private static void MostrarPronosticos(LSimpleP p) {
        NodoP p1 = p.getP();
        while (p1 != null) {
            if (p1.getP().getVelVieento() >= 39 && p1.getP().getVelVieento() <= 88) {
                p1.getP().mostrar();
            }
            p1 = p1.getSig();
        }
    }

    private static void SolucionA(LSimpleE e) {
        NodoE e1 = e.getP();
        while (e1 != null) {
            System.out.print("Ciudad: " + e1.getCiudad() + " Mayor precipitacion: ");
            RecorrerMeses(e1.getM());
            System.out.println();
            e1 = e1.getSig();
        }
    }

    private static void RecorrerMeses(LSimpleM m) {
        NodoM m1 = m.getP();
        boolean sw = false;
        while (m1 != null) {
            if (m1.getMes().equals("enero")) {
                MostrarMayorPrecipitacion(m1.getP());
                sw = true;
            }
            m1 = m1.getSig();
        }
        if (!sw) {
            System.out.println("El mes no se encuentra");
        }
    }

    private static void MostrarMayorPrecipitacion(LSimpleP p) {
        NodoP p1 = p.getP();
        int may = 0;
        while (p1 != null) {
            if (p1.getP().getPrecipitacion() > may) {
                may = p1.getP().getPrecipitacion();
            }
            p1 = p1.getSig();
        }
        System.out.println(may);
    }
}
