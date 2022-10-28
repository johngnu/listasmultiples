package Eje_2_;

public class Main {

    public static void main(String[] args) {
        LSimpleA a = new LSimpleA();
        a.leer2();
        a.mostrar();
        //a) Mostrar las mascotas que fueron atendidas en la fecha X (dd/mm/aaaa)
//		SolucionA(a,"25/08/2020");
        //b) Verificar si en el a�o X, mascotas tipo X fueron atendidos en todos
        //los meses.
        SolucionB(a, "2020", "gato");

        //PARTICIPACION_4
        //c) Mostrar la fecha (dd/mm/aaaa) en que fueron atendidas mascotas de tipo X
        // puntaje (0.5)
    }

    private static void SolucionB(LSimpleA a, String anioX, String tipoY) {
        NodoA a1 = a.getP();
        boolean sw = false;
        while (a1 != null) {
            if (a1.getAnio().equals(anioX) && VerificaTipoMascota(a1.getM(), tipoY)) {
                sw = true;
            }
            a1 = a1.getSig();
        }
        if (sw) {
            System.out.println("SI se atendieron en todos los meses del año '" + anioX + "' mascotas tipo '" + tipoY + "'");
        } else {
            System.out.println("NO se atendieron en todos los meses del año '" + anioX + "' mascotas tipo '" + tipoY + "'");
        }
    }

    private static boolean VerificaTipoMascota(LSimpleM m, String tipoY) {
        NodoM m1 = m.getP();
        while (m1 != null) {
            if (!VerificaTipo_DiasAtencion(m1.getD(), tipoY)) {
                return false;
            }
            m1 = m1.getSig();
        }
        return true;
    }

    private static boolean VerificaTipo_DiasAtencion(LSimpleD d, String tipoY) {
        NodoD d1 = d.getP();
        while (d1 != null) {
            if (d1.getA().getTipo().equals(tipoY)) {
                return true;
            }
            d1 = d1.getSig();
        }
        return false;
    }

    private static void SolucionA(LSimpleA a, String fechaX) {
//		dd/mm/aaaa
//		0123456789 sub
        NodoA a1 = a.getP();
        String fec = "";
        while (a1 != null) {
            fec = fec + a1.getAnio();
            RecorridoMeses(a1.getM(), fechaX, fec);
            fec = "";
            a1 = a1.getSig();
        }
    }

    private static void RecorridoMeses(LSimpleM m, String fechaX, String fec) {
        NodoM m1 = m.getP();
        String aux = fec;
        while (m1 != null) {
            fec = m1.getMes() + "/" + fec;
            Recorrido_DiasAtencion(m1.getD(), fechaX, fec);
            fec = aux;
            m1 = m1.getSig();
        }
    }

    private static void Recorrido_DiasAtencion(LSimpleD d, String fechaX, String fec) {
        NodoD d1 = d.getP();
        String aux = fec;
        while (d1 != null) {
            fec = d1.getA().getDia() + "/" + fec;
//			System.out.println(fec);
            if (fec.equals(fechaX)) {
                System.out.println(d1.getA().getNombre());
            }
            fec = aux;
            d1 = d1.getSig();
        }
    }
}
