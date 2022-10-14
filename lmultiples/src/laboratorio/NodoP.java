package laboratorio;

public class NodoP {

    private String nombre;
    private int precio;
    private NodoP ant, sig;

    NodoP() {
        ant = sig = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public NodoP getAnt() {
        return ant;
    }

    public void setAnt(NodoP ant) {
        this.ant = ant;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }

}
