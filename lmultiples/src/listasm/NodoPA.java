package listasm;

public class NodoPA {

    private int idTipo, idRango, nroVehiculos;
    private NodoPA ant, sig;

    NodoPA() {
        ant = sig = null;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdRango() {
        return idRango;
    }

    public void setIdRango(int idRango) {
        this.idRango = idRango;
    }

    public int getNroVehiculos() {
        return nroVehiculos;
    }

    public void setNroVehiculos(int nroVehiculos) {
        this.nroVehiculos = nroVehiculos;
    }

    public NodoPA getAnt() {
        return ant;
    }

    public void setAnt(NodoPA ant) {
        this.ant = ant;
    }

    public NodoPA getSig() {
        return sig;
    }

    public void setSig(NodoPA sig) {
        this.sig = sig;
    }

}
