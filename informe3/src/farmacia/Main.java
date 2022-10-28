package farmacia;

public class Main {

    public static void main(String[] args) {
        LDobleF fa = new LDobleF();
        fa.leer();
        fa.mostrar();
        //a) Mostrar los medicamentos con stock agotado (=0) de cada farmacia.
        SolucionA(fa);
        //b) Mostrar los medicamentos de la marca X de la farmacia Y
//		SolucionB(f,"Bolivia","cofar");
        //c) Eliminar los medicamentos con stock agotado de todas las farmacias.
//		SolucionC(f);

        //PARTICIPACION_4
        //d) De cada farmacia ordenar(asc o des) la lista de medicamentos segun la cantidad de stock
        // puntaje (0.5)
        //EJERCICIOS EXTRA 
        fa.mostrar();
        //1. Agregar un medicamento a la farmacia Y (Adifinal)
//		Solucion1(f,"Bolivia");
        //2. Mostrar el nombre de la farmacia que tiene medicamentos de marca Y (Recorrido - Verificacion )
//		Solucion2(f,"cofar");
        //3. Adicionar un medicamento en la i-esima posicion(Antes) de la farmacia X (Recorrido - Verificacion-Adicionar)
//		Solucion3(f,5,"Cruz Mar");
        //4. Adicionar un medicamento despues de la i-esima posicion de la farmacia X (Recorrido - Verificacion-Adicionar)
//		Solucion4(f,1,"Cruz Mar");
//		f.mostrar();
    }

    private static void Solucion4(LDobleF f, int esimo, String nomX) {
        NodoF f1 = f.getP();
        while (f1 != null) {
            if (f1.getF().getNombre().equals(nomX)) {
                AnadirMedicamento_DespuesDePosicion(f1.getF().getM(), esimo);
            }
            f1 = f1.getSig();
        }
    }

    private static void AnadirMedicamento_DespuesDePosicion(LSimpleM m, int esimo) {
        if (esimo <= m.nroNodos()) {
            Medicamento med = new Medicamento("----", "-----", 0);
            NodoM nuevo = new NodoM(med);
            NodoM m1 = m.getP();
            for (int i = 1; i < esimo; i++) {
                m1 = m1.getSig();
            }
            nuevo.setSig(m1.getSig());
            m1.setSig(nuevo);
        } else {
            System.out.println("indice incorrecto");
        }
    }

    private static void Solucion3(LDobleF f, int esimo, String nomX) {
        NodoF f1 = f.getP();
        while (f1 != null) {
            if (f1.getF().getNombre().equals(nomX)) {
                AnadirMedicamento_AntesDePosicion(f1.getF().getM(), esimo);
            }
            f1 = f1.getSig();
        }
    }

    private static void AnadirMedicamento_AntesDePosicion(LSimpleM m, int esimo) {
        Medicamento med = new Medicamento("----", "-----", 0);
        NodoM nuevo = new NodoM(med);
        //si corresponde una adicion al principio
        if (esimo == 1) {
            //AdiPrincipio
            nuevo.setSig(m.getP());
            m.setP(nuevo);
        } else {
            // m.nroNodos()+1 -> puede pasar el limite si se adiciona en la posicion (antes) 
            if (esimo <= m.nroNodos() + 1) {
                //estas en el nodo principal
                NodoM m1 = m.getP();

                for (int i = 0; i < esimo - 2; i++) {
                    m1 = m1.getSig();
                }
                nuevo.setSig(m1.getSig());
                m1.setSig(nuevo);
            } else {
                System.out.println("Indice fuera de rango");
            }
        }
    }

    private static void Solucion2(LDobleF f, String marcaY) {
        NodoF f1 = f.getP();
        while (f1 != null) {
            if (VerificaMarcaY(f1.getF().getM(), marcaY)) {
                System.out.println(f1.getF().getNombre());
            }
            f1 = f1.getSig();
        }
    }

    private static boolean VerificaMarcaY(LSimpleM m, String marcaY) {
        NodoM m1 = m.getP();
        while (m1 != null) {
            if (m1.getM().getMarca().equals(marcaY)) {
                return true;
            }
            m1 = m1.getSig();
        }
        return false;
    }

    private static void Solucion1(LDobleF f, String nomX) {
        Medicamento nuevo = new Medicamento("+++++", "+++++", 0);
        NodoF f1 = f.getP();
        while (f1 != null) {
            if (f1.getF().getNombre().equals(nomX)) {
                f1.getF().getM().adiFinal(nuevo);
            }
            f1 = f1.getSig();
        }
    }
    // ****************************************
    private static void SolucionC(LDobleF f) {
        NodoF f1 = f.getP();
        while (f1 != null) {
            eliminaMedicamentos(f1.getF().getM());
            f1 = f1.getSig();
        }
    }

    private static void eliminaMedicamentos(LSimpleM m) {
        NodoM m1 = m.getP();
        while (m1 != null) {
            if (m1.getM().getStock() == 0) {
                if (m1 == m.getP()) {
                    m.setP(m1.getSig());
                } else {
                    NodoM m2 = m.getP();
                    while (m2.getSig() != m1) {
                        m2 = m2.getSig();
                    }
                    m2.setSig(m1.getSig());
                }
            }
            m1 = m1.getSig();
        }
    }

    private static void SolucionB(LDobleF f, String x, String m) {
        System.out.println("Medicamentos de la farmacia '" + x + "' y de marca '" + m + "'");
        NodoF f1 = f.getP();
        while (f1 != null) {
            if (f1.getF().getNombre().equals(x)) {
                mostrarMedicamentosTipo(f1.getF().getM(), m);
            }
            f1 = f1.getSig();
        }
    }

    private static void mostrarMedicamentosTipo(LSimpleM m, String marcaY) {
        NodoM m1 = m.getP();
        while (m1 != null) {
            if (m1.getM().getMarca().equals(marcaY)) {
                m1.getM().mostrar();
            }
            m1 = m1.getSig();
        }
    }

    private static void SolucionA(LDobleF f) {
        System.out.println("Farmacias con medicamentos agotados");
        NodoF f1 = f.getP();
        while (f1 != null) {
            System.out.println("Farmacia: " + f1.getF().getNombre());
            medicamentosAgotados(f1.getF().getM());
            f1 = f1.getSig();
        }
    }

    private static void medicamentosAgotados(LSimpleM m) {
        NodoM m1 = m.getP();
        boolean sw = false;
        while (m1 != null) {
            if (m1.getM().getStock() == 0) {
                System.out.println(m1.getM().getNombre());
                sw = true;
            }
            m1 = m1.getSig();
        }
        if (!sw) {
            System.out.println("NO HAY MEDICAMENTOS AGOTADOS");
        }
    }
    // ****************************************
}
