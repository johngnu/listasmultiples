package listasm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Principal {

    public static void main(String[] args) {

        LinkedList<TipoVehiculo> tv = new LinkedList<>();
        tv.add(new TipoVehiculo(0, "t1"));
        tv.add(new TipoVehiculo(1, "t2"));

        ArrayList<RangoModelo> rm = new ArrayList<>();
        rm.add(new RangoModelo(0, "r1"));
        rm.add(new RangoModelo(1, "r2"));

    }

    public void mostrarLinkedList(LinkedList<TipoVehiculo> tv) {
        ListIterator<TipoVehiculo> e1 = tv.listIterator();
        while (e1.hasNext()) {
            TipoVehiculo elem = e1.next();
            //elem.mostrar();
        }
    }

    public void mostrarArrayList(ArrayList<RangoModelo> rm) {
        ListIterator<RangoModelo> e1 = rm.listIterator();
        while (e1.hasNext()) {
            RangoModelo elem = e1.next();
            //elem.mostrar();
        }
    }

}
